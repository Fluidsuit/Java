public class Product {
    private int id;
    private String title;
    private float price;

    public Product() {
        id = -1;
        title = null;
        price = 0;
    }

    public Product(int id, String title, float price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public void display() {
        System.out.println(id + " " + title + " " + price);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void init(int id, String title, float price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }
}
