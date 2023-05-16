public class ProductArray {
    int id;
    String name;

    public static ProductArray[] display(ProductArray[] productarr){
        for(ProductArray x : productarr){
            System.out.println(x.id);
            System.out.println(x.name);
        }

        return productarr;
    }

    public static void main(String[]args){
//        int arr[] = new int[4];
        ProductArray parr[] = new ProductArray[2];
        ProductArray p1 = new ProductArray();
       p1.id = 11;
       p1.name = "abc";
       parr[0] = p1;

        ProductArray p2 = new ProductArray();
       p2.id = 12;
       p2.name = "ramu";
       parr[1] = p2;
      display(parr);

    }

}
