package Functions;

public class UpperCase {
  public static void main(String[]args){

      String str = toUpper("welcome");
      System.out.println(str);
  }
  public static String toUpper(String s){
      String result = s.toUpperCase();
      return result;
  }
}
