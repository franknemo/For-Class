package File_Hw;

public class InputOutput {

    public static void main(String[] args) {
        var startValue = 1; 
        var endingValue = 100; 
        var incrementValue = 5; 

        //inform yourself what is happening in output
        System.out.println("----Start of Progress");

        //reformat code in the standard code 
        for(startValue = 0; startValue<= endingValue; startValue = startValue + incrementValue);{
            System.out.println("Decimal Number" + startValue);
            System.out.println("Binary Number" + Integer.toBinaryString(startValue)); 
        } 

    }
    
}
