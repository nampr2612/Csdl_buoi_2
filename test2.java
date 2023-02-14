import java.util.Scanner;

public class test2 {
         public static void main(String[]args) {
             Scanner scanner = new Scanner(System.in);
             System.out.print("nhap so vao");
             int number = scanner.nextInt();
             if (number < 2) ;
             System.out.print(number + "ko la so nguyen");
             {
                 int i = 2;
                 boolean check = true;
                 while (i <= Math.sqrt(number)) {
                     if (number % i == 0) {
                         check = false;
                         break;
                     } else
                         i++;
                 }
                 if (check)
                     System.out.println(number + " la so nguyen");
                 else
                     System.out.println(number + " ko la so nguyen");

             }

             }

         }
