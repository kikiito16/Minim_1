import java.util.List;

public class ElCliente {

    public static void main(String[] args) {
        ProductManager pm= new ProductManagerImpl();


        List<Product> list1=pm.getProductByPrize();
        List<Product> list2=pm.getProductBySales();
    }
}
