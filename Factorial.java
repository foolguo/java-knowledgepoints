public class Factorial{
    public static void main(String[] args)
    {
        long num=Factor(20);
        System.out.println(num);
    }
    public static long Factor(long n)
    {
        if(n==1)
        return 1;
        else
        return n*Factor(n-1);



    }

}