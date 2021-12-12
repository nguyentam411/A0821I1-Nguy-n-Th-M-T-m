package productexam.model;

public class ProductAuthentic extends Product {
    private String time;

    public ProductAuthentic() {
    }

    public ProductAuthentic(int id, String name, int price, String brand, String time) {
        super(id, name, price, brand);
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return super.toString()+","+getTime();
    }
}
