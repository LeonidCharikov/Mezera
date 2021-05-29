
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        File file = new File("C:\\m.txt");
        try{
            Scanner in = new Scanner(new FileInputStream(file)); 
           int slova = 0;
            while(in.hasNext()){
                in.next();
                slova++;
            }
        System.out.println("Poèet slov: " + slova);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            System.out.println("Soubor nebyl nalezen");
        }
    }

}