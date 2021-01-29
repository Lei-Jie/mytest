import Suspic.SuspicDataResponseVO;

import java.io.IOException;

/**
 * @author: lusen
 * @Date: 2021/1/11
 * @Class: PACKAGE_NAME.fastxml6
 * @Description:
 */
public class fastxml6 {
    public static void main(String[] args) {
        String response = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<body>\n" +
                "    <head>\n" +
                "        <state>07</state>\n" +
                "        <msg>数据插入成功,dealno: 00000000000000001133</msg>\n" +
                "    </head>\n" +
                "</body>";
        try {
            SuspicDataResponseVO suspicDataResponseVO = XmlUtils.xmlStringToObject(response, SuspicDataResponseVO.class);
            System.out.println(suspicDataResponseVO);
        } catch (IOException e) {
        }
    }
}
