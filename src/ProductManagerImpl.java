import java.util.Collections;
import java.util.LinkedList;
import java.util.HashMap;

public class ProductManagerImpl implements ProductManager{

    HashMap<String, User> users;
    protected HashMap<String, Integer> productos = new HashMap<String, Integer>();
    productos.put ("Coca-cola", 2);
    productos.put ("Lays", 1);
    productos.put ("Queso", 3);

    Queue<Order> pendingOrders;
    List<productos> productList;
    String, int;
    protected HashMap<String, Integer> productos = new HashMap<String, Integer>();
    productos.put ("Coca-cola", 2);
    productos.put ("Lays", 1);
    productos.put ("Queso", 3);

    public List<productos> getProductByPrize() {
        //Arrays.sort();
        Collections.sort(productos);
        return null;
    }

    @Override
    public void newOrder(Order o) {
        //BBDD
    }

    @Override
    public Order processOrder() {
        return null;
    }

    @Override
    public List<Order> getOrdersByUser(String idUser) {
        List<Product> l = new LinkedList<>();
        l.add(new Product("coca-cola"));
        return l;
    }

    @Override
    public List<Product> getProductBySales() {
        return null;
    }

}
}
