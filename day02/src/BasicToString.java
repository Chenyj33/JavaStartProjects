/**
 * @author CHEN YANJIN
 * @date 2022/8/2 16:20
 *
 */

public class BasicToString {

    public static void main(String[] args) {

        //基本类型转为String

        int n1 = 10;
        float n2 = 1.1f;
        double n3 = 5.7;
        String str1 = n1 + "";
        String str2 = n2 + "";

        //String -> 基本数据类型

        String s4 = "1234";
        int num1 = Integer.parseInt(s4);



    }
}
