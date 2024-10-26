import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] myArray = new int[n];
        for (int i = 0; i< myArray.length; i++) {
            myArray[i] = random.nextInt(100);
        }


        for (int i = 0; i < myArray.length; i++) {
            if (i % 2 == 0) {

                System.out.println("четные :" + myArray[i]);
            }
        }
        for (int i = 0; i< myArray.length; i++) {
            if (i % 2 != 0) {
                System.out.println("нечетные :" + myArray[i]);
            }
        }


        }

        }






