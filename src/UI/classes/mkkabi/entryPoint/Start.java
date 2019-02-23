package mkkabi.entryPoint;

import mkkabi.mk.app.model.*;

public class Start {
    public static void main(String[] args) {
        System.out.println("App started");
		  Model model = new Model();
		  
		  model.createAccount("Account 1", 250.00);
		  model.createTransactionSource("fun");
		  model.makeTransaction(model.getAllAccounts().get(0), "description", -120.00, model.getTransactionSources().get(0));
		  
		  System.out.println(model.getAllAccounts());
		  
        
    }
}
