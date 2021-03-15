package p2;

import java.io.File;
import java.io.IOException;

public class testing {
    public static void main(String[] args) {
        File file = new File("/Applications/Java (CSC110)/Project 1/File_Hw/Data_out.txt");
         try {
            if(file.createNewFile()){
                 System.out.println("The file creation was successful!");
             }
             else{
                System.out.println("The file was not created :(");
             }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.print(e);
        }
    }
    
}
