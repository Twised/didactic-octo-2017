package question.day01;

import question.Utils3;

/**
 * @author wjl
 * @description 面试题1-自增变量
 * @date 2019/8/28
 */
public class Question1 {
    public static void main(String[] args) {
        q1();
    }

    public static void q1() {
        int i = 1;
        i = i++;
        int j = i++;
        int k = i + ++i * i++;
        Utils3.print("i=" + i);
        Utils3.print("j=" + j);
        Utils3.print("k=" + k);
    }

    public static void q2() {
        int i = 3;
        int j = (++i) + (++i) + (++i);
        Utils3.print("j=" + j);
    }
}
