package Object;

/**
 * @author wjl
 * @description 克隆测试类
 * @date 2019/9/9
 */
public class CloneTest1 implements Cloneable {
    private String name;

    public CloneTest1(String name) {
        this.name = name;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "CloneTest1{" +
                "name='" + name + '\'' +
                '}';
    }
}
