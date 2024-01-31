import java.util.Scanner;
public class Dateable {

   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scan.nextInt();
        int dateable = (age/2 + 7);
        System.out.println("If you are " + age + " you must date someone at least " + dateable + " years old");

       int pages = (100 - age);
       System.out.println("If you are " + age + " you must read at least " + pages + " pages a day");;
   }
}
