public class Hello 
{
    public static void main(String[] args) 
     {
        // variable declaration(integer)
        int num1 = 10;
        int num2 = 2;
        int Product = num1 * num2 ;
        int Sum = num1 + num2 ;

        // boolean b = true;
        // float num3 = 3.14f;
        // double num4 = 3.14;
        // byte by = 10;
        // short sh = 10;
        // char ch = 'A';
         String FirstName = "King";
         String LastName = "Mart";

        System.out.println(Product); // 20
        System.out.println(--Product); // 19
        System.out.println(Sum); // 12 
        System.out.println(++Sum); // 13
        System.out.println(FirstName+" "+LastName); //King Mart

        //Type convention and casting
        int num5 = 10;
        float num6 = (float) num5;
        double num7 = 91.0;
        //byte num8 = (byte) num7;
        System.out.println(num6);  // 10.0
        System.out.println(num7); // 91.0

        // increasing a number by a specific no. of digits

        num1 = num1 + 1;
        num2 += 5;
        num5 ++; // increment
        int num3 = 50 ; 
        num3 --; // decrement

        System.out.println(num1); // 11
        System.out.println(num2); // 7
        System.out.println(num5); // 49
        System.out.println(num3); // 49

        //relational operators

        int a = 100;
        int b = 200;

        boolean result = (a > b);
        boolean result1 = (a < b);
        boolean result2 = (a >= b);
        boolean result3 = (a == b);
        
        System.out.println(result); // false
        System.out.println(result1); //true
        System.out.println(result2); //false
        System.out.println(result3); //false

    }
}
