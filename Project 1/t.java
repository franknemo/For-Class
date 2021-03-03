import java.io.IOException;
import java.nio.file.Paths;

public class t {



    public static void main(String[] args) {
        try { 
            var mypath = "/Applications/Java (CSC110)/Project 1/Grades.txt"; 
            readFilecalledGrades(mypath); }
        catch (Exception e) {
        System.out.println("there was an error" + e.getMessage()); }

        }

        private static void readFilecalledGrades(String mypath) throws IOException{
            var filepath = Paths.get(mypath);

        }
    
}
