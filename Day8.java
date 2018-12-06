// import java.util.Arrays;
// public class Day8{
//     public static void main(String[] args){
//         //sort 
//         char[] string=new char[]{'T','e','S','t'};
//         Arrays.sort(string);
//         for(char tmp:string){
//         System.out.print(tmp);
//         }
//         //copyOf
//         char[] data=Arrays.copyOf(string,10);
//          for(char tmp:data){
//         System.out.print(tmp);
//         }
//         System.out.println();
//         for(int i=string.length;i<data.length;i++){
//             int n=32+'G';
//             data[i]=(char)n;
//         }
//            for(char tmp:data){
//         System.out.print(tmp);
//         }
//         int[] data1=new int[]{1,2,3,4,5,6,7,8,9};
//         int[] data2=new int[]{11,222,33,44,55,66,77,88,99};
//         System.arraycopy(data1,1,data2,1,5);
//         for(int i : data2){
//             System.out.print(i+"\t");
//         }
//     }
// }
// class Cirle{
//     private double radius;
//     public Cirle(){
//         System.out.println("调用了无参的构造方法");
//     }
//     public Cirle(double radius){
//         this.radius=radius;
//     }
//     public double getRadius(){
//         return radius;
//     }
//     public double mianji(){
//         return this.radius*this.radius*3.14;
//     }
// }
// public class Day8{
//     public static void main(String[] args){
//         Cirle C1=new Cirle();
//         Cirle C2=new Cirle(2);
//         System.out.println("半径"+C1.getRadius());
//         System.out.println(C1.mianji());
//         System.out.println("半径"+C2.getRadius());
//         System.out.println(C2.mianji());
//     }
// }