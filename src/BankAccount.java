public class BankAccount {
    private String accountHolder;
    private String accountNo;
    private long accountBalance;
    public void setAccountHolder(String accountHolder){
        this.accountHolder = accountHolder;
    }
    public void setAccountNo(String accountNo){
        this.accountNo=accountNo;
    }
    public void setAccountBalance(long accountBalance){
        this.accountBalance = accountBalance;
    }
    public String getAccountHolder(){
        return this.accountHolder;
    }
    public String getAccountNo(){
        return this.accountNo;
    }
    public long getAccountBalance(){
        return this.accountBalance;
    }
    public void deposit(long depositAmount){
        this.accountBalance +=depositAmount;
    }
    public void withdraw(long withdrawAmount){
        try{
        this.accountBalance -= withdrawAmount;}
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
