
class  Factorial{
    private int n;
    public Factorial(int n){
        this.n=n;
    }
    public  long Factorial(int n){
        if(n==1){
            return 1L;
        }
        else return n*Factorial(n-1);

    } 
  }
public class Day7{
    public static void main(String[] args){
            Factorial fac=new Factorial(20);
            long num=fac.Factorial(20);
            System.out.println(num);    
    }

} 
// public class Day7{
//     /** 1.计算数组中的最大值*/
//     public static int arrayMaxElement(int[] data)
//     {
//         int max=data[0];
//         for(int i=1;i<data.length;i++){
//             if(max<data[i]){
//                 max=data[i];
//             }
//         }
//         return max;
//     }
//     /** 2.计算数组中的最小值*/
//     public static int arrayMinElement(int[] data)
//     {
//         int min=data[0];
//         for(int i=1;i<data.length;i++){
//             if(min>data[i]){
//                 min=data[i];
//             }
//         }
//         return min;
//     }
//     /** 3.计算数值的和*/
//     public static int arrayElementSum(int[] data)
//      {
//         int sum=0;
//         for(int i=0;i<data.length;i++){
//             sum+=data[i];
//         }
//         return sum;
//      }
//      /** 4.数组的拼接*/
//      //{1,3,4,5}  {2,4,6,8}
//      //{1,3,5,7,2,4,6,8}
//     public static int[] arrayJoin(int[] a,int[] b)
//      {
//          int[] result=new int[a.length+b.length];
//            for(int i=0;i<a.length;i++){
//                result[i]=a[i];
//            }
//            for(int i=0;i<b.length;i++){
//                result[i+b.length]=result[i+b.length];
//            }
//            return result;
//      }
//      /** 5.数组的截取*/
//     public static int[] arraySub(int[] data,int start,int end)
//      {
//          int[] result=new int[end-start];
//          for(int i=0;i<end-start;i++){
//              result[i]=data[i+start];
//          }
//          return result;
//      }

//         /** 6.数组的打印*/
//     public static void printArray(int[] data)
//      {
//          for(int i=0;i<data.length;i++){
//              System.out.print(data[i]+" ");
//          }
//      }
//      /** 7.数组的反转*/
//     public static void printReversal(int[] data)
//      {
//          int i=0;
//          int j=data.length-1;
//          for(;i<j;i++,j--){
//              int temp=data[i];
//              data[i]=data[j];
//              data[j]=temp;
//          }
//      }

//      public static void main(String[] args)
//      {
//           int[] a=new int[]{1,3,5,7};
         
//          int[] b=new int[]{2,4,6,8};
//          int[] c=null;
//          int result=0;
//          result=arrayElementSum(a);
//            System.out.println(result);
//          result=arrayMaxElement(a);

//          System.out.println(result);
//          result=arrayMinElement(a);

//          System.out.println(result);
//          c=arrayJoin(a,b);
//          printArray(c);
//          printReversal(b);
//              c=arraySub(a,2,4);
//           printArray(c);    
//      }
// }
// public class Day7{
//     public static void main(String[] args){
//         for(int i=1;i<=9;i++){
//             for(int j=0;j<=i;j++){
//                 System.out.print(i+"*"+j+"="+(i*j)+" ");
//             }
//             System.out.println();
//         }
//     }
// }