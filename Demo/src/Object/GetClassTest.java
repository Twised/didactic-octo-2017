package Object;

import java.util.Date;

/**
 * @author wjl
 * @description 实验getClass()作用
 * @date 2019/9/6
 */
public class GetClassTest {
    public static void main(String[] args) {
        new Test().test();
        System.out.println(new Date().getClass());
        Object obj;
    }
}

class Test extends Date {
    public void test() {
        System.out.println(super.getClass().getName());
        System.out.println(super.getClass());
    }
}
