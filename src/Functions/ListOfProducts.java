package Functions;

import java.util.Arrays;
import java.util.Scanner;

import static com.sun.org.apache.xml.internal.serializer.Version.getProduct;

public class ListOfProducts {

    public static void main(String[]args){
    Product products[] = new Product[2];

    Product pro = new Product();
    pro.id = 2;
    pro.name = "nokia";
    pro.price = 700.50f;

        Product pro1 = new Product();
        pro1.id = 3;
        pro1.name = "samsung";
        pro1.price = 9000.50f;

        products[0] = pro;
        products[1] = pro1;

        printProducts(products);

        products = getProducts();
       printProducts(products);
    }

       private static Product[] getProducts() {

           Product products[] = new Product[2];
           Scanner sc = new Scanner(System.in);
           for(int i=0;i<2;i++){
               System.out.println("Enter product id: ");
               int ProductId = sc.nextInt();
               System.out.println("Enter product name: ");
               String Productname = sc.next();
               System.out.println("Enter product price: ");
               float Productprice = sc.nextFloat();

               Product pro = new Product();

               pro.id = ProductId;
               pro.name = Productname;
               pro.price = Productprice;
               products[i] = pro;
           }

           return  products;
       }

    public static void printProducts(Product[] products){
        for(int index = 0;index< products.length;index++){
            System.out.println(products[index].id + " " + products[index].name + " " + products[index].price);
        }
    }

}
