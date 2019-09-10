package Object;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author wjl
 * @description HashCode测试
 * @date 2019/9/6
 */
public class HashSetTest {

    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add(new Student(1, "zhangsan"));
        hs.add(new Student(2, "lisi"));
        hs.add(new Student(3, "wangwu"));
        hs.add(new Student(1, "zhangsan"));

        Iterator it = hs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}


class Student {
    int num;
    String name;

    Student(int num, String name) {
        this.num = num;
        this.name = name;
    }

    @Override
    public boolean equals(Object object) {
        if(object instanceof  Student) {
            Student student = (Student)object;
            if (this.num == student.num && this.name == student.name) {
                return true;
            }
        }else{
            super.equals(object);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode()*num;
    }

    public String toString() {
        return num + ":" + name;
    }
}