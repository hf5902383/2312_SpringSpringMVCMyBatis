package cn.tedu.egmybaits4.pojo.vo;

import cn.tedu.egmybaits4.pojo.entity.Orders;

import java.util.List;

public class CustomeVo2 {
    private String city;
    private String custName;
    private List<Orders> ordersList;

    public List<Orders> getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(List<Orders> ordersList) {
        this.ordersList = ordersList;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }


    @Override
    public String toString() {
        return "CustomeVo2{" +
                "city='" + city + '\'' +
                ", custName='" + custName + '\'' +
                "\n" +
                '}';
    }
}
