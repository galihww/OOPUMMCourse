package interfaceAbstract;

public interface InterfaceBankAccout {
    public final String BANKNAME = "Bank UMM";
//    int defBalance = 10000;

    public void deposit(int amount);
    public void withdraw(int amount);
    public int getBalance();
    public String getBankName();
}
