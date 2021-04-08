public class Product {
   String nombre_producto;
   double precio;

   public Product (String nombre_producto, double precio){
      this.nombre_producto = nombre_producto;
      this.precio = precio;
   }
   public String toString () {
      return nombre_producto + " " + precio;
   }
}
