package java基础.对象.多态.领取奶茶问题;

import java.util.Random;

public class User implements MilkTea {

    @Override
    public void collect() {
        int count = new Random().nextInt(150);
        if (count >= 0 && count < 60) {
            System.out.println("积攒不够60个，无法领取奶茶。");
        } else if (count >= 60 && count < 80) {
            System.out.println("积攒60个，送一杯珍珠奶茶。");
        } else if (count >= 80 && count < 100) {
            System.out.println("积攒80个，送一杯波霸奶茶加冰淇淋加奶霜。");
        } else if (count >= 100) {
            System.out.println("积攒100个，送一杯乌龙玛奇朵加波霸加仙草加冰淇淋。");
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new User().collect();
        }
    }

    private void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
