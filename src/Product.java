public class Product {
    int id;
    String name;

    //called function
    public static void display(Product x){
        System.out.println(x.id);
        System.out.println(x.name);
        x.name = "abc";

        }

        //calling function
        public static void main(String[]args){

        Product p = new Product();
        p.id = 111;
        p.name = "mobile";
        display(p);

        Product p1 = new Product();
        p1.id = 112;
        p1.name = "laptop";
        display(p1);

        System.out.println(p.name);
        System.out.println(p1.name);

    }
}
