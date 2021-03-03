package File_Hw;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Week6 {
    public static void main(String[] args) {
        var filename = "/Applications/Java (CSC110)/Project 1/Data .txt";
        getdata(filename); 
        var outfilename = "/Applications/Java (CSC110)/Project 1/Data__Bad_ .txt";
        var outfilepath = Paths.get(outfilename); 
        var writestream = Files.newBufferedWriter(outfilepath); 
        for(var Userdata : UserList){
            writestream.write((int) Userdata); 
            writestream.newLine(); 
        
        writestream.close(); }
    }
    

    private static void getdata(String filename) throws IOException {
        var filepath = Paths.get(filename); 

        if(!Files.exists(filepath)) {
            System.out.println( "The file in question was not found ---***"); 
            return;
        }
        System.out.println("The file was sucessfully found :)-----**" + filename); 

        var bufferReader = Files.newBufferedReader(filepath); 
        var dataLine = bufferReader.readLine(); 
        if(dataLine == null ) { //compare
            System.out.println("Sucess----** there was no data in the file" + filename);
            bufferReader.close(); 
            return; 
        }
        System.out.println("Data: " + dataLine);
        dataLine = bufferReader.readLine(); 
        var userList = new ArrayList<String>();
        while( dataLine != null){
            System.out.println("Data: " + dataLine); 
        
        var foundX = dataLine.startsWith("X"); 
        if(!foundX){
            userList.add(dataLine); 
         } 
        dataLine = bufferReader.readLine(); }
        bufferReader.close();
    }
    
    
}
