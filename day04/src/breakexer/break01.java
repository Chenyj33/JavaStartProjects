package breakexer;

/**
 * @author CHEN YANJIN
 * @date 2022/8/7 16:02
 */
public class break01 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 3){
                //break;
                continue;
            }
            System.out.println("i=" + i);
        }
    }
}
