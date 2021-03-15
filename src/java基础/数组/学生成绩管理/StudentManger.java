package java基础.数组.学生成绩管理;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentManger {

    public static void main(String[] args) {
        StudentManger manger = new StudentManger();
        Scanner sc = new Scanner(System.in);
        int userInput = 0;
        double[] arr = null;
        while (true) {
            manger.notice();
            try {
                userInput = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("输入的数据格式有误，请输入整型数据");
                sc.next();
                // catch块中跳出本次循环，不让程序结束
                continue;
            }
            switch (userInput) {
                case 0:
                    manger.outSystem();
                    break;
                case 1:
                    arr = manger.initMathArr();
                    break;
                case 2:
                    if (arr == null || arr.length < 1) {
                        System.out.println("尚未初始化数组，请输入1");
//                        sc.next();
                        break;
                    }
                    manger.getAverage(arr);
                    break;
                case 3:
                    if (arr == null || arr.length < 1) {
                        System.out.println("尚未初始化数组，请输入1");
                        break;
                    }
                    manger.getNumOf85(arr);
                    break;
                case 4:
                    if (arr == null || arr.length < 1) {
                        System.out.println("尚未初始化数组，请输入1");
                        break;
                    }
                    manger.updateArr(arr);
                    break;
                case 5:
                    if (arr == null || arr.length < 1) {
                        System.out.println("尚未初始化数组，请输入1");
                        break;
                    }
                    break;
                default:
                    System.out.println("输入数字过大,请输入0-5的数字");
                    break;
            }
        }
    }


    /**
     * 提示信息
     */
    private void notice() {
        System.out.println("********************************************");
        System.out.println("                1--初始化数学成绩");
        System.out.println("                2--求成绩的平均数");
        System.out.println("                3--统计成绩大于85分的人数");
        System.out.println("                4--修改制定位置处的成绩");
        System.out.println("                5--打印输出所有成绩");
        System.out.println("                0--退出");
        System.out.println("********************************************");
        System.out.println("请输入对应的数字进行操作:");
    }

    /**
     * 1-初始化数学成绩
     *
     * @return 数组
     */
    private double[] initMathArr() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要存储的数学成绩的数量:");
        double[] arr = null;
        try {
            int len = sc.nextInt();
            arr = new double[len];
            for (int i = 0; i < arr.length; i++) {
                System.out.println("请输入第" + (i + 1) + "个数据:");
                try {
                    arr[i] = sc.nextDouble();
                } catch (InputMismatchException e) {
                    System.out.println("输入的数据格式有误，请输入小数数据:");
                    sc.next();
                    i--;
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("输入的数据格式有误，请输入整型数据:");
            sc.next();
        }
        return arr;
    }

    /**
     * 2--求成绩的平均数
     *
     * @param arr 数组
     * @return 平均成绩
     */
    private void getAverage(double[] arr) {
        double sum = 0.0;
        for (double num : arr) {
            sum += num;
        }
        System.out.println("数学的平均成绩:" + (sum / arr.length));
    }

    /**
     * 3--统计成绩大于85分的人数
     *
     * @param arr 数组
     * @return 统计人数
     */
    private void getNumOf85(double[] arr) {
        int count = 0;
        for (double num : arr) {
            if (num > 85.0) {
                count++;
            }
        }
        System.out.println("成绩大于85分的人数为:" + count);
    }

    /**
     * 4--修改制定位置处的成绩
     *
     * @param arr 数组
     */
    private void updateArr(double[] arr) {
        System.out.println("修改前,成绩为:");
        printArr(arr);
        System.out.println("请输入要修改的数据位置(从0到" + (arr.length - 1) + "):");
        Scanner sc = new Scanner(System.in);
        int k = 0;
        double n = 0.0;
        try {
            // 判断用户输入的索引位置是否正确
            int temp = sc.nextInt();
            if (temp >= 0 && temp <= arr.length - 1) {
                k = temp;
            } else {
                System.out.println("修改位置错误，请输入(从0到" + (arr.length - 1) + "):");
                sc.next();
            }
        } catch (InputMismatchException e) {
            System.out.println("输入的数据格式有误，请输入从0到" + (arr.length - 1) + "的整数:");
            sc.next();
            // catch中添加return，提前结束方法防止k=0修改原数据
            return;
        }
        System.out.println("请输入新数据:");
        try {
            n = sc.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("输入的数据格式有误，请输入小数类型:");
            sc.next();
            return;
        }
        arr[k] = n;
        printArr(arr);
    }

    /**
     * 5--打印输出所有成绩
     *
     * @param arr 数组
     */
    private void printArr(double[] arr) {
        for (double num : arr) {
            System.out.print(num + "\t");
        }
        System.out.println();
    }

    /**
     * 0--退出
     */
    private void outSystem() {
        System.out.println("退出程序!");
        System.exit(0);
    }
}



