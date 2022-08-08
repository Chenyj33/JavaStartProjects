package whileexer;

import java.util.Scanner;

/**
 * @author CHEN YANJIN
 * @date 2022/8/7 11:40
 */
public class Exer6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum =  0;
        for (int j = 1; j <= 3;j++){
            double sumOne = 0;
            int count = 0;
            for (int i = 1; i <= 5; i++) {
                System.out.println("请输入第"+ j + "个班的第"+ i +"个学生的成绩");
                double score = scanner.nextDouble();
                sumOne+=score;
                sum+= score;
                if (score >= 60){
                    count++;
                }
                //System.out.println("成绩为"+ score);
            }
            System.out.println("第"+ j+"个班级的平均分为"+sumOne/5 +"，及格人数为"+count+"个学生");
        }
        System.out.println("三个年纪的平均分为"+ sum/15);
    }
}
