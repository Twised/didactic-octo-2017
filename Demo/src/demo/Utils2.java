package demo;

/**
 * @author wjl
 * @description 工具类
 * @date 2019/8/2
 */
public class Utils2 {
    /**
     * @Description 第3题工具方法
     * @LastChangeDate
     * @Date  2019/8/2
     * @Params  * @param null
     * @return
     */
    public static boolean Q3(int a1, int a2 ,int a3){
        if(a1 == a2 && a1 == a3){
            return true;
        }
        return false;
    }

    /**
     * @Description 第7题工具方法
     * @LastChangeDate
     * @Date  2019/8/2
     * @Params  * @param null
     * @return
     */
    public static int Q7(int arr[]){
        int i1 = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for(int a : arr){
            if(a == 1){
                i1++;
            }
            if(a == 2){
                i2++;
            }
            if(a == 3){
                i3++;
            }
            if(a == 4){
                i4++;
            }
        }
        int i = getMinIndex(i1, i2, i3, i4);
        return i;
    }

    /**
     * @Description 第8题工具方法
     * @LastChangeDate
     * @Date  2019/8/2
     * @Params  * @param null
     * @return
     */
    public static boolean Q8(int a1, int a2){

        if(Math.abs(a1 - a2) > 1){
            return  true;
        }
        return false;
    }

    /**
     * @Description 第10题工具方法
     * @LastChangeDate
     * @Date  2019/8/2
     * @Params  * @param null
     * @return
     */
    public static int Q10(int arr[]){
        int i1 = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for(int a : arr){
            if(a == 1){
                i1++;
            }
            if(a == 2){
                i2++;
            }
            if(a == 3){
                i3++;
            }
            if(a == 4){
                i4++;
            }
        }
        int max = getMax(i1, i2, i3, i4);
        int min = getMin(i1, i2, i3, i4);
        return max - min;
    }

    public static int getMaxIndex(int i1, int i2, int i3, int i4){
        int max = i1;
        int index = 1;
        if (i2 > max){
            index = 2;
        }
        if (i3 > max){
            index = 3;
        }
        if (i4 > max){
            index = 4;
        }
        return index;
    }

    public static int getMax(int i1, int i2, int i3, int i4){
        int max = i1;
        if (i2 > max){
            max = i2;
        }
        if (i3 > max){
            max = i3;
        }
        if (i4 > max){
            max = i4;
        }

        return max;
    }

    public static int getMin(int i1, int i2, int i3, int i4){
        int min = i1;
        if (i2 < min){
            min = i2;
        }
        if (i3 < min){
            min = i3;
        }
        if (i4 < min){
            min = i4;
        }
        return min;
    }

    public static int getMinIndex(int i1, int i2, int i3, int i4){
        int min = i1;
        int index = 1;
        if (i2 < min){
            index = 2;
        }
        if (i3 < min){
            index = 3;
        }
        if (i4 < min){
            index = 4;
        }
        return index;
    }
}
