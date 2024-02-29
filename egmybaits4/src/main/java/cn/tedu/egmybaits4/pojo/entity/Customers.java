package cn.tedu.egmybaits4.pojo.entity;

public class Customers {
    private String custId;
    private String custTel;
    private String custName;
    private String city;

    @Override
    public String toString() {
        return "Customers{" +
                "custId='" + custId + '\'' +
                ", custTel='" + custTel + '\'' +
                ", custName='" + custName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getCustTel() {
        return custTel;
    }

    public void setCustTel(String custTel) {
        this.custTel = custTel;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
