package cn.tedu._05mvcboot01.pojo.dto;

public class UpdateDTO {
    private String title;
    private Integer price;
    private Integer number;

    @Override
    public String toString() {
        return "UpdateDTO{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", number=" + number +
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

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
