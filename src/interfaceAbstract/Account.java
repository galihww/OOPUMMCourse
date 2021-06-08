package interfaceAbstract;

public class Account extends MethodPayment implements InterfaceBankAccout {
    private int amount = 0;
    private String bankName = "BXI";
    @Override
    public void deposit(int amount) {
        if(amount<50000){
            System.out.println("saldo kurang dari ketentuan");
        }else{
            this.amount += amount;
            System.out.println("saldo anda sekarang"+amount);
        }
    }

    @Override
    public void withdraw(int amount) {

    }

    @Override
    public int getBalance() {
        return 0;
    }

    @Override
    public String getBankName() {
        return this.bankName;
    }

    @Override
    public String getAccountNum(String accountNum) {
        return null;
    }
}
