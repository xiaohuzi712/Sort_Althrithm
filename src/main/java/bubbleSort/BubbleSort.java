package bubbleSort;
/**
 * Created by huchao on 2017/7/9.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] result = BubbleSort.generateData(10);
        int len = result.length;
        System.out.println("排序前:");
        for (int i = 0; i < len; i++) {
            System.out.print(result[i] + " ");
            if (i == len - 1) {
                System.out.println("\n");
            }
        }
        BubbleSort.bubbleSort(result);
        System.out.println("排序后:");
        for (int i = 0; i < len; i++) {
            System.out.print(result[i] + " ");
        }
    }
    //冒泡排序算法实现
    public static void  bubbleSort(int[] array){
        int len = array.length;
        for (int i = 0; i <len ; i++) {
            for (int j = 0; j <len-i-1 ; j++) {
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
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
