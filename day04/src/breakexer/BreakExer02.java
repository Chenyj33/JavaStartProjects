package breakexer;

import java.util.Scanner;

/**
 * @author CHEN YANJIN
 * @date 2022/8/7 16:55
 */
public class BreakExer02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = "";
        String passWord="";
        int chance = 3;
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入名字");
            name = scanner.next();
            System.out.println("请输入密码");
            passWord = scanner.next();
            if ("丁丁".equals(name) && "123".equals(passWord)){
                System.out.println("登录成功");
                break;
            }
            chance--;
            System.out.println("你还有"+chance+"次机会");
        }

    }
}
