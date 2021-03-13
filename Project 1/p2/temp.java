package p2;

public class temp {
    public static void main(String[] args) {
        var temp = 10; 
        var cold = 0; 
        var hot = 50; 
        var veryhot = 100; 
        var belowz= -15; 

        temp = 100; 

        switch(temp){
            case 0:
            System.out.println("The temperature is cold");
            break; 
            case 50: 
            System.out.println("The temperature is hot");
            break;
            case -15:
            System.out.println("The temperature is Freezing");
            break;
            case 100:
            System.out.println("The temperature is extremely hot"); 

            default: 
            System.out.println("The temperature is unknown");

        }
        var temperature = 40; 

        
            if(temperature <= 100){
                System.out.println("The temperature is " + temperature + " Degrees");
            }
        
        }

    }
    

