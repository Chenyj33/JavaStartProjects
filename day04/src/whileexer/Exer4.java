package whileexer;

/**
 * @author CHEN YANJIN
 * @date 2022/8/7 11:12
 */
public class Exer4 {
    public static void main(String[] args) {
      int i = 1;
      int count = 0;
     do {
         if (i%5==0 && i%3 != 0){
             System.out.println("数字是" + i);
             count++;
         }
         i++;
     }while (i <= 200);
        System.out.println("总的数字有"+count);
    }
}
