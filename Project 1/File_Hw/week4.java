package File_Hw;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;



public class week4 {
    public static void main(String[] args) throws IOException {
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
        try {//print out each line of the data 
       System.out.println("-------NAMES-------");
       for(var userData : userinfos){
        var elements = userData.split(",");//indicate that any line with a comma will be seprated
        System.out.println(elements[0]);
        }
        System.out.println("--------------------");
        System.out.println("-------ADDRESS-------");
       for(var userData : userinfos){
        var elements = userData.split(",");
        System.out.println(elements[1]);
        }
        System.out.println("-------PHONE-------");
       for(var userData : userinfos){
        var elements = userData.split(",");
        System.out.println(elements[2]);
        }
        
            
        } catch (Exception e) { 
            System.out.println(e);
            
        }
        System.out.println();
       
        System.out.println("Week 4 part 2: removing the 'X' ");
        
        System.out.println();
        System.out.println();
        for(var userData: userinfos){
            var foundX = userData.startsWith("X");
            if(!foundX){
                System.out.println(userData);}
        }
        System.out.println("-------------------------");
            System.out.println("The code is successful and complete! -Frank Araujo");
    }

       
     }

      
 
               
        

    
    

