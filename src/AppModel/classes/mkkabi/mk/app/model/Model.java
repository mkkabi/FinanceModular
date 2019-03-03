package mkkabi.mk.app.model;

import java.io.IOException;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.util.*;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import mk.mkkabi.clients.WebClient1;
import mkkabi.mk.account.Account;
import mkkabi.mk.account.Source;
import mkkabi.mk.account.Transaction;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Model {

    public static final Logger LOGGER = Logger.getLogger(Model.class.getName());
    private static FileHandler fileHandler;
    private static Handler consoleHandler;

    static {
        consoleHandler = new ConsoleHandler();
        try {
            fileHandler = new FileHandler("log.txt");
        } catch (IOException ex) {
            Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SecurityException ex) {
            Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Assigning handlers to LOGGER object
        LOGGER.addHandler(consoleHandler);
        LOGGER.addHandler(fileHandler);
        //Setting levels to handlers and LOGGER
        consoleHandler.setLevel(Level.ALL);
        fileHandler.setLevel(Level.ALL);
        LOGGER.setLevel(Level.ALL);
    }

    public void createAccount(String name, double startingBalance) {
        Account acc = new Account(name, startingBalance);
    }

    public List<Account> getAllAccounts() {
        return Account.getAccounts();
    }

    public void createTransactionSource(String name) {
        Source src = new Source(name);
    }

    public void makeTransaction(Account acc, String description, double amount, Source source) {
        Transaction tr = new Transaction(acc, LocalDateTime.now(), amount, description, source);
    }

    public List<Source> getTransactionSources() {
        return Source.getSources();
    }

    public Transaction createTransactionFromJSON(Account account) {
        WebClient1 webClient = new WebClient1();
        Transaction transaction = null;
        Object obj = null;
        try {
            obj = new JSONParser().parse(WebClient1.getAllTransactions("http://mkkabi.mk.ua/api/transaction/read.php"));
        } catch (IOException ex) {
            Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
        } catch (org.json.simple.parser.ParseException ex) {
            Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
        }

        JSONObject jo = (JSONObject) Objects.requireNonNull(obj);
        JSONArray ja = (JSONArray) jo.get("records");
        Iterator itr2 = ja.iterator();
        
        while (itr2.hasNext()) {
            Object obj2 = itr2.next();
            JSONObject jo2 = (JSONObject) obj2;

             LocalDateTime date = LocalDateTime.parse((String)jo2.get("date"));
            double amount = Double.parseDouble((String) jo2.get("amount"));
            String comment = (String) jo2.get("comment");
            String category = (String) jo2.get("category");
            //transaction = new Transaction(account, date, amount, comment, category);
            LOGGER.log(Level.SEVERE, "test message from mainPaneBase");
        }
        
        return null;
    }
    
    

    public void json(Account acc, LocalDateTime date, double amount, String comment, Source source) throws IOException {
        Runnable r = () -> {
            Transaction transaction = new Transaction(acc, date, amount, comment, source);
            WebClient1 webClient = new WebClient1();

            Object obj = null;
            try {
                obj = new JSONParser().parse(WebClient1.getAllTransactions("http://mkkabi.mk.ua/api/transaction/read.php"));
            } catch (IOException ex) {
                Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
            } catch (org.json.simple.parser.ParseException ex) {
                Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
            }

            JSONObject jo = (JSONObject) Objects.requireNonNull(obj);
            JSONArray ja = (JSONArray) jo.get("records");
            Iterator itr2 = ja.iterator();
            StringBuffer sb = new StringBuffer();
            while (itr2.hasNext()) {
                Object obj2 = itr2.next();
                JSONObject jo2 = (JSONObject) obj2;
                String description = (String) jo2.get("description");
                sb.append(description);
                sb.append("\n");

                System.out.println(description);
                LOGGER.log(Level.SEVERE, "test message from mainPaneBase");
            }
        };
        Thread t = new Thread(r, "Json parser");
        t.start();
    }

}
