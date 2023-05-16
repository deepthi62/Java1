package Arrays;

 public class FirstInFirstOut {
    int[] arr = new int[5];
    static int cursor = -1;

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
            e = arr[0];
            e = arr[cursor];
            copy(arr, cursor - 1);
                        cursor--;
        }
        return e;
    }

    public static int[] copy(int[] arr, int copyarr){

        for(int i=0;i<cursor;i++){
            arr[i] = arr[i+1];
//            System.out.println(arr[i]);
        }
        return arr;

    }

}
     class AppTest1{
    public static void main(String[] args) {

                FirstInFirstOut fo = new FirstInFirstOut();
                int a1 = fo.add(10);
                int a2 = fo.add(20);
                int a3 = fo.add(30);

                int e1 = fo.remove();
                int e2 = fo.remove();
                int e3 = fo.remove();

                System.out.println(a1+" "+a2+" "+a3);

                System.out.println("remove"+ e1);
                System.out.println("remove"+ e2);
                System.out.println("remove"+ e3);

            }
        }

//public class ArrayOrder {
//    int arr[] = new int[5];
//    int cursor=-1;
//
//    public  int add(int a){
//        cursor++;
//        if (cursor<=arr.length-1) {
//            arr[cursor] = a;
//        }
//        return a;
//    }
//    public int remove() {
//        int e = 0;
//        if (cursor >= 0) {
//            e = arr[0];
//            copy(arr, cursor - 1);
//            cursor--;
//        }
//        return e;
//    }
//
//    public static int[] copy(int[] arr, int cursor){
//        for (int i = 0; i < cursor; i++) {
//            arr[i]=arr[i+1];
//        }
//        return arr;
//    }
//
//    public static void main(String[] args) {
//        ArrayOrder ao=new ArrayOrder();
//
//        int r=  ao.add(50);
//        int r1=  ao.add(20);
//        int r2=  ao.add(30);
//        int r3=  ao.add(40);
//        int e1=ao.remove();
//        int e2= ao.remove();
//        int e3= ao.remove();
//
//        System.out.println(r+" "+r1+" "+r2+" "+r3);
//        System.out.println("remove"+" "+e1);
//        System.out.println("remove"+" "+e2);
//
//        System.out.println("remove"+" "+e3);
//
//    }
//}
