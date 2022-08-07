package arimethicOprater;

import java.util.Scanner;

/**
 * @author CHEN YANJIN
 * @date 2022/8/4 15:26
 */
public class Input {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入名字");
        String name = scanner.next();
        System.out.println("请输入年龄");
        int age = scanner.nextInt();
        System.out.println("请输入工资");
        double salary = scanner.nextDouble();
        System.out.println("信息如下：" + name + "\t" + age + "\t" + salary + "\t");

    }
}
