import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class homework {
    public static void main(String[] args) {
        try { 
            var mypath = "/Applications/Java (CSC110)/Project 1/date1.txt"; 
            readFile(mypath); }
        catch (Exception e) {
        System.out.println("there was an error" + e.getMessage()); }

        }
    

    public static void readFile(String mypath) throws IOException{
        var filename = "/Applications/Java (CSC110)/Project 1/date1.txt";
        var path = Paths.get(filename);
        var data = Files.readAllLines(path);
        var lineNumber = 1; 
        lineNumber = lineNumber +1 ;
       for (var line : data)  
       
    
        System.out.println(lineNumber + "." + line); 
         System.out.println(data); 
         System.out.println(lineNumber);

        
    }
}

