/**
 * Created by User on 02.08.2017.
 */
import java.util.Scanner ;
public class string_comp {

    public static void main(String[ ] args) {
        String string1="hello";
        System.out.println("Введите строку");
        Scanner scan = new Scanner(System.in);
        String string2 = scan.next();
        scan.close();
        if(string1.equals(string2))
        {
            System.out.println("Строки совпадают");
        }
        else
        {
            System.out.println("Строки не совпадают");
        }
    }
}