import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator;

import java.io.IOException;

/**
 * @author: lusen
 * @Date: 2020/12/8
 * @Class: PACKAGE_NAME.fastxml3
 * @Description: 3
 */
public class fastxml3 {
    public static void main(String[] args) {

        String xml = "<?xml version=\"1.0\" encoding=\"utf‐8\"?>\n" +
                "<Message>\n" +
                " <Message_Header>\n" +
                "  <msgId></msgId>\n" +
                "  <msgRef>66666</msgRef>\n" +
                "  <channel>admin</channel>\n" +
                "  <fromNodeId>admin</fromNodeId>\n" +
                "  <toServiceCode>YW-20200811-0UORY</toServiceCode>\n" +
                "  <externalReferenceNo>444</externalReferenceNo>\n" +
                "  <transactionBranch>88888</transactionBranch>\n" +
                "  <transactionDate>20120918</transactionDate>\n" +
                "  <msgPri>1</msgPri>\n" +
                "  <msgVer>1.0.1</msgVer>\n" +
                "  <replyCode></replyCode>\n" +
                "  <replyText></replyText>\n" +
                " </Message_Header>\n" +
                " <Message_Body>\n" +
                "  <request>\n" +
                "         <trcd>aaaaaa</trcd>\n" +
                "         <channo>57</channo>\n" +
                "         <charset>UTF-8</charset>\n" +
                "         <bussid></bussid>\n" +
                "         <branchno>444</branchno>\n" +
                "         <signbranchno>555</signbranchno>\n" +
                "         <immedflag>0</immedflag>\n" +
                "         <lastsndtime></lastsndtime>\n" +
                "         <msgcode></msgcode>\n" +
                "         <msgdesc></msgdesc>\n" +
                "         <jyrq>8月28日</jyrq>\n" +
                "         <jysj>10:38</jysj>\n" +
                "         <name>张三</name>\n" +
                "         <mobile>18007729591</mobile>\n" +
                "         <cdno1></cdno1>\n" +
                "         <cdno2>555555</cdno2>\n" +
                "         <amount>1.00</amount>\n" +
                "         <endbal>8888</endbal>\n" +
                "         <curtype>￥</curtype>\n" +
                "         <mark1></mark1>\n" +
                "         <mark2></mark2>\n" +
                "         <mark3></mark3>\n" +
                "         <mark4>666</mark4>\n" +
                "  </request>\n" +
                " </Message_Body>\n" +
                "</Message>";

        try {
            EsbMessageReq esbMessageReq = XmlUtils.xmlStringToObject(xml, EsbMessageReq.class);
            EsbMessageReq.EsbMessageHead messageHead = esbMessageReq.getEsbMessageHead();
            messageHead.setMsgId("-------------------");
            esbMessageReq.setEsbMessageHead(messageHead);
            System.out.println(esbMessageReq);
            System.out.println("-------------------------------------------------------------------------------------------");
            //String xmlString = XmlUtils.objectToXmlString(esbMessageReq);
            //System.out.println(xmlString);

            XmlMapper xmlMapper = new XmlMapper();
            xmlMapper.setDefaultUseWrapper(false);
            //字段为null，自动忽略，不再序列化
            xmlMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
            //XML标签名:使用骆驼命名的属性名，
            xmlMapper.setPropertyNamingStrategy(PropertyNamingStrategy.UPPER_CAMEL_CASE);
            //设置转换模式
            xmlMapper.enable(MapperFeature.USE_STD_BEAN_NAMING);
            xmlMapper.configure(ToXmlGenerator.Feature.WRITE_XML_DECLARATION,true);
            String result = xmlMapper.writeValueAsString(esbMessageReq);
            System.out.println("序列化结果：" + result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
