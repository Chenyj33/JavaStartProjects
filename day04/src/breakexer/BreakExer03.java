package breakexer;

/**
 * @author CHEN YANJIN
 * @date 2022/8/7 17:52
 */
public class BreakExer03 {
    public static void main(String[] args) {

        int i = 1;
        while (i <= 4){
            i++;
            if(i== 2){
                continue;
            }
            System.out.println("i="+i);
        }
    }
}
