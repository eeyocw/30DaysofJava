package firstproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FirstProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        
        Scanner in = new Scanner(new File("Students.txt"));
        //File file = new File("Students.txt");
        //Scanner in = new Scanner(file);
        
        List<String> students = new ArrayList<String>();
        
            while (in.hasNext()){

                students.add(in.nextLine());
            }
            for(int i=0;i<students.size();i++){
                System.out.println("Name " + students.get(i));
            }
            in.close();
        }

}
 