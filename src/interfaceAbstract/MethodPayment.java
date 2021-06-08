package interfaceAbstract;

abstract public class MethodPayment {
    private String accountNum;
    //abstract method
    abstract public String getAccountNum(String accountNum);
    //method
    public void setAccountNum(String accountNum){
        this.accountNum = accountNum;
    }
}
