// public class Day13{
//     public static void main(String[] ages){
//         int[] data=new int[3];
//         for(int i=0;i<data.length+1;i++){
//             data[i]=i+1;
//         }
//     }
// }
// public class Day13{
//     // public static void main(String[] args){
//     //     int[] data=new int[]{1,2,3,4};
//     //     print(data);
//     // }
//     public static void print(int[] data){
//         for(int temp:data){
//             System.out.print(temp+"\t");
//         }
//     }
//     public static void main(String[] arg){
//         int[] data=init();
//         print(data);
//     } 
//     public static int[] init(){
//         return new int[]{1,2,3};
//     }
// }
// import java.util.Arrays;
// public class Day13{
//     public static void main(String[] args){
//         String[] data = new String[]{"狗","逼","gun"};
//         //java.util.Arrays.sort(data);
//         Arrays.sort(data);
//         print(data);
//     }
//     public static void print(int[] data){
//         for(int temp:data){
//             System.out.print(temp+"\t");
//         }
//     }
//     public static void print(String[] data){
//         for(String temp:data){
//             System.out.print(temp+"\t");
//         }
//     }
// }

// public class Day13{
//     public static void main(String[] args){
//         int[] data1=new int[]{1,2,3,4,5,6,7,8,9};
//         int[] data2=new int[]{11,22,33,44,55,66,77};
//         System.arraycopy(data2,2,data1,3,5);
//         print(data1);
//     }
//         public static void print(int[] data){
//         for(int temp:data){
//             System.out.print(temp+"\t");
//         }
//     }
// }
import java.util.Arrays;
public class Day13{
    public static void main(String[] args){
        int[] data1=new int[]{1,2,3,4,5};
        int[] data2=Arrays.copyOf(data1,10);
        int[] data3=Arrays.copyOf(data1,3);
        print(data1);
        print(data2);
        print(data3);


    }
    public static void print(int[] data){
        for(int temp:data){
            System.out.print(temp+"\t");
        }
        System.out.println();
    }

}