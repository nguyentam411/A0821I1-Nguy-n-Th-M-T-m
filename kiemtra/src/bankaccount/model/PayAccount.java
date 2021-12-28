package bankaccount.model;

public class PayAccount extends BankAccount {
    private int soThe;
    private int amount;

    public PayAccount(int id, int code, String name, String date, int soThe, int amount) {
        super(id, code, name, date);
        this.soThe = soThe;
        this.amount = amount;
    }

    public int getSoThe() {
        return soThe;
    }

    public void setSoThe(int soThe) {
        this.soThe = soThe;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return super.toString()+","+getSoThe()+","+getAmount();
    }
}
