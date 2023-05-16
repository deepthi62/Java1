package Functions;

class Product{
    int id;
    String name;
    float price;
}

public class CallByReference {
    public static void main(String[]args){
        Product p = new Product();
        p.id = 111;
        p.name = "apple";
        p.price = 50.2f;
        printproduct(p);

        ChangeProductValues(p);
        printproduct(p);

        makeProductNull(p);
        printproduct(p);

    }

    public static void printproduct(Product pro){
        System.out.println("Product: " + pro.id + " " + pro.name + " " + pro.price);

    }
    public static void ChangeProductValues(Product pro){
        pro.id = 12;
        pro.price = 12.002f;

    }
    public static void makeProductNull(Product pro){

        pro = null;
    }
}
