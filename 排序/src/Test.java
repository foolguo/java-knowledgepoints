/*排序：
1.冒泡：
2.选择：
3.插入：*/



public class Test {
    public static void main(String[] args) {
        int[] data=new int[]{7,5,2,8,9,4,3};
        bumbSort(data);
        choiceSort(data);
        insertSort(data);
    }
    public static void bumbSort(int[] data){
        int flag=0;
        for(int i=0;i<data.length-1;i++){
            for(int j=i+1;j<data.length-i-1;i++){
                if(data[j]>data[j+1]){
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
    public static void choiceSort(int[] data){
        for(int i=0;i<data.length-1;i++){
            int n=0;
            for(int j=i+1;j<data.length;j++){
                if(data[i]>data[j]){
                    n=j;
                }
            }
            int tmp=data[n];
            data[n]=data[i];
            data[i]=tmp;
        }
    }
    public static void insertSort(int[] data){
        for(int i=1;i<data.length;i++){
            int tmp=data[i];
            int j=i;
            while(j>0&&tmp<data[j-1]){
                data[j]=data[j-1];
                j--;
            }
            data[j]=tmp;
        }
    }
}
