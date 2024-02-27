package fanghou.email.egmybatis3.pojo.vo;

public class ProductVo1 {
    private String title;
    private double price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ProductVo1{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
