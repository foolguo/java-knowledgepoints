
// 3.一个斐波那契数列是由数字1、1、2、3、5、8、13、21、34等等组成的，其中每一个数字(从第三个数字起)都是
// 前两个数字的和。创建一个方法，接受一个整数参数，并显示从第一个元素开始总共由该参数指定的个数所构成的所
// 有斐波那契数字。例如，如果运行 java Fibonacci 5(Fibonacci为类名)，那么输出应该是1、1、2、3、5。 


public class Fibonacci{
    public static void main(String[] args){
     int n= Integer.parseInt(args[0]);
     fibonacci(n);
    }

    public static void fibonacci(int n){
    int a=1,b=1,c=0;
        for(int i=1;i<=n;i++){
            if(i<3){
                System.out.print(1+"、");
            }
            else{
                c=a+b;
                a=b;
                b=c;
                System.out.print(c+"、");

            }
        }
    }
}