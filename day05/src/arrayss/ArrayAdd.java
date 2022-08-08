package arrayss;

import java.util.Scanner;

/**
 * @author CHEN YANJIN
 * @date 2022/8/8 19:32
 */
public class ArrayAdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = {1,2,3};
        do {
            int[] arrNew = new int[arr.length+1];
            for (int i = 0; i < arr.length; i++) {
                arrNew[i] = arr[i];
            }
            System.out.println("请输入你要添加的元素");
            int addNum = scanner.nextInt();
            arrNew[arrNew.length-1] = addNum;
            arr = arrNew;
            System.out.println("==========这是扩容后的arr=============");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "\t");
            }
            //是否继续添加
            System.out.println("是否继续添加， y/n");
            char ans = scanner.next().charAt(0);
            if (ans == 'n'){
                break;
            }
        }while (true);

        System.out.println("退出了添加");
    }

}
