import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class hw {

    
public static void main(String[] args) throws IOException{
   var filename = "/Applications/Java (CSC110)/Project 1/date1.txt"; //the path name will differ for every operating system
   var filepath = Paths.get(filename); //makes it compatiple to the operating system (OS)
   var data = Files.readString(filepath); //this line will not change regardless of the system 
   
   // public static void readFileFromDisk()throws IOException {
    //  above is another example^^ (remember to have "throw IOException")
   
System.out.println(data);
  
    
    }

}