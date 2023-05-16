package OopsEx;

public class Animal {
    public void f1() {
        System.out.println("animal=BalaBabu");
    }

   }
     class Human extends Animal{
        public  void f1(String s){
            System.out.println("Human");
        }
    }

         class Female extends Human{
            public void f1(String s){
                System.out.println("Female");
            }
        }
         class AppTest {
            public static void f2(Animal a) {
                a.f1();
            }

            public static void f2(Human h) {
                h.f1();
            }

            public static void f2(Female f) {
                f.f1();
            }

             public static void main(String[] args) {
                 Female fm = new Female();
                 fm.f1();

             }

        }