//
//class A{}
//
//class B extends A{}
//
//class C extends A{}
//
//class D extends B{}
//public class Test {
//    public static void main(String[] args) {
//       A obj = new D();
//
//        System.out.println(obj instanceof B);
//
////        System.out.println(obj instanceof C);
//
//        System.out.println(obj instanceof D);
//
//        System.out.println(obj instanceof A);
//    }
//
//}


/*
冒泡排序
*/
/*
public class Test{
    public static void main(String[] args) {
        int[] data=new int[]{1,3,4,6,7};
        sort(data);
        for(int i:data){
            System.out.print(i+" ");
        }
    }
    public static void sort(int[] data){
        int flag=0;
        for(int i=0;i<data.length;i++){
            for(int j=0;j<data.length-i-1;j++){
                if(data[j]<data[j+1]){
                    int tmp=data[j];
                    data[j]=data[j+1];
                    data[j+1]=tmp;
                    flag++;
                }
            }
            if(flag==0){
                break;
            }
        }
    }
}
*/

/*
选择排序*/

/*
public class Test{
    public static void main(String[] args) {
        int[] data=new int[]{1,2,3,4,5};
        sort(data);
        for(int i:data){
            System.out.print(i+" ");
        }
    }
    public static void sort(int[] data){
        for(int i=0;i<data.length;i++){
            int max=i;
            for(int j=i;j<data.length;j++){
                if(data[i]<data[j]){
                    max=j;
                }
            }
            if(i!=max){
                int tmp=data[i];
                data[i]=data[max];
                data[max]=tmp;
            }
        }
    }
}*/

/*public class Test{
    public static void main(String[] args) {
        int[] data=new int[]{2,8,9,5,7,6,1,3};
        sort(data);
        for(int i:data){
            System.out.print(i+" ");
        }
    }
    public static void sort(int[] data){
        int j=0;
        for(int i=0;i<data.length;i++){
            int tmp=data[i];
            j=i;
            while(j>0&&tmp<data[j-1]){
                data[j]=data[j-1];
                j--;
            }
            data[j]=tmp;
        }
    }

}*/


 class MyArray {
    //定义一个数组
    private int [] intArray;
    //定义数组的实际有效长度
    private int elems;
    //定义数组的最大长度
    private int length;


    //构造函数，初始化一个长度为length 的数组
    public MyArray(int length){
        this.length=length;
        intArray=new int[length];
        this.elems=0;
    }

    //获取数组的有效长度
  public int getElems(){
        return this.elems;
  }
    /**
     * 遍历显示元素
     */
    public void display(){
        for(int i=0;i<this.elems;i++){
            System.out.print(intArray[i]+" ");
        }
        System.out.println();
    }


    /**
     * 添加元素
     * @param value,假设操作人是不会添加重复元素的，如果有重复元素对于后面的操作都会有影响。
     * @return添加成功返回true,添加的元素超过范围了返回false
     */
    public boolean add(int vaule){
        if(this.elems==length){
            return false;
        }
        intArray[this.elems]=vaule;
        this.elems++;
        return true;
    }


    /**
     * 根据下标获取元素
     * @param i
     * @return查找下标值在数组下标有效范围内，返回下标所表示的元素
     * 查找下标超出数组下标有效值，提示访问下标越界
     */
    public int get(int i){
        if(i<0||i>elems){
            System.out.println("访问越界");

        }
        return intArray[i];
    }

    /**
     * 查找元素
     * @param searchValue
     * @return查找的元素如果存在则返回下标值，如果不存在，返回 -1
     */
        public int find(int searchValue){
            for(int i=0;i<elems;i++){
                if(intArray[i]==searchValue){
                    return i;
                }
            }
            return -1;
        }


    /**
     * 删除元素
     * @param value
     * @return如果要删除的值不存在，直接返回 false;否则返回true，删除成功
     */
    public boolean delete(int value){
        int flag=find(value);
        if(flag==-1){
            return false;
        }
        if(flag==elems-1){
            this.elems--;
            return true;
        }
        for(int i=flag;i<elems;i++){
            intArray[i]=intArray[i+1];
        }
        this.elems--;
        return true;
    }



    /**
     * 修改数据
     * @param oldValue原值
     * @param newValue新值
     * @return修改成功返回true，修改失败返回false
     */
        public boolean modify(int oldValue,int newValue){
            int flag=find(oldValue);
            if(flag==-1){
                System.out.println("原值不存在");
            }
            intArray[flag]=newValue;
            return true;
        }

}


public class Test{
    public static void main(String[] args) {
        MyArray array = new MyArray(4);
        //添加4个元素分别是1,2,3,4
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        //显示数组元素
        array.display();
        //根据下标为0的元素
        int i = array.get(0);
        System.out.println(i);
        //删除4的元素
        array.delete(4);
        //将元素3修改为33
        array.modify(3, 33);
        array.display();
    }
}

