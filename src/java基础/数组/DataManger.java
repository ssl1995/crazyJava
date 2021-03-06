package java基础.数组;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DataManger {
    // 定义数组长度
    private int arrLen = 10;

    public static void main(String[] args) {
        DataManger dm = new DataManger();
        Scanner sc = new Scanner(System.in);
        int input = 0;
        int[] a = null;
        int n = 0, k = 0;
        while (true) {
            dm.notice();
            System.out.println("请输入对应的数字进行操作：");
            try {
                input = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("输入的数据格式有误，不能有非数字！");
                sc.next();
                continue;
            }
            if (input == 0) {
                System.out.println("退出程序！");
                break;
            }
            switch (input) {
                case 1:
                    //插入数据
                    a = dm.insertData();
                    //显示数据
                    System.out.println("数组元素为：");
                    dm.showData(a, a.length - 1);
                    break;
                case 2:
                    if (a != null) {
                        System.out.println("数组元素为：");
                        if (a[a.length - 1] == 0) {
                            dm.showData(a, a.length - 1);
                        } else {
                            dm.showData(a, a.length);
                        }
                    } else {
                        System.out.println("还未在数组中插入数据，请重新选择操作！");
                    }
                    break;
                case 3:
                    //在指定位置处插入数据
                    if (a != null) {
                        System.out.println("请输入要插入的数据：");
                        try {
                            n = sc.nextInt();
                            System.out.println("请输入要插入数据的位置：");
                            k = sc.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("输入的数据格式有误，不能有非数字！");
                            sc.next();
                            break;
                        }
                        dm.insertAtArr(a, k, n);
                        dm.showData(a, a.length);
                    } else {
                        System.out.println("还未在数组中插入数据，请重新选择操作！");
                    }
                    break;
                case 4:
                    //查询数组中能被3整除的元素
                    if (a != null) {
                        dm.divThree(a);
                    } else {
                        System.out.println("还未在数组中插入数据，请重新选择操作！");
                    }
                    break;
                default:
                    System.out.println("您输入的数字必须是1-4，请重新输入");
                    sc.next();
            }
        }
    }

    /**
     * 数组中插入数据
     *
     * @return
     */
    private int[] insertData() {
        int[] arr = new int[arrLen];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println("请输入" + (i + 1) + "个数据");
            try {
                arr[i] = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("输入的数据格式有误，请输入整型数据");
                sc.next();
                i--;
            }
        }
        return arr;
    }

    /**
     * 遍历数组元素
     *
     * @param arr
     * @param arrLen 指定参数显示数据个数
     */
    private void showData(int[] arr, int arrLen) {
        for (int i = 0; i < arrLen; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    /**
     * 指定位置插入数据
     *
     * @param arr
     * @param n   待插入数字
     * @param k   数组位置,从0到len-1
     */
    private void insertAtArr(int[] arr, int k, int n) {
        // 指定位置插入数据，从后往前移动，避免数据覆盖
        for (int i = arr.length - 1; i > k; i--) {
            arr[i] = arr[i - 1];
        }
        arr[k] = n;
    }

    /**
     * 输出数组中能被3整除的数字
     *
     * @param arr
     */
    private void divThree(int[] arr) {
        int count = 0;
        StringBuilder res = new StringBuilder();
        for (int num : arr) {
            if (num % 3 == 0) {
                res.append(num).append(" ");
                count++;
            }
        }
        if (count == 0) {
            System.out.println("数组中没有被3整除的数");
        } else {
            System.out.println("数组中被3整除的数:" + res.toString());
        }
    }

    /**
     * 提示信息
     */
    public void notice() {
        System.out.println("********************************************");
        System.out.println("                1--插入数据");
        System.out.println("                2--显示所有数据");
        System.out.println("                3--在指定位置处插入数据");
        System.out.println("                4--查询能被3整除的数据");
        System.out.println("                0--退出");
        System.out.println("********************************************");
    }

}
