package productexam;

public class HandGoods extends Product{
    private String country;
    private String status;

    public HandGoods() {
    }

    public HandGoods(int id, String name, int price, String brand, String country, String status) {
        super(id, name, price, brand);
        this.country = country;
        this.status = status;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return super.toString()+","+getCountry()+","+getStatus();
    }
}
