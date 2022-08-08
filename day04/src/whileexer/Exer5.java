package whileexer;

import java.util.Scanner;

/**
 * @author CHEN YANJIN
 * @date 2022/8/7 11:18
 */
public class Exer5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ans = ' ';
        do {
            System.out.println("使出五连击");
            System.out.println("还钱吗？y/n");
            ans = scanner.next().charAt(0);
            System.out.println("回答是" + ans);
        }while (ans != 'y');




    }
}
