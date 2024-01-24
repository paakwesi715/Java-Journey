public class Loops
 {
    public static void main(String[] args)
    {
        int i = 1;
        while(i <= 7)
        {
            System.out.println("Hello World " + i);
            i ++;
           // nested loop is when a sup loop has been created within the parent loop
            // the "do...while loop" method only ones when the condition is false
           int j = 5;
           
            do
            {
                System.out.println("it is well! " + j );
                j++;
            }
            while(j <= 3);

            i++;

            // for loop unlike the other loop methods can contain the condition in one line...
             for(int k = 0; k <= 3; k ++ )
             {
                System.out.println("DAY " + k );
             }


        }
    }
    
}
