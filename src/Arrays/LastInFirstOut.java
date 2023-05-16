package Arrays;

public class LastInFirstOut {

     int[] arr = new int[5];
     int cursor = -1;

    public  int add(int a){
        cursor++;
           if(cursor <=arr.length-1){
               arr[cursor]=a;
           }

        return a;
    }

    public int remove() {
        int e = 0;
        if (cursor >= 0) {
            e = arr[cursor];
            cursor--;
        }
        return e;
    }

}
   class AppTest{
       public static void main(String[] args) {
           LastInFirstOut fo = new LastInFirstOut();
            int a1 = fo.add(10);
            int a2 = fo.add(20);
            int a3 = fo.add(30);
            int e = fo.remove();
            int e2 = fo.remove();


           System.out.println(a1);
           System.out.println(a2);
           System.out.println(a3);
           System.out.println(e);
           System.out.println(e2);
       }
   }
