public class SwitchStatement {
    public static void main(String [] args){
        // the following cases will be executed only when the input variable matches any of the cases except for default case
        // the arrow key"->" can be used in place of the "break" keyword
        int num1 = 1;
        String day[] = {"Monday", "Tuesday", "Wednesday", };
        switch(num1) 
        {
            case 1 -> System.out.println("Mathematics");
                 
            case 2 -> System.out.println("English");
                 
            case 3 -> System.out.println("Economics");
               
            case 4 -> System.out.println("Government");
                
            case 5 -> System.out.println("Statistics");

        
            default ->  System.out.println("invalid input");

           
        }
        switch(day[0]) //index of day will determine which case will be executed
        {
            case "Monday" -> System.out.println(" ring 6:30AM"); // [0]
            case "Tuesday" -> System.out.println(" ring 12:30PM"); // [1]
            default ->  System.out.println("invalid input");

        }

        

        
    }

    
}
