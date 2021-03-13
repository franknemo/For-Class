package p2;

public class c { 
    public static void main(String[] args) {
        var a = true; 
        var b = true; 
        var c = false; 
        var d = false; 


        var name = "j"; 
        if(a & b ){
            name = "X"; 
            System.out.println("What happened?");
        }else{
            name = "Y";
            System.out.println("did not expect");
        }
        name = "Y";
        d = a ; 
        switch(name){ 
            case "Y":
            System.out.println("I am y");
            break;
            case "X":
            System.out.println("I am X");
            break; 
            case "j":
            System.out.println("I am j");
            break;

            default: 
            System.out.println("I do not know");
        }
        var temp = 10; 
        //cold / hot / very hot / below zero
        
            
        }
    }
    
}
