import java.nio.charset.Charset;

/**
 * @author: lusen
 * @Date: 2020/12/8
 * @Class: PACKAGE_NAME.fastxml2
 * @Description: 2
 */
public class fastxml2 {
    public static void main(String[] args) {
        XMLEncodeModel model = new XMLEncodeModel();
        model.setHeadParameter("HeadName1", "value1");
        model.setHeadParameter("HeadName2", "value2");
        model.setHeadParameter("HeadName3", "value3");

        model.setRootParameter("RootName1", "RootValue1");
        model.setRootParameter("RootName2", "RootValue2");
        model.setRootParameter("RootName3", "RootValue3");

        String xmlString = model.toSendData(Charset.forName("GBK"));
        System.out.println(xmlString);
    }
}
