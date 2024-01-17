public class LogicalOperators 
{
    public static void main(String[] args)
    {
        int num1 = 10;
        int num2 = 99;
        int num3 = 8;
        int num4 = 50;
        // logical operators [(AND &&), (OR ||), (XOR ^), (NOT!)]

        boolean result = (num1 < num2 && num3 > num4);
        boolean result1 = (num1 > num2 || num3 < num4);
        boolean result2 = (num1 > num2 != num3 < num4);
        boolean result3 = (num1 > num2 ^ num3 < num4);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);

    }
}
