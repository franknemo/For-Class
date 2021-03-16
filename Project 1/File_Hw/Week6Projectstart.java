package File_Hw;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Week6Projectstart {
    public static void main(String[] args) throws IOException{
        var filename = "/Applications/Java (CSC110)/Project 1/File_Hw/Sample100.csv";
        var findPath = Paths.get(filename);
            if(!Files.exists(findPath)){ //testing if the file and its path exists 
                System.out.println("The file path " + filename + " or the file path was not found");
            }else{
                System.out.println("******--------The file path " + filename + " was successfully found---------********"); }
        var array = new ArrayList<ProjectArrayList>();
        var readfile = Files.newBufferedReader(findPath);
        var readData = readfile.readLine();
        while(readData != null){
            readData = readfile.readLine();
            if(readData != null){
                var split = readData.split(","); 
                var d = new ProjectArrayList(); 
                d.SerialNumber = split[0]; //labeling the different elements this one is the ID/Serial Number
                d.CompanyName = split[1]; //Labeled as company name 
                d.Employee = split[2]; //Labeled as company name 
                d.Description = split[3]; //Labeled as description
                d.Leave = split[4]; //Labeled as leave (the value is in a number)
                array.add(d); //the perameter is set 
             }}
            readfile.close(); 
            System.out.println("--------------The BufferedReader has closed and the IO will continue------------------"); 
            //I do this to mark my progress
        
            //now I must put the code somewhere---> good code goes into the GoodData
        var newfile = "/Applications/Java (CSC110)/Project 1/File_Hw/Sample100_BadData.txt"; //this is the unusable file path
        var GoodCodePath = Paths.get(newfile); 
        var GoodCodeStream = Files.newBufferedWriter(GoodCodePath); //this is what let me write into the new file 

        var badFile = "/Applications/Java (CSC110)/Project 1/File_Hw/Sample100_GoodData.txt";
        getData(badFile);
             for(var out : array){   
                var dash = out.Employee.startsWith("-"); 
            var space = out.Employee.startsWith(" "); 
            var Mark = out.Employee.startsWith("Mark"); 
            var MARK = out.Description.startsWith("Mark");  
            
            var Lines = out.SerialNumber.endsWith("553");
            var Lines2 = out.SerialNumber.endsWith("988");
            var Lines3 = out.SerialNumber.endsWith("011");
            if(!dash && !space && !Mark && !MARK && !Lines && !Lines2 && !Lines3 ){ 
                
                continue; 
            }
                GoodCodeStream.write(" Bad Data: " + out.SerialNumber + " | " + out.CompanyName + " | " + 
                     out.Employee.toUpperCase() + " | " + out.Description + " | " + out.Leave ); 
                GoodCodeStream.newLine();
             }
        GoodCodeStream.close();
        System.out.println("*********-----------Look for the new files-------------********");
    }

    private static void getData(String badFile) throws IOException{
        var filepath = "/Applications/Java (CSC110)/Project 1/File_Hw/Sample100.csv"; 
        var BadFilePath = Paths.get(filepath); //similar process like before however we are looking for the good usable lines now
        var badArray = new ArrayList<BadCodeOut>(); 
        var readFile = Files.newBufferedReader(BadFilePath); 
        var readData = readFile.readLine();
        while(readData != null){
            readData = readFile.readLine();
            if(readData != null){
                var split = readData.split(",");
                var d = new BadCodeOut();
                d.SerialNumber = split[0];
                d.CompanyName = split[1];
                d.Employee = split[2];
                d.Description = split[3]; 
                d.Leave = split[4];
                badArray.add(d);
            }
        }
        readFile.close(); //we are done reading the file, now we must filter out the bad lines

        var outfilePath = Paths.get(badFile); 
        var newBufferedWriter = Files.newBufferedWriter(outfilePath);
        for( var out : badArray){  //after this point the code is filtering out useless characters/lines and writing only usable lines
            var dash = out.Employee.startsWith("-"); //filtering out certain characters like "-"
            var space = out.Employee.startsWith(" "); 
            var Mark = out.Employee.startsWith("Mark"); //For the employee names that have the 'mark' error
            var MARK = out.Description.startsWith("Mark"); // similar to the employee 'mark' error
            var mark1 = out.CompanyName.replaceAll("Mark", "").replace("/E", "") .replace("/ E", "").replace("D.", "D"); 
            // I had to replace all of these characters within the same line to make the code shorter
            //var periods = out.Description.replaceAll(".", " ");
            var RemoveLines = out.SerialNumber.endsWith("553");
            var RemoveLines2 = out.SerialNumber.endsWith("988");
            var RemoveLines3 = out.SerialNumber.endsWith("011");
            if(dash || space || Mark || MARK || RemoveLines || RemoveLines2 || RemoveLines3 ){ 
                continue; //this means 'if elements start with the characters stated above, do not write'
            }
            newBufferedWriter.write(" Good Data: " + out.SerialNumber + " | " + mark1 + " | " + 
            out.Employee.toUpperCase().replace("A C K", "ACK").replace(".", "") + " | " + out.Description.replace(".", " ") 
            + " | " + out.Leave ); //Now after all of that code I'm ready to write the new files
            newBufferedWriter.newLine();
        }
        newBufferedWriter.close();
        
    }
    
}
