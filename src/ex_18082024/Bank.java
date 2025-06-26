package ex_18082024;

public class Bank {
    public Bank(String currency, Integer amount) {
        Currency = currency;
        Amount = amount;
    }

    public Integer getAmount() {
        return Amount;
    }

    public void setAmount(Integer amount) {
        Amount = amount;
    }

    public String getCurrency() {
        return Currency;
    }

    public void setCurrency(String currency) {
        Currency = currency;
    }

    public String Currency;
    public Integer Amount;


    public Integer add(Bank bankName) throws Exception {
        if(!bankName.Currency.equalsIgnoreCase("INR")){
            throw new Exception("currency does not match");
        }
        Integer sum= this.Amount+bankName.Amount;
        return sum;

    }



}
