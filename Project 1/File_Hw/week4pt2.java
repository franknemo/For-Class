package File_Hw;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class week4pt2 {
    public static void main(String[] args) throws IOException{
        var filename = "/Applications/Java (CSC110)/Project 1/Data .txt"; 
        var filepath = Paths.get(filename);
        if(!Files.exists(filepath)){
            System.out.println("The file path"+ filename + "could not be found");
        }
       System.out.println("*****--------The file path " + filename+ " was found--------******");
       //Arrays are a form of data structure/collections
       var userinfos = new ArrayList<String>(); //only store strings nothing else
       var readstream = Files.newBufferedReader(filepath); 
       var data = readstream.readLine(); 
        //the new word "while" allows you to create loops and other things
        while(data != null){
            data = readstream.readLine();
            if(data != null){
                userinfos.add(data);
            }
        }
        

    }
    
}
