package File_Hw;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class week5 {
    public static void main(String[] args) throws IOException{
        var filename = "/Applications/Java (CSC110)/Project 1/Data .txt";
        var filepath = Paths.get(filename);
        if(!Files.exists(filepath)){
            System.out.println("********-----------The file path" + filename + "does not exists--------*****");
        }
        System.out.println("******------The file path" + filename + "was found and now the code will continue!------******");
        
        var userInfos = new ArrayList<UserInfo>();
        var datacount = 0; 
        var readstream = Files.newBufferedReader(filepath);
        var data = readstream.readLine();
        while(data != null){
            data = readstream.readLine();
            if( data != null){
                var elements = data.split(",");
                var userInfo = new UserInfo();
                userInfo.Name = elements[0];
                userInfo.Address = elements[1];
                userInfo.Phone = elements[2];
                userInfos.add(userInfo);
            }
        }
        readstream.close();

        //write the data into the new file, also known as the outfile
       
        var outFilename = "/Applications/Java (CSC110)/Project 1/File_Hw/Data_out.txt";
        var outFilepath = Paths.get(outFilename);
        var writestream = Files.newBufferedWriter(outFilepath);
        
        for(var userData : userInfos){
            writestream.write(userData.Name.toUpperCase() + "|" + userData.Address + "|" + userData.Phone);
            writestream.newLine();
        }
        writestream.close();
        
    }
    
}
