package arrayss;

/**
 * @author CHEN YANJIN
 * @date 2022/8/8 15:56
 */
public class ArrTest {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3};
        int[] arr2 = arr1;
        arr2[0] = 99;
        System.out.println(arr1[0]);



    }

}
