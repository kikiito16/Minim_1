package main;

import main.Order;

import java.util.List;
import java.util.ArrayList;

public class User {
    private  String ID_usu;
    private List<Order> orders_done= new ArrayList <Order>();
    public List<Order> orders = new ArrayList <Order>();

    public User (String nombre)
    {
        this.ID_usu=nombre;
    }

    public void addOrder (Order order)
    {
        orders.add(order);
    }

    public void addOrderDone (Order order)
    {
        orders_done.add(order);
    }

    public List<Order> getListOrders()
    {
        return orders;
    }

    public void setListOrders (List <Order> orders)
    {
        this.orders=orders;
    }

    public String getID()
    {
        return ID_usu;
    }

    public void setID_usu (String ID)
    {
        this.ID_usu=ID;
    }

    public List<Order> getOrdersDone() {
        return orders_done;
    }

    public void setListOrdersDone (List <Order> ordersDone)
    {
        this.orders_done=ordersDone;
    }
}
