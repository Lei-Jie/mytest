
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

/**
 * @author: lusen
 * @Date: 2020/12/7
 * @Class: PACKAGE_NAME.fastxml1
 * @Description: 1
 */
public class fastxml1 {
    public static void main(String[] args) {
        try {
            String address = "http://10.0.11.38:7081/aml/insertISDataWS/isImport?wsdl";
            JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
            jaxWsProxyFactoryBean.setAddress(address);
            jaxWsProxyFactoryBean.setServiceClass(IsImportDataWebService.class);
            IsImportDataWebService is = (IsImportDataWebService) jaxWsProxyFactoryBean.create();
            System.out.println("xml之前-------------------------");
            String xml = "<?xml version=\"1.0\" encoding=\"utf‐8\"?>\n" +
                    "<ISTR>\n" +
                    "<RBIF>\n" +
                    "<RICD>F2001011000019</RICD>\n" +
                    "<RPNC>86330000</RPNC>\n" +
                    "<DETR>01</DETR>\n" +
                    "<TORP>1</TORP>\n" +
                    "<ORXN>初次报送的可疑交易报告报文名称</ORXN>\n" +
                    "<DORP>01</DORP>\n" +
                    "<ODRP>@N</ODRP>\n" +
                    "<TPTR>01</TPTR>\n" +
                    "<OTPR>@N</OTPR>\n" +
                    "<STCB>客户于2004年8月13日购买民生康泰重大疾病两全保险，年交保费1296.5元，20年交，目前保单处于承保状态。投保人为离退休人员（无兼职），被保人为广告设计人员。投保人、被保险人为中国籍客户，不属于外籍客户。排除洗钱风险，放弃上报。</STCB>\n" +
                    "<AOSP>九大信息已更新。</AOSP>\n" +
                    "<CSNM>0000133119</CSNM>\n" +
                    "<CONTTYPES>1</CONTTYPES>\n" +
                    "<TOSCs>\n" +
                    "<TOSC seqno=\"1\">1101</TOSC>\n" +
                    "<TOSC seqno=\"2\">1402</TOSC>\n" +
                    "</TOSCs>\n" +
                    "<STCRs>\n" +
                    "<STCR seqno=\"1\">1106</STCR>\n" +
                    "</STCRs>\n" +
                    "<SETN>1</SETN>\n" +
                    "<STNM>1</STNM>\n" +
                    "<RPNM>001</RPNM>\n" +
                    "<MIRS>@N</MIRS>\n" +
                    "</RBIF>\n" +
                    "<SEIFs>\n" +
                    "<SEIF seqno=\"1\">\n" +
                    "<SEVC>20234</SEVC>\n" +
                    "<SIIFs>\n" +
                    "<SIIF seqno=\"1\">\n" +
                    "<SENM>刘陈蔚</SENM>\n" +
                    "<SETP>110001</SETP>\n" +
                    "<OITP>@N</OITP>\n" +
                    "<SEID>330103199310051615</SEID>\n" +
                    "</SIIF>\n" +
                    "</SIIFs>\n" +
                    "<STNTs>\n" +
                    "<STNT seqno=\"1\">CHN</STNT>\n" +
                    "<STNT seqno=\"2\">CHN</STNT>\n" +
                    "</STNTs>\n" +
                    "<SCTLs>\n" +
                    "<SCTL seqno=\"1\">15867109951</SCTL>\n" +
                    "<SCTL seqno=\"2\">13633179958</SCTL>\n" +
                    "</SCTLs>\n" +
                    "<SEARs>\n" +
                    "<SEAR seqno=\"1\">浙江省杭州市下城区朝晖五区27-3-201</SEAR>\n" +
                    "<SEAR seqno=\"2\">前庄二队44号</SEAR>\n" +
                    "</SEARs>\n" +
                    "<SEEIs>\n" +
                    "<SEEI seqno=\"1\">@N</SEEI>\n" +
                    "<SEEI seqno=\"2\">@N</SEEI>\n" +
                    "</SEEIs>\n" +
                    "<SRIF>\n" +
                    "<SRNM>@N</SRNM>\n" +
                    "<SRIT>@N</SRIT>\n" +
                    "<ORIT>@N</ORIT>\n" +
                    "<SRID>@N</SRID>\n" +
                    "<SCNM>@N</SCNM>\n" +
                    "<SCIT>@N</SCIT>\n" +
                    "<OCIT>@N</OCIT>\n" +
                    "<SCID>@N</SCID>\n" +
                    "</SRIF>\n" +
                    "</SEIF>\n" +
                    "</SEIFs>\n" +
                    "<STIFs>\n" +
                    "<STIF seqno=\"1\">\n" +
                    "<ALIF>\n" +
                    "<FINC>86330000</FINC>\n" +
                    "<ALNM>陈爱梅</ALNM>\n" +
                    "<AITP>110001</AITP>\n" +
                    "<OITP>@N</OITP>\n" +
                    "<ALID>330107671205062</ALID>\n" +
                    "<ALTP>07</ALTP>\n" +
                    "</ALIF>\n" +
                    "<ICIF>\n" +
                    "<APPNO>0000133119</APPNO>\n" +
                    "<CONTTYPE>1</CONTTYPE>\n" +
                    "<ICNM>86330020040210011840</ICNM>\n" +
                    "<ISTP>01</ISTP>\n" +
                    "<ISNM>民生康泰重大疾病两全保险</ISNM>\n" +
                    "<RISKCODE>ttt</RISKCODE>\n" +
                    "<ISPS>2020081320540912</ISPS>\n" +
                    "<ISOG>人的生命与健康</ISOG>\n" +
                    "<ISAT>50000.000</ISAT>\n" +
                    "<ISFE>1296.500</ISFE>\n" +
                    "<ISPT>01</ISPT>\n" +
                    "<CTES>@N</CTES>\n" +
                    "<ITNM>2</ITNM>\n" +
                    "</ICIF>\n" +
                    "<IABIs>\n" +
                    "<IABI seqno=\"1\">\n" +
                    "<ISIF>\n" +
                    "<CSNM>86330020040210011840</CSNM>\n" +
                    "<INSUREDNO>0000133119</INSUREDNO>\n" +
                    "<ISTN>刘陈蔚</ISTN>\n" +
                    "<IITP>110001</IITP>\n" +
                    "<OITP>@N</OITP>\n" +
                    "<ISID>330103199310051615</ISID>\n" +
                    "<RLTP>04</RLTP>\n" +
                    "</ISIF>\n" +
                    "<BNTN>2</BNTN>\n" +
                    "<BNIFs>\n" +
                    "<BNIF seqno=\"1\">\n" +
                    "<CSNM>86330020040210011840</CSNM>\n" +
                    "<INSUREDNO>0000133119</INSUREDNO>\n" +
                    "<BNNM>刘陈蔚</BNNM>\n" +
                    "<BITP>110001</BITP>\n" +
                    "<OITP>@N</OITP>\n" +
                    "<BNID>330103199310051615</BNID>\n" +
                    "</BNIF>\n" +
                    "<BNIF seqno=\"2\">\n" +
                    "<CSNM>86330020040210011840</CSNM>\n" +
                    "<INSUREDNO>0000133119</INSUREDNO>\n" +
                    "<BNNM>陈爱梅</BNNM>\n" +
                    "<BITP>110001</BITP>\n" +
                    "<OITP>@N</OITP>\n" +
                    "<BNID>330107196712050625</BNID>\n" +
                    "</BNIF>\n" +
                    "</BNIFs>\n" +
                    "</IABI>\n" +
                    "<IABI seqno=\"2\">\n" +
                    "<ISIF>\n" +
                    "<CSNM>86330020040210011840</CSNM>\n" +
                    "<INSUREDNO>0000197747</INSUREDNO>\n" +
                    "<ISTN>应宛蓉</ISTN>\n" +
                    "<IITP>110005</IITP>\n" +
                    "<OITP>@N</OITP>\n" +
                    "<ISID>331082200406210066</ISID>\n" +
                    "<RLTP>01</RLTP>\n" +
                    "</ISIF>\n" +
                    "<BNTN>0</BNTN>\n" +
                    "<BNIFs>\n" +
                    "<BNIF seqno=\"1\">\n" +
                    "<CSNM>86330020040210011840</CSNM>\n" +
                    "<INSUREDNO>0000197747</INSUREDNO>\n" +
                    "<BNNM>@N</BNNM>\n" +
                    "<BITP>@N</BITP>\n" +
                    "<OITP>@N</OITP>\n" +
                    "<BNID>@N</BNID>\n" +
                    "</BNIF>\n" +
                    "</BNIFs>\n" +
                    "</IABI>\n" +
                    "</IABIs>\n" +
                    "<TSIF>\n" +
                    "<ICNMS>86330020040210011840</ICNMS>\n" +
                    "<TSTM>20200813</TSTM>\n" +
                    "<TRCD>CHN330100</TRCD>\n" +
                    "<ITTP>99</ITTP>\n" +
                    "<CRDR>01</CRDR>\n" +
                    "<CSTP>02</CSTP>\n" +
                    "<CRTP>CNY</CRTP>\n" +
                    "<CRAT>1296.500</CRAT>\n" +
                    "<CAOI>中国工商银行杭州市分行</CAOI>\n" +
                    "<TCAN>1202051801202023662</TCAN>\n" +
                    "<ICNM>86330020040210011840</ICNM>\n" +
                    "</TSIF>\n" +
                    "</STIF>\n" +
                    "\n" +
                    "<STIF seqno=\"2\">\n" +
                    "<ALIF>\n" +
                    "<FINC>86371300</FINC>\n" +
                    "<ALNM>陈飞</ALNM>\n" +
                    "<AITP>110001</AITP>\n" +
                    "<OITP>@N</OITP>\n" +
                    "<ALID>371302198508243450</ALID>\n" +
                    "<ALTP>07</ALTP>\n" +
                    "</ALIF>\n" +
                    "<ICIF>\n" +
                    "<APPNO>0009915174</APPNO>\n" +
                    "<CONTTYPE>1</CONTTYPE>\n" +
                    "<ICNM>86371320090210062059</ICNM>\n" +
                    "<ISTP>01</ISTP>\n" +
                    "<ISNM>民生年年红两全保险（分红型）</ISNM>\n" +
                    "<RISKCODE>zzz</RISKCODE>\n" +
                    "<ISPS>2009113020291129</ISPS>\n" +
                    "<ISOG>人的生命与健康</ISOG>\n" +
                    "<ISAT>94000.000</ISAT>\n" +
                    "<ISFE>1782.330</ISFE>\n" +
                    "<ISPT>01</ISPT>\n" +
                    "<CTES>@N</CTES>\n" +
                    "<ITNM>1</ITNM>\n" +
                    "</ICIF>\n" +
                    "<IABIs>\n" +
                    "<IABI seqno=\"1\">\n" +
                    "<ISIF>\n" +
                    "<CSNM>86371320090210062059</CSNM>\n" +
                    "<INSUREDNO>0009915174</INSUREDNO>\n" +
                    "<ISTN>陈姝含</ISTN>\n" +
                    "<IITP>110005</IITP>\n" +
                    "<OITP>@N</OITP>\n" +
                    "<ISID>371302200901273445</ISID>\n" +
                    "<RLTP>01</RLTP>\n" +
                    "</ISIF>\n" +
                    "<BNTN>0</BNTN>\n" +
                    "<BNIFs>\n" +
                    "<BNIF seqno=\"1\">\n" +
                    "<CSNM>86371320090210062059</CSNM>\n" +
                    "<INSUREDNO>0009915174</INSUREDNO>\n" +
                    "<BNNM>@N</BNNM>\n" +
                    "<BITP>@N</BITP>\n" +
                    "<OITP>@N</OITP>\n" +
                    "<BNID>@N</BNID>\n" +
                    "</BNIF>\n" +
                    "</BNIFs>\n" +
                    "</IABI>\n" +
                    "</IABIs>\n" +
                    "<TSIF>\n" +
                    "<ICNMS>86371320090210062059</ICNMS>\n" +
                    "<TSTM>20191130</TSTM>\n" +
                    "<TRCD>CHN371300</TRCD>\n" +
                    "<ITTP>99</ITTP>\n" +
                    "<CRDR>01</CRDR>\n" +
                    "<CSTP>02</CSTP>\n" +
                    "<CRTP>CNY</CRTP>\n" +
                    "<CRAT>2555.000</CRAT>\n" +
                    "<CAOI>中国农业银行济南分行</CAOI>\n" +
                    "<TCAN>6228481821068488210</TCAN>\n" +
                    "<ICNM>86371320090210062059</ICNM>\n" +
                    "</TSIF>\n" +
                    "</STIF>\n" +
                    "</STIFs>\n" +
                    "</ISTR>\n";
            System.out.println("xml之后----------------------------------------");
            String data = is.isImportData(xml);
            System.out.println("----------------------------------------------------------------------------------  -----");
            System.out.println("返回结果" + data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
