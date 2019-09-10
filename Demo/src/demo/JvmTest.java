package demo;

/**
 * @author wjl
 * @description 测试jvm的类加载器
 * @date 2019/8/29
 */
public class JvmTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Object obj = new Object();
        Demo1 demo1 = new Demo1();
        System.out.println(obj.getClass().getClassLoader());
        System.out.println(demo1.getClass().getClassLoader());
        System.out.println(Demo1.class.getClassLoader());
        System.out.println(Class.forName("demo.Demo1").getClassLoader().getParent());
    }
}
