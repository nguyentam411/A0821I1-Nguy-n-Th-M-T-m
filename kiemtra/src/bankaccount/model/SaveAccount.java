package bankaccount.model;

public class SaveAccount extends BankAccount {
    private int amount;
    private String sendDate;
    private int laiSuat;
    private int kiHan;

    public SaveAccount(int id, int code, String name, String date, int amount, String sendDate, int laiSuat, int kiHan) {
        super(id, code, name, date);
        this.amount = amount;
        this.sendDate = sendDate;
        this.laiSuat = laiSuat;
        this.kiHan = kiHan;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getSendDate() {
        return sendDate;
    }

    public void setSendDate(String sendDate) {
        this.sendDate = sendDate;
    }

    public int getLaiSuat() {
        return laiSuat;
    }

    public void setLaiSuat(int laiSuat) {
        this.laiSuat = laiSuat;
    }

    public int getKiHan() {
        return kiHan;
    }

    public void setKiHan(int kiHan) {
        this.kiHan = kiHan;
    }

    @Override
    public String toString() {
        return super.toString()+","+getAmount()+","+getSendDate()+","+getLaiSuat()+","+getKiHan();
    }
}
