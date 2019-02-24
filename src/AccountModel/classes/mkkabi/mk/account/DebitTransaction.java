package mkkabi.mk.account;

import java.time.LocalDateTime;

public class DebitTransaction extends Transaction{
    
    public DebitTransaction(Account acc, LocalDateTime date, double amount, String comment, Source source) {
        super(acc, date, amount, comment, source);
    }
    
}
