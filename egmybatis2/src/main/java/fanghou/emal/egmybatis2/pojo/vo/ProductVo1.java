package fanghou.emal.egmybatis2.pojo.vo;

public class ProductVo1 {
    private String title;
    private Integer price;

    @Override
    public String toString() {
        return "ProductVo1{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
