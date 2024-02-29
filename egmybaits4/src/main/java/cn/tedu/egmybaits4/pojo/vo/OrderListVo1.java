package cn.tedu.egmybaits4.pojo.vo;

import cn.tedu.egmybaits4.pojo.entity.Orders;

import java.util.List;

public class OrderListVo1 {
    private String custId;
    private String custName;
    private List<Orders> ordersList;

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

    public List<Orders> getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(List<Orders> ordersList) {
        this.ordersList = ordersList;
    }

    @Override
    public String toString() {
        return "OrderListVo1{" +
                "custId='" + custId + '\'' +
                ", custName='" + custName + '\'' +
                ", ordersList=" + ordersList +
                '}';
    }
}
