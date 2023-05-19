package Functions;

  public class CallByValue {
    public static void changeAge(int age){

        age = 35;
    }
    public static void main(String[]args){
        int age = 24;
        System.out.println(age);
        changeAge(age);
        System.out.println(age);
    }


}
