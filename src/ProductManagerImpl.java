/*import java.util.Collections;
import java.util.LinkedList;
import java.util.HashMap;*/
import java.util.*;

public class ProductManagerImpl implements ProductManager{

    HashMap<String, User> users;
    
    /*protected HashMap<String, Integer> Product = new HashMap<String, Integer>();
    productos.put ("Coca-cola", 2);
    productos.put ("Lays", 1);
    productos.put ("Queso", 3);*/

    Queue<Order> pendingOrders;
    List<Product> productList;


    public ProductManagerImpl (){
        this.productList = new LinkedList<>();
    }
    /*
    protected HashMap<String, Integer> productos = new HashMap<String, Integer>();
    productos.put ("Coca-cola", 2);
    productos.put ("Lays", 1);
    productos.put ("Queso", 3);*/

    public List<Product> getProductByPrize() {
        //Arrays.sort();
        Collections.sort(this.productList, new Comparator<Product>() {
            public int compare(Product o1, Product o2) {
                return Double.compare(o2.precio,o1.precio);
            }
        });
        return this.productList;
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
        l.add(new Product("coca-cola",2));
        return l;
    }

    @Override
    public List<Product> getProductBySales() {
        return null;
    }

    @Override
    public void productonuevo(String nombre_producto, double precio) {
        Product p = new Product (nombre_producto precio);
        this.productList.add(p);
    }

    public static void main (String [] args){
        System.out.println("Lista de productos: ");
        ProductManager pm = new ProductManagerImpl();
        pm.productonuevo("Coca-cola", 2);
        pm.productonuevo("Lays",1);
        pm.productonuevo("Queso", 3);

        List<Product> lista = pm.getProductByPrize();
        System.out.println(Arrays.asList(lista.toArray()));
    }

}
}
