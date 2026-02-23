public class Product implements Comparable {
    private int id;
    private String title;
    private int price;

    public Product(int id, String title, int price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public int compareTo(Object o) {
        Product p = (Product) o;
        if(this.price > p.price) {
            return 1;
        }
        if(this.price < p.price) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
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
}


class ProductComparatorByPrice implements Comparator<Product> {
    public int compare(Product p1, Product p2) {
        if(p1.getPrice() > p2.getPrice()) {
            return -1;
        }
        if(p1.getPrice() < p2.getPrice()) {
            return 1;
        }
        return 0;
    }
}