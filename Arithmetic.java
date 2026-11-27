import java.util.Scanner;
public class Arithmetic{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String p = sc.next();
        try {
            int a = Integer.parseInt(s);
            int b = Integer.parseInt(p);
            int c = a/b;
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Lusu payaley");
        }
        System.out.println("18072006");
    }
}