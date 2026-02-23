import java.io.*;

public class Product implements Externalizable {
    private int id;
    private String title;
    private int price;
    private String imageUrl;

    public Product() {
        System.out.println("Product() " + hashCode());
    }

    public Product(int id, String title, int price, String imageUrl) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        System.out.println("Inside WE: ");
        System.out.println("this (ref to Product): " + this.hashCode());
        System.out.println("out (ref to OOS): " + out.hashCode());
        //write only those members to out which you want to serialize
        out.writeInt(id);
        out.writeUTF(title);
        out.writeInt(price);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

        System.out.println("Inside re: ");
        System.out.println("Product: " + this.hashCode());
        System.out.println("in: " + in.hashCode());
        System.out.println();

        this.id = in.readInt();
        this.title = in.readUTF();
        this.price = in.readInt();
        this.imageUrl = null;
    }
}
