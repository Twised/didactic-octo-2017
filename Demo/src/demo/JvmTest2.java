package demo;

import question.Utils3;

/**
 * @author wjl
 * @description 测试jvm的类加载器
 * @date 2019/8/29
 */
public class JvmTest2 {
    public static void main(String[] args) throws ClassNotFoundException {
        long maxMemory = Runtime.getRuntime().maxMemory();
        Utils3.print(maxMemory/(double)1024/1024);
    }
}
