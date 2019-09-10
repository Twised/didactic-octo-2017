package demo;

import question.Utils3;

import java.util.Random;

/**
 * @author wjl
 * @description 测试jvm的类加载器
 * @date 2019/8/29
 */
public class Test2 {
    public static void main(String[] args) throws ClassNotFoundException {
        int i = new Random().nextInt(3);
        Utils3.print(i);
    }
}
