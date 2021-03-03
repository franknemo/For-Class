package File_Hw;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class week3 {
    public static void main(String[] args) throws IOException{
        var filename = "/Applications/Java (CSC110)/Project 1/data2.txt";
        var filepath = Paths.get(filename);
        if(!Files.exists(filepath)) {
            System.out.println("-----****The file" + filename + "could not be found");
        }
        var readStream = Files.newBufferedReader(filepath); 
        var data = readStream.readLine(); 
        var number = 0;
        while(data != null){
          
            while(number < 6){
                number = number + 1; 
                System.out.println(number + ": " + "The data " + data);
                data = readStream.readLine(); 
            }
          
            
        }
        System.out.println("The code is complete -Frank Araujo");
    }
    
}
