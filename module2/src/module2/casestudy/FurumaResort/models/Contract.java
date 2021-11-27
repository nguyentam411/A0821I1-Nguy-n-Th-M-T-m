package module2.casestudy.FurumaResort.models;

public class Contract {
    private int idContract;
    private int idBooking;
    private int idCustomer;
    private int deposit;
    private int totalMoney;

    public Contract(int idContract, int idBooking, int idCustomer, int deposit, int totalMoney) {
        this.idContract = idContract;
        this.idBooking = idBooking;
        this.idCustomer = idCustomer;
        this.deposit = deposit;
        this.totalMoney = totalMoney;
    }

    public int getIdContract() {
        return idContract;
    }

    public void setIdContract(int idContract) {
        this.idContract = idContract;
    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public int getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(int totalMoney) {
        this.totalMoney = totalMoney;
    }
}
