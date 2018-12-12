public class Day14{
    public static void main(String[] args){
        int size=Integer.parseInt(args[0]);
        // for(int i=1;i<=size;i++){
        //     System.out.print(Faboncci(i)+"\t");
        // }  
        for(int i=1;i<=size;i++){
            System.out.print(factorial(i)+"\t");
        }
    }
    // public static int Faboncci(int n){
    //     if(n==1||n==2){
    //         return 1;
    //     }
    //     else return  Faboncci(n-1)+Faboncci(n-2);
    // }
    public static long factorial(int n){
        if(n==1){
            return 1L;
        }
        else return n*factorial(n-1);
    }
}