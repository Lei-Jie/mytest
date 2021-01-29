import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: lusen
 * @Date: 2021/1/29
 * @Class: PACKAGE_NAME.T3
 * @Description:
 */
public class T3 {
    public static void main(String[] args) {
        //测试方法略..自己去测了哈
        //结果: ===>20200407133313000001
        System.out.println(getLocalTrmSeqNum());
    }


    private static int sequence = 0;
    private static int length = 6;

    public static synchronized String getLocalTrmSeqNum() {
        sequence = sequence >= 999999 ? 1 : sequence + 1;
        String datetime = new SimpleDateFormat("yyyyMMddHHmmss")
                .format(new Date());
        String s = Integer.toString(sequence);
        return datetime +addLeftZero(s, length);
    }

    /**
     * 左填0
     * @author shijing
     * 2018年6月29日下午1:24:32
     * @param s
     * @param length
     * @return
     */
    public static String addLeftZero(String s, int length) {
        // StringBuilder sb=new StringBuilder();
        int old = s.length();
        if (length > old) {
            char[] c = new char[length];
            char[] x = s.toCharArray();
            if (x.length > length) {
                throw new IllegalArgumentException(
                        "Numeric value is larger than intended length: " + s
                                + " LEN " + length);
            }
            int lim = c.length - x.length;
            for (int i = 0; i < lim; i++) {
                c[i] = '0';
            }
            System.arraycopy(x, 0, c, lim, x.length);
            return new String(c);
        }
        return s.substring(0, length);
    }
}
