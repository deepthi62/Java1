package Functions;

  public class CallByValue {
    public static void changeAge(int age){
        System.out.println(age);
    }
    public static void main(String[]args){
        int age = 24;
        System.out.println(age);
        changeAge(89);
    }


}
