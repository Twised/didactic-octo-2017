package demo;

/**
 * @author wjl
 * @description 逻辑题逻辑
 * @date 2019/8/2
 */
public class Utils {
    /**
     * @return
     * @Description 第2题逻辑
     * @LastChangeDate 2019/8/2
     * @Date 2019/8/2
     * @Params * @param
     */
    public static boolean Question2(int arr[]) {
        boolean b = false;
        if (arr[1] == 1 && arr[4] == 3) {
            b = true;
        }
        if (arr[1] == 2 && arr[4] == 4) {
            b = true;
        }
        if (arr[1] == 3 && arr[4] == 1) {
            b = true;
        }
        if (arr[1] == 4 && arr[4] == 2) {
            b = true;
        }
        return b;
    }

    /**
     * @return
     * @Description 第3题逻辑
     * @LastChangeDate 2019/8/2
     * @Date 2019/8/2
     * @Params * @param
     */
    public static boolean Question3(int arr[]) {
        boolean b = false;
        if (arr[2] == 1 && Utils2.Q3(arr[5], arr[1], arr[3])) {
            b = true;
        }
        if (arr[2] == 2 && Utils2.Q3(arr[2], arr[1], arr[3])) {
            b = true;
        }
        if (arr[2] == 3 && Utils2.Q3(arr[5], arr[2], arr[3])) {
            b = true;
        }
        if (arr[2] == 4 && Utils2.Q3(arr[5], arr[2], arr[1])) {
            b = true;
        }
        return b;
    }

    /**
     * @return
     * @Description 第4题逻辑
     * @LastChangeDate 2019/8/2
     * @Date 2019/8/2
     * @Params * @param
     */
    public static boolean Question4(int arr[]) {
        boolean b = false;
        if (arr[3] == 1 && arr[0] == arr[4]) {
            b = true;
        }
        if (arr[3] == 2 && arr[1] == arr[6]) {
            b = true;
        }
        if (arr[3] == 3 && arr[0] == arr[8]) {
            b = true;
        }
        if (arr[3] == 4 && arr[5] == arr[9]) {
            b = true;
        }
        return b;
    }

    /**
     * @return
     * @Description 第5题逻辑
     * @LastChangeDate 2019/8/2
     * @Date 2019/8/2
     * @Params * @param
     */
    public static boolean Question5(int arr[]) {
        boolean b = false;
        if (arr[4] == 1 && arr[4] == arr[7]) {
            b = true;
        }
        if (arr[4] == 2 && arr[4] == arr[3]) {
            b = true;
        }
        if (arr[4] == 3 && arr[4] == arr[8]) {
            b = true;
        }
        if (arr[4] == 4 && arr[4] == arr[6]) {
            b = true;
        }
        return b;
    }

    /**
     * @return
     * @Description 第6题逻辑
     * @LastChangeDate 2019/8/2
     * @Date 2019/8/2
     * @Params * @param
     */
    public static boolean Question6(int arr[]) {
        boolean b = false;
        if (arr[5] == 1 && Utils2.Q3(arr[7], arr[1], arr[3])) {
            b = true;
        }
        if (arr[5] == 2 && Utils2.Q3(arr[7], arr[0], arr[5])) {
            b = true;
        }
        if (arr[5] == 3 && Utils2.Q3(arr[7], arr[2], arr[9])) {
            b = true;
        }
        if (arr[5] == 4 && Utils2.Q3(arr[7], arr[4], arr[8])) {
            b = true;
        }
        return b;
    }

    /**
     * @return
     * @Description 第7题逻辑
     * @LastChangeDate 2019/8/2
     * @Date 2019/8/2
     * @Params * @param
     */
    public static boolean Question7(int arr[]) {
        boolean b = false;
        if (arr[6] == 1 && Utils2.Q7(arr) == 3) {
            b = true;
        }
        if (arr[6] == 2 && Utils2.Q7(arr) == 2) {
            b = true;
        }
        if (arr[6] == 3 && Utils2.Q7(arr) == 1) {
            b = true;
        }
        if (arr[6] == 4 && Utils2.Q7(arr) == 4) {
            b = true;
        }
        return b;
    }

    /**
     * @return
     * @Description 第8题逻辑
     * @LastChangeDate 2019/8/2
     * @Date 2019/8/2
     * @Params * @param
     */
    public static boolean Question8(int arr[]) {
        boolean b = false;
        if (arr[7] == 1 && Utils2.Q8(arr[0], arr[6])) {
            b = true;
        }
        if (arr[7] == 2 && Utils2.Q8(arr[0], arr[4])) {
            b = true;
        }
        if (arr[7] == 3 && Utils2.Q8(arr[0], arr[1])) {
            b = true;
        }
        if (arr[7] == 4 && Utils2.Q8(arr[0], arr[9])) {
            b = true;
        }
        return b;
    }

    /**
     * @return
     * @Description 第9题逻辑
     * @LastChangeDate 2019/8/2
     * @Date 2019/8/2
     * @Params * @param
     */
    public static boolean Question9(int arr[]) {
        boolean b = false;
        if (arr[8] == 1 && ((arr[0] == arr[5]) ^ (arr[4] == arr[5]))) {
            b = true;
        }
        if (arr[8] == 2 && ((arr[0] == arr[5]) ^ (arr[4] == arr[9]))) {
            b = true;
        }
        if (arr[8] == 3 && ((arr[0] == arr[5]) ^ (arr[4] == arr[1]))) {
            b = true;
        }
        if (arr[8] == 4 && ((arr[0] == arr[5]) ^ (arr[4] == arr[8]))) {
            b = true;
        }
        return b;
    }

    /**
     * @return
     * @Description 第10题逻辑
     * @LastChangeDate 2019/8/2
     * @Date 2019/8/2
     * @Params * @param
     */
    public static boolean Question10(int arr[]) {
        boolean b = false;
        if (arr[9] == 1 && Utils2.Q10(arr) == 3) {
            b = true;
        }
        if (arr[9] == 2 && Utils2.Q10(arr) == 2) {
            b = true;
        }
        if (arr[9] == 3 && Utils2.Q10(arr) == 4) {
            b = true;
        }
        if (arr[9] == 4 && Utils2.Q10(arr) == 1) {
            b = true;
        }
        return b;
    }

    public static boolean panDuan(int arr[]) {
        if (Question2(arr) && Question3(arr) && Question4(arr) && Question5(arr)
                && Question6(arr) && Question7(arr) && Question8(arr) && Question9(arr) && Question10(arr)) {
            return true;
        }
        return false;
    }

    public static void printArr(int arr[]){
        for(int a : arr){
            System.out.print(a);
        }
    }

    public static void getArr(int arr[]){
           if (panDuan(arr)){
               printArr(arr);
       }
    }

}
