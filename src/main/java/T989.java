import org.springframework.util.CollectionUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author: lusen
 * @Date: 2021/1/18
 * @Class: PACKAGE_NAME.T989
 * @Description:
 */
public class T989 {
    public static void main(String[] args) {
        int [] A = {1,2,0,8};
        int K = 34;
        /*for (; K < 100; K += 10) {
            System.out.println(K);
        }*/
        List<Integer> list = addToArrayForm1(A, K);
        System.out.println(list);
    }
    public static List<Integer> addToArrayForm1(int[] A, int K) {
        List<Integer> res = new ArrayList<Integer>();
        int n = A.length;
        for (int i = n - 1; i >= 0; --i) {
            int sum = A[i] + K % 10;
            System.out.println(sum);
            K /= 10;
            System.out.println(K);
            if (sum >= 10) {
                K++;
                sum -= 10;
            }
            System.out.println(sum);
            res.add(sum);
            System.out.println("--------------");
        }
        for (; K > 0; K /= 10) {
            res.add(K % 10);
        }
        Collections.reverse(res);
        return res;
    }
    public static List<Integer> addToArrayForm2(int[] A, int K) {
        List<Integer> res = new ArrayList<Integer>();
        int n = A.length;
        for (int i = n - 1; i >= 0 || K > 0; --i, K /= 10) {
            if (i >= 0) {
                K += A[i];
            }
            res.add(K % 10);
        }
        Collections.reverse(res);
        return res;
    }
    public static List<Integer> addToArrayForm3(int[] A, int K) {
        int n = A.length;
        List<Integer> res = new ArrayList<Integer>();
        int i = n - 1, sum = 0, carry = 0;
        while (i >= 0 || K != 0) {  // 循环条件：两个数有一个没完
            int x = i >= 0 ? A[i]: 0;
            int y = K != 0 ? K % 10 : 0;
            System.out.println("XY:"+x+"  "+y);

            sum = x + y + carry;
            carry = sum / 10;
            System.out.println("sum:"+sum+"  "+carry);
            K = K / 10;
            i--;
            res.add(0, sum % 10);
            System.out.println(res);
        }
        if (carry != 0) res.add(0, carry);
        return res;
    }

    public static List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> res = new ArrayList<Integer>();
        int num = 0;
        for (int i = 0; i < A.length; i++) {
            //System.out.println(A[i]);
            //System.out.println(Math.pow(10,A.length-i-1));
            num += A[i]*(Math.pow(10,A.length-i-1));
            //System.out.println(num);
        }
        num += K;
        while (num!=0){
            res.add(num%10);
            num = num/10;
            System.out.println(num);
        }
        Collections.reverse(res);
        return res;
    }

}
