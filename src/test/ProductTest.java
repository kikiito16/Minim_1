package test;
import main.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


public class ProductTest {
    ProductManager pm = ProductManagerImpl.getInstance();
    private Order o1;
    private Order o2;
    private Order o3;

    @Before
    public void init(){
        Product product1=new Product("Cocacola",2);
        Product product2=new Product("Lays",1);
        Product product3=new Product("Queso",3);

        pm.addProduct(product1);
        pm.addProduct(product2);
        pm.addProduct(product3);

        User user1= new User("Enric");
        User user2=new User("Estela");

        pm.addUser(user1);
        pm.addUser(user2);

        o1=new Order("Enric");
        o2=new Order("Enric");
        o3= new Order("Estela");

        o1.addProduct("Lays");
        o1.addProduct("Lays");
        o1.addProduct("Lays");

        pm.newOrder(o1);

        o2.addProduct("Queso");
        o2.addProduct("Cocacola");
        o2.addProduct("Lays");

        pm.newOrder(o2);

        o3.addProduct("Cocacola");
        o3.addProduct("Cocacola");
        o3.addProduct("Queso");

        pm.newOrder(o3);

    }

    @After
    public void reset() {
        pm.clear();
    }

    @Test
    public void test1(){
        List<Product> orden = pm.getProductByPrize();
        System.out.println(Arrays.asList(orden.toArray()));
    }

    @Test
    public void test2(){
        User enric= pm.getUser("Enric");
        Assert.assertNotNull(enric);
        Order o4 =pm.processOrder();
        System.out.println(enric.getOrdenes_acabadas());
    }


    @Test
    public void test3(){
        Order o5 =pm.processOrder();
        List <Order> order = pm.getOrdersByUser("Enric");
        System.out.println(Arrays.asList(order.toArray()));
    }


}
