
import Suspic.SuspicPersonVO.SIIF;
import Suspic.SuspicPersonVO.SEAR;
import Suspic.SuspicPersonVO.SCTL;
import Suspic.SuspicPersonVO.SEEI;
import Suspic.SuspicPersonVO.SRIF;import Suspic.ReportHeadVO;
import Suspic.ReportHeadVO.STCR;
import Suspic.ReportHeadVO.TOSC;
import Suspic.SuspicDataImportVO;
import Suspic.SuspicMessageVO;
import Suspic.SuspicPersonVO;
import Suspic.SuspicPersonVO.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator;

import java.io.IOException;
import java.util.ArrayList;

/**
 * @author: lusen
 * @Date: 2020/12/8
 * @Class: PACKAGE_NAME.fastxml4
 * @Description:
 */
public class fastxml4 {
    public static void main(String[] args) {
        try {
            /*String address = "http://10.0.11.38:7081/aml/insertISDataWS/isImport?wsdl";
            JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
            jaxWsProxyFactoryBean.setAddress(address);
            jaxWsProxyFactoryBean.setServiceClass(IsImportDataWebService.class);
            IsImportDataWebService is = (IsImportDataWebService) jaxWsProxyFactoryBean.create();
            System.out.println("xml之前-------------------------");
            String xml = "";
            String data = is.isImportData(xml);
            System.out.println("----------------------------------------------------------------------------------  -----");
            System.out.println("返回结果" + data);

            EsbMessageReq esbMessageReq = XmlUtils.xmlStringToObject(xml, EsbMessageReq.class);
            System.out.println(esbMessageReq);*/
            System.out.println("-------------------------------------------------------------------------------------------");

            XmlMapper xmlMapper = new XmlMapper();
            xmlMapper.setDefaultUseWrapper(false);
            //字段为null，自动忽略，不再序列化
            xmlMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
            //XML标签名:使用骆驼命名的属性名，
            xmlMapper.setPropertyNamingStrategy(PropertyNamingStrategy.UPPER_CAMEL_CASE);
            //设置转换模式
            xmlMapper.enable(MapperFeature.USE_STD_BEAN_NAMING);
            xmlMapper.configure(ToXmlGenerator.Feature.WRITE_XML_DECLARATION,true);
            SuspicDataImportVO importVO = new SuspicDataImportVO();
            ReportHeadVO headVO = new ReportHeadVO();
            headVO.setRicd("1");
            headVO.setRpnc("2");
            headVO.setDetr("3");
            headVO.setTorp("4");
            headVO.setOrxn("5");

            ArrayList<SuspicPersonVO> personVOS = new ArrayList<SuspicPersonVO>();
            importVO.setRbif(headVO);
            importVO.setSeifList(personVOS);
            importVO.setStifList(new ArrayList<SuspicMessageVO>());
            System.out.println(importVO);
            String result = xmlMapper.writeValueAsString(importVO);
            System.out.println("----------------序列化结果：-------------------");
            System.out.println(result);
            ObjectMapper objectMapper = new ObjectMapper();
            String string = objectMapper.writeValueAsString(importVO);
            System.out.println(string);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
