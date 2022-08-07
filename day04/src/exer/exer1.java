package exer;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

/**
 * @author CHEN YANJIN
 * @date 2022/8/6 17:14
 */
public class exer1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入a-e");
        char c = scanner.next().charAt(0);
        switch (c){
            case 'a':
                System.out.println("A");
                //break;
            case 'b':
                System.out.println("B");
                break;
            case 'c':
                System.out.println("C");
                break;
            case 'd':
                System.out.println("D");
                break;
            default:
                System.out.println("others");
        }


    }
}
