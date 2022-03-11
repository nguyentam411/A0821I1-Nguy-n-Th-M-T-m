package model;

public class Product {
    private int id;
    private String name;
    private float price;
    private int quantity;
    private int colorId;
    private int categoryId;
    public Product(){}

    public Product(int id, String name, float price, int quantity, int colorId, int categoryId) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.colorId = colorId;
        this.categoryId = categoryId;
    }

    public Product(String name, float price, int quantity, int colorId, int categoryId) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.colorId = colorId;
        this.categoryId = categoryId;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getColorId() {
        return colorId;
    }

    public void setColorId(int colorId) {
        this.colorId = colorId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
}