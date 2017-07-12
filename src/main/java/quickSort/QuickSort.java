package quickSort;

/**
 * Created by huchao on 2017/7/12.
 */
public class QuickSort {
    public static void main(String[] args) {
            int[] result = QuickSort.generateData(10);
            int arrLen = result.length;
            int low = 0,high = arrLen-1;
            System.out.println("排序前:");
            for (int i = 0; i <arrLen; i++) {
                System.out.print(result[i]+" ");
                if (i==arrLen-1){
                    System.out.println("\n");
                }
            }
            QuickSort.quickMethod(result, low, high);
            System.out.println("排序后:");
            for (int i = 0; i <arrLen; i++) {
            System.out.print(result[i] + " ");
        }
    }
    public static int partition(int[] array,int low, int high){
        int refer = array[low];
        while (low<high){
            //从后往前扫描
            while(array[high]>=refer&&low<high){
                high--;
            }
            //将小于基准的元素移到低端
            array[low] = array[high];
            //从前往后扫描
            while (array[low]<=refer&&low<high) {
                low++;
            }
            //将大于基准的元素移到高端
            array[high] = array[low];
        }
        array[high] = refer;
        //返回中位数下标位置
        return high;
    }
    //快速排序算法实现
    public static void quickMethod(int[] array,int low,int high){
        if(low>=high){
            return ;
        }
        int median = partition(array, low,high);
        quickMethod(array,low,median-1);
        quickMethod(array,median+1,high);
    }
    // 动态传入数组个数，生成随机数组
    public static int[] generateData(int length){
        int[] data =  new int[length];
        for (int i = 0; i <length ; i++) {
            data[i] = (int)(Math.random()*100);
        }
        return data;
    }
}
