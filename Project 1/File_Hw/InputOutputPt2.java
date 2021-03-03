package File_Hw;


public class InputOutputPt2 {
    public static void main(String[] args) {
        var startingValue = 1; 
        var endingValue = 100; 
        var incrementValue = 5; 

        System.out.println("---Start of Progress"); 

        for(startingValue = 0; startingValue<= endingValue; startingValue = startingValue + incrementValue){ 

            PrintData("The current data", startingValue);
        }
        //My final words--> testing the success of the assingment
        System.out.println("--The assingment is successful. --Frank Araujo--");
    }
    public static void PrintData(String message, Integer value){
        var header = "-*";

        System.out.println(header.repeat(20));
        System.out.println(message + " =");
        System.out.println(value); 
       
        
    }
    
}
