package selectSort;
/**
 * Created by huchao on 2017/7/10.
 */
public class Sort {
    public static void main(String[] args) {
        int[] result = Sort.generateData(10);
        int len = result.length;
        System.out.println("排序前:");
        for (int i = 0; i < len; i++) {
            System.out.print(result[i] + " ");
            if (i == len - 1) {
                System.out.println("\n");
            }
        }
        Sort.selectSort(result);
        System.out.println("排序后:");
        for (int i = 0; i < len; i++) {
            System.out.print(result[i] + " ");
        }
    }
    //选择排序算法实现
    public static  void selectSort(int[] array){
        int len = array.length;
        for (int i = 0; i <len-1 ; i++) {
            int minIndex = i;
            for (int j = i+1; j <len ; j++) {
                if (array[j]<array[minIndex]){
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
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
