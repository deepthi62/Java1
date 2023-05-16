package Collections;
import java.lang.String;
public class Strings {
    public static void main(String[] args) {
        String s = "deepthi";
        String s1 = "deepu";
        String s2 = new String("deepthi");

        if (s.equals(s2)) {
            System.out.println("equal");

        }else{
            System.out.println("not equal");
        }
    }
}