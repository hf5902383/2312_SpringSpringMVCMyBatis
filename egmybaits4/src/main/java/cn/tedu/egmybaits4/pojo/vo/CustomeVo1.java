package cn.tedu.egmybaits4.pojo.vo;

public class CustomeVo1 {
    private String custName;
    private String custTel;
    private String custId;

    @Override
    public String toString() {
        return "CustomeVo1{" +
                "custName='" + custName + '\'' +
                ", custTel='" + custTel + '\'' +
                ", custId='" + custId + '\'' +
                '}';
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustTel() {
        return custTel;
    }

    public void setCustTel(String custTel) {
        this.custTel = custTel;
    }
}
