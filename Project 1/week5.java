import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class week5 {

    public static void main(String[] args) throws IOException{
        var filename = "/Applications/Java (CSC110)/Project 1/Data .txt"; 
        var fileprint = Paths.get(filename) ; 
        if( !Files.exists(fileprint)){
            System.out.println( "The file" + filename + "could not be found");
        }
        var userInfo = new ArrayList<String>(); 
        var dataElementCount = 0; 
        var readStream = Files.newBufferedReader(fileprint); 
        var data = readStream.readLine(); 

        while( data != null){ //null means unknown value 
            data = readStream.readLine();
            if( data != null){
                userInfo.add(data); 
            }
        }
        readStream.close(); 
        
        var outfilename = "/Applications/Java (CSC110)/Project 1/Data_out.txt";
        var outfilePath = Paths.get(outfilename); 
        var writeStream = Files.newBufferedReader(outfilePath); 
        for( String userData : userInfo) {
            writeStream.writeData(userData); 
            writeStream.newLine(); 
            
        }
        writeStream.close();
    }
    
}
