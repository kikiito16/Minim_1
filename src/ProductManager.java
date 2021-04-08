import java.util.List;

public interface ProductManager {

    public List<Product> getProductByPrize();
    public void newOrder(Order o);
    public Order processOrder();
    public List<Order> getOrdersByUser(String idUser);
    public List<Product> getProductBySales();
    public void productonuevo (String nombre_producto, double precio);

}