public class Day4{
    public static void main(String[] args)
    {
        /** 
        //动态初始化1
        int[] data=null;
        data=new int [4];
        data[0]=0;
        data[1]=1;
        data[2]=2;
        data[3]=3;
        for(int i:data)
        {
            System.out.print(i+" ");
        }
          */
          //动态2
          /** 
    int[] x=new int [4];
    for(int i=0;i<x.length;i++)
    {
        x[i]=i;
    }
    for(int tmp:x)
    {
        System.out.print(tmp+" ");
    }
    */
        //静态声明  完整格式
        /**
        int[] array=new int [] {0,1,2,3};
        for(int i:array)
        {
            System.out.print(i+" ");
        }
*/
         //静态   不完整
         /** 
        int []array={1,2,3,4};
        for(int i:array)
        {
            System.out.print(i+" ");
        }
        */

        //引用传递
        /** 
        int[] array=new int []{1,2,3,4,5};
        int[] tmp=null;
        tmp=array;
        tmp[tmp.length-1]=10;
        for(int i:array)
        {
            System.out.print(i+" ");
        }
        */
        //匿名数组
        //System.out.println(new int []{1,2,3,4});
        //方法接受数组
        int[] array=new int[]{1,2,3,4,5};
        int[] c=new int[array.length];
        for(int i=0;i<array.length;i++)
        {
            c[i]=array[i];
        }
        for(int tmp:array)
        {
            System.out.print(tmp);
        }

        printArray(array);
        //方法返回数组
        int[] data=init();
        printArray(data);
     
        //方法修改数组
        motifly(array);
        motifly(data);
        printArray(array);
        printArray(data);
         System.out.println(data.length);

    }
        public static void printArray(int[] tmp)
        {
            for(int i:tmp)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        public static int[] init()
        {
            return new int[]{1,4,6,8,9};
        }
        public static void motifly(int[] tmp)
        {
            for(int i=0;i<tmp.length;i++)
            {
                tmp[i]*=5;
            }
        }
}