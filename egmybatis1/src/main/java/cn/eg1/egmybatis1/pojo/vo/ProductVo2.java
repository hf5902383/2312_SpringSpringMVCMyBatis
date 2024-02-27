package cn.eg1.egmybatis1.pojo.vo;

public class ProductVo2 {
    private String title;
    private Integer stock;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "ProductVo2{" +
                "title='" + title + '\'' +
                ", stock=" + stock +
                '}';
    }
}
