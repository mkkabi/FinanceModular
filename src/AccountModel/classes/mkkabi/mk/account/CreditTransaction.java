package mkkabi.mk.account;

import java.time.LocalDateTime;

public class CreditTransaction extends Transaction{
    
    public CreditTransaction(Account acc, LocalDateTime date, double amount, String comment, Source source) {
        super(acc, date, amount, comment, source);
    }
    
}
