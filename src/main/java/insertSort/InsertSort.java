package insertSort;
/**
 * Created by huchao on 2017/7/4.
 */
public class InsertSort {
    public static void main(String[] args) {
            int[] result = InsertSort.generateData(10);
            int arrLen = result.length;
            System.out.println("排序前:");
            for (int i = 0; i <arrLen; i++) {
                System.out.print(result[i]+" ");
                if (i==arrLen-1){
                    System.out.println("\n");
                }
            }
            InsertSort.insertMethod(result);
            System.out.println("排序后:");
            for (int i = 0; i <arrLen; i++) {
            System.out.print(result[i] + " ");
        }
    }
    //插入排序算法实现
    public static void insertMethod(int[] array){
        int len = array.length;
        for (int i = 1; i <len ; i++) {
            int key = array[i];
            int j  = i-1;
            while (j>=0&&array[j]>=key){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;
        }
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
