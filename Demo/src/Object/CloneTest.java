package Object;

/**
 * @author wjl
 * @description clone()测试
 * @date 2019/9/6
 */
public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        CloneTest1 s = new CloneTest1("zhangsan");

        CloneTest1 s1;
        s1 = (CloneTest1)s.clone();

        System.out.println(s1);
        System.out.println(s);
        System.out.println(s);
        System.out.println(s1.hashCode());


        Object obj = new CloneTest1("zhangsan");
        CloneTest1 ct1 = (CloneTest1)obj;
        System.out.println(obj.hashCode());
        System.out.println(ct1.hashCode());
    }

}