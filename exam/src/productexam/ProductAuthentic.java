package productexam;

public class ProductAuthentic extends Product{
    private String time;

    public ProductAuthentic() {
    }

    public ProductAuthentic(int id, String name, int price, String brand, String time) {
        super(id, name, price, brand);
        this.time = time;
    }

    public ProductAuthentic(String string, String string1, String string2, String string3) {
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
