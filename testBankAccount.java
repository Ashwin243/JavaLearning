public class testBankAccount {
    private long accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;
//    public long abc=Long.MAX_VALUE;

    public testBankAccount(){
        System.out.println("Test Empty constructor created, Nothing Else");
    }
    public testBankAccount(long accountNumber,double balance,String customerName,String email,String phoneNumber){
        this.accountNumber=accountNumber;
//        this.balance=balance;
        this.balance=balance<0 ? 0:balance;
        this.customerName=customerName;
        this.email=email;
        if(phoneNumber.length()==10){
            this.phoneNumber=phoneNumber;
        }
        else {
            this.phoneNumber="Invalid phone number";
        }
//        this.phoneNumber=phoneNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance) {
//        if(balance<0)this.balance=0;
//        this.balance = balance;
        this.balance=balance<0 ? 0:balance;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhoneNumber(String phoneNumber) {
         //long length = (long)(Math.log10(phoneNumber) + 1);
        if(phoneNumber.length()==10){
            this.phoneNumber=phoneNumber;
        }
        else {
            this.phoneNumber="Invalid phone number";
            //System.out.println("Invalid phone number");
        }
    }
    public long getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        System.out.println("Balance of account "+accountNumber+" = " +balance+" Rs.");
        return balance;
    }
    public String getCustomerName(){
        return customerName;
    }
    public String getEmail(){
        return email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void addFunds(double amount){
        balance+=amount;
        System.out.println("Updated balance after the deposit of "+amount+" = " +balance+" Rs.");
    }
    public void debitAmount(double amount){
        if(amount<=balance){
            balance-=amount;
            System.out.println("Account "+accountNumber+" debited with INR "+amount+" and remaining balance is "+balance);
        }
        else System.out.println("Requested amount for debit "+amount+" is greater than the balance "+balance+" amount");
    }

//    public static void main(String[] args) {
//        testBankAccount account=new testBankAccount();
//        //account.setAccountNumber(123);
//        account.setAccountNumber(1234567890);
//        account.setBalance(10000);
//        account.setCustomerName("Ashwin");
//        account.setEmail("ashwin.abc@gmail.com");
//        account.setPhoneNumber("9686243723");
//    System.out.println("Account holder's Name = "+account.getCustomerName());
//    account.getBalance();
//    account.addFunds(10000);
//    account.debitAmount(30000);
//        //System.out.println(account.abc);
//
//}

}
