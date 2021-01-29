import com.alibaba.fastjson.JSON;
import org.springframework.util.StringUtils;

import javax.xml.crypto.Data;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import org.springframework.http.MediaType;
import org.springframework.web.context.request.NativeWebRequest;

/**
 * @author: lusen
 * @Date: 2021/1/19
 * @Class: PACKAGE_NAME.T2
 * @Description:
 */
public class T2 extends Thread {
    public T2(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.println("" + this.getName() + "-----" + i);
            // 当i为30时，该线程就会把CPU时间让掉，让其他或者自己的线程执行（也就是谁先抢到谁执行）
            if (i == 30) {
                this.yield();
            }
        }
    }

    public static void main(String[] args) {
        /*T2 yt1 = new T2("张三");
        T2 yt2 = new T2("李四");
        yt1.start();
        yt2.start();*/
        Person p = null;
        System.out.println(JSON.toJSONString(p));
    }
}
