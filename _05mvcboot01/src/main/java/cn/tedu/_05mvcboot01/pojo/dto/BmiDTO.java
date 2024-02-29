package cn.tedu._05mvcboot01.pojo.dto;

public class BmiDTO {
    private Double weight;
    private Double high;

    @Override
    public String toString() {
        return "BmiDTO{" +
                "weight=" + weight +
                ", high=" + high +
                '}';
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getHigh() {
        return high;
    }

    public void setHigh(Double high) {
        this.high = high;
    }
}
