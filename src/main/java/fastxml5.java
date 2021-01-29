import Suspic.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: lusen
 * @Date: 2021/1/5
 * @Class: PACKAGE_NAME.fastxml5
 * @Description:
 */
public class fastxml5 {
    public static void main(String[] args) {
        try {
            String address = "http://10.0.11.38:7081/aml/insertISDataWS/isImport?wsdl";
            JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
            jaxWsProxyFactoryBean.setAddress(address);
            jaxWsProxyFactoryBean.setServiceClass(IsImportDataWebService.class);
            IsImportDataWebService is = (IsImportDataWebService) jaxWsProxyFactoryBean.create();

            SuspicDataImportVO importVO = new SuspicDataImportVO();
            ReportHeadVO headVO = new ReportHeadVO();
            headVO.setRicd("F2001011000019");
            headVO.setRpnc("86330000");
            headVO.setDetr("01");
            headVO.setTorp("1");
            headVO.setOrxn("初次报送的可疑交易报告报文名称");
            headVO.setDorp("01");
            headVO.setOdrp("@N");
            headVO.setTptr("01");
            headVO.setOtpr("@N");
            headVO.setStcb("客户于2004年8月13日购买民生康泰重大疾病两全保险，年交保费1296.5元，20年交，目前保单处于承保状态。投保人为离退休人员（无兼职），被保人为广告设计人员。投保人、被保险人为中国籍客户，不属于外籍客户。排除洗钱风险，放弃上报。");
            headVO.setAosp("九大信息已更新。");
            headVO.setCsnm("0000133119");
            headVO.setConttypes("1");
            List<ReportHeadVO.TOSC> toscList = new ArrayList<ReportHeadVO.TOSC>();
            toscList.add(new ReportHeadVO.TOSC("1","1101"));
            toscList.add(new ReportHeadVO.TOSC("2","1402"));
            headVO.setToscList(toscList);
            List<ReportHeadVO.STCR> stcrList = new ArrayList<ReportHeadVO.STCR>();
            stcrList.add(new ReportHeadVO.STCR("1","1106"));
            headVO.setStcrList(stcrList);
            headVO.setSetn("1");
            headVO.setStnm("1");
            headVO.setRpnm("001");
            headVO.setMirs("@N");
            importVO.setRbif(headVO);

            List<SuspicPersonVO> personList = new ArrayList<SuspicPersonVO>();
            SuspicPersonVO personVO = new SuspicPersonVO();
            personVO.setSeqno("1");
            personVO.setSevc("20234");
            ArrayList<SuspicPersonVO.SIIF> siifList = new ArrayList<SuspicPersonVO.SIIF>();
            siifList.add(new SuspicPersonVO.SIIF("1","刘陈蔚","110001","@N","330103199310051615"));
            personVO.setSiifList(siifList);
            ArrayList<SuspicPersonVO.STNT> stntList = new ArrayList<SuspicPersonVO.STNT>();
            stntList.add( new SuspicPersonVO.STNT("1","CHN"));
            stntList.add( new SuspicPersonVO.STNT("2","CHN"));
            personVO.setStntList(stntList);
            ArrayList<SuspicPersonVO.SCTL> sctlList = new ArrayList<SuspicPersonVO.SCTL>();
            sctlList.add(new SuspicPersonVO.SCTL("1","15867109951"));
            sctlList.add(new SuspicPersonVO.SCTL("2","13633179958"));
            personVO.setSctlList(sctlList);
            ArrayList<SuspicPersonVO.SEAR> searList = new ArrayList<SuspicPersonVO.SEAR>();
            searList.add(new SuspicPersonVO.SEAR("1","浙江省杭州市下城区朝晖五区27-3-201"));
            searList.add(new SuspicPersonVO.SEAR("2","前庄二队44号"));
            personVO.setSearList(searList);
            ArrayList<SuspicPersonVO.SEEI> seeiList = new ArrayList<SuspicPersonVO.SEEI>();
            seeiList.add(new SuspicPersonVO.SEEI("1","@N"));
            seeiList.add(new SuspicPersonVO.SEEI("2","@N"));
            personVO.setSeeiList(seeiList);
            personVO.setSrif(new SuspicPersonVO.SRIF("@N","@N","@N","@N","@N","@N","@N","@N"));
            personList.add(personVO);
            importVO.setSeifList(personList);

            List<SuspicMessageVO> messageList = new ArrayList<SuspicMessageVO>();
            SuspicMessageVO messageVO = new SuspicMessageVO();
            messageVO.setSeqno("1");
            messageVO.setAlif(new SuspicMessageVO.ALIF("86330000","陈爱梅","110001","@N","330107671205062","07"));
            messageVO.setIcif(new SuspicMessageVO.ICIF("0000133119","1","86330020040210011840","01","民生康泰重大疾病两全保险",
                    "ttt","2020081320540912","人的生命与健康","50000.000","1296.500","01","@N","2"));
            ArrayList<SuspicMessageVO.IABI> iabiList = new ArrayList<SuspicMessageVO.IABI>();
            SuspicMessageVO.IABI iabi1 = new SuspicMessageVO.IABI();
            iabi1.setSeqno("1");
            iabi1.setIsif(new SuspicMessageVO.ISIF("86330020040210011840","0000133119","刘陈蔚","110001","@N","330103199310051615","04"));
            iabi1.setBntn("2");
            ArrayList<SuspicMessageVO.BNIF> bnifList1 = new ArrayList<SuspicMessageVO.BNIF>();
            bnifList1.add(new SuspicMessageVO.BNIF("1","86330020040210011840","0000133119","刘陈蔚","110001","@N","330103199310051615"));
            bnifList1.add(new SuspicMessageVO.BNIF("2","86330020040210011840","0000133119","陈爱梅","110001","@N","330107196712050625"));
            iabi1.setBnifList(bnifList1);
            iabiList.add(iabi1);
            SuspicMessageVO.IABI iabi2 = new SuspicMessageVO.IABI();
            iabi2.setSeqno("2");
            iabi2.setIsif(new SuspicMessageVO.ISIF("86330020040210011840","0000197747","应宛蓉","110005","@N","331082200406210066","01"));
            iabi2.setBntn("0");
            ArrayList<SuspicMessageVO.BNIF> bnifList2 = new ArrayList<SuspicMessageVO.BNIF>();
            bnifList2.add(new SuspicMessageVO.BNIF("1","86330020040210011840","0000197747","@N","@N","@N","@N"));
            iabi2.setBnifList(bnifList2);
            iabiList.add(iabi2);
            messageVO.setIabiList(iabiList);
            messageVO.setTsif(new SuspicMessageVO.TSIF("86371320090210062059","20191130","CHN371300","99","01","02","CNY","2555.000","中国农业银行济南分行","6228481821068488210","86371320090210062059"));
            messageList.add(messageVO);
            importVO.setStifList(messageList);
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
            System.out.println(importVO);
            String result = xmlMapper.writeValueAsString(importVO);
            System.out.println("----------------序列化结果：-------------------");
            System.out.println(result);
            ObjectMapper objectMapper = new ObjectMapper();
            String string = objectMapper.writeValueAsString(importVO);
            System.out.println(string);

            String response = is.isImportData(result);
            System.out.println("----------------------------------------------------------------------------------  -----");
            System.out.println("返回结果" + response);
            SuspicDataResponseVO suspicDataResponseVO = XmlUtils.xmlStringToObject(response, SuspicDataResponseVO.class);
            System.out.println(suspicDataResponseVO);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
