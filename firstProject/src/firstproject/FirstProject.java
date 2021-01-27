package firstproject;

import java.util.Scanner;

public class FirstProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter your name: ");

        Scanner in = new Scanner(System.in);
        //String s = in.nextLine();

        int i = 0;
        while (i < 10) {
            System.out.println("i is: " + i);
            i++;
        }
        in.close();
    }

}
