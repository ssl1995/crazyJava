package java基础.集合;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CatNameComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        return o1.getName().compareTo(o2.getName());
    }
    public static void main(String[] args) {
        List<Cat> list = new ArrayList<>();
        list.add(new Cat(3, "张三", 1));
        list.add(new Cat(2, "李四", 3));
        list.add(new Cat(1, "王五", 4));
        System.out.println(list);
        // 方式一：重新定义一个类然后实现Comparator
        // Collections.sort(list, new CatNameComparator());
        // 方式二：使用lambda方式
        Collections.sort(list, (o1, o2) -> o1.getName().compareTo(o2.getName()));
        System.out.println(list);
    }
}
