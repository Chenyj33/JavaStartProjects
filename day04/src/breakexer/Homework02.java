package breakexer;

/**
 * @author CHEN YANJIN
 * @date 2022/8/8 11:13
 */
public class Homework02 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 3 ; i++) {
            int temp  = 0;
            for (int j = 1; j <= i ; j++) {
                temp+=j;
            }
            sum+=temp;
        }
        System.out.println(sum);
    }
}
