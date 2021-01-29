package Suspic;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;
import lombok.Data;

import java.util.List;

/**
 * @author: lusen
 * @Date: 2020/12/8
 * @Class: Suspic.SuspicPersonVO
 * @Description: 可疑交易客户
 */
@Data
@JacksonXmlRootElement(localName = "SEIF")
@JsonIgnoreProperties(ignoreUnknown = true)
public class SuspicPersonVO {
    @JacksonXmlProperty(isAttribute = true, localName = "seqno")
    private String seqno;
    /**
     * 可疑主体职业（对私）或行业（对公） --没有可填@N
     */
    @JacksonXmlProperty(localName = "SEVC")
    private String sevc;

    @JacksonXmlElementWrapper(localName = "SIIFs")
    @JacksonXmlProperty(localName = "SIIF")
    private List<SIIF> siifList;

    @JacksonXmlElementWrapper(localName = "STNTs")
    @JacksonXmlProperty(localName = "STNT")
    private List<STNT> stntList;

    @JacksonXmlElementWrapper(localName = "SCTLs")
    @JacksonXmlProperty(localName = "SCTL")
    private List<SCTL> sctlList;

    @JacksonXmlElementWrapper(localName = "SEARs")
    @JacksonXmlProperty(localName = "SEAR")
    private List<SEAR> searList;

    @JacksonXmlElementWrapper(localName = "SEEIs")
    @JacksonXmlProperty(localName = "SEEI")
    private List<SEEI> seeiList;

    @JacksonXmlProperty(localName = "SRIF")
    private SRIF srif;

    @Data
    public static class SIIF{
        @JacksonXmlProperty(isAttribute = true, localName = "seqno")
        private String seqno;
        /**
         * 可疑主体姓名/名称
         */
        @JsonProperty("SENM")
        private String senm;

        /**
         * 可疑主体身份证件/证明文件类型
         */
        @JsonProperty("SETP")
        private String setp;
        /**
         * 其他身份证件/证明文件类型 --没有可填@N
         */
        @JsonProperty("OITP")
        private String oitp;
        /**
         * 可疑主体身份证件/证明文件号码
         */
        @JsonProperty("SEID")
        private String seid;

        public SIIF(String seqno, String senm, String setp, String oitp, String seid) {
            this.seqno = seqno;
            this.senm = senm;
            this.setp = setp;
            this.oitp = oitp;
            this.seid = seid;
        }
    }
    @Data
    public static class STNT{
        @JacksonXmlProperty(isAttribute = true, localName = "seqno")
        private String seqno;
        /**
         * 可疑主体国籍 1 --按照GB/T 2659-2000 世界各国和地区名称代码标准填写，没有可填@N
         */
        //@JacksonXmlText：指定当前这个值，没有xml标签包裹。
        //这个值意义在于,一般这个值所在的类只有这一个正常属性，或者其他属性全部为  @JacksonXmlProperty(isAttribute = true,
        @JacksonXmlText
        @JsonProperty("STNT")
        private String sent;

        public STNT(String seqno, String sent) {
            this.seqno = seqno;
            this.sent = sent;
        }
    }
    @Data
    public static class SCTL{
        @JacksonXmlProperty(isAttribute = true, localName = "seqno")
        private String seqno;
        /**
         * 可疑主体联系电话 1 --没有可填@N
         */
        @JacksonXmlText
        @JsonProperty("SCTL")
        private String sctl;

        public SCTL(String seqno, String sctl) {
            this.seqno = seqno;
            this.sctl = sctl;
        }
    }
    @Data
    public static class SEAR{
        @JacksonXmlProperty(isAttribute = true, localName = "seqno")
        private String seqno;
        /**
         * 可疑主体住址/经营地址 1 --没有可填@N
         */
        @JacksonXmlText
        @JsonProperty("SEAR")
        private String sear;

        public SEAR(String seqno, String sear) {
            this.seqno = seqno;
            this.sear = sear;
        }
    }
    @Data
    public static class SEEI{
        @JacksonXmlProperty(isAttribute = true, localName = "seqno")
        private String seqno;
        /**
         * 可疑主体其他联系方式 1 --没有可填@N
         */
        @JacksonXmlText
        @JsonProperty("SEEI")
        private String seei;

        public SEEI(String seqno, String seei) {
            this.seqno = seqno;
            this.seei = seei;
        }
    }
    @Data
    public static class SRIF{
        /**
         * 可疑主体法定代表人姓名 --没有可填@N
         */
        @JsonProperty("SRNM")
        private String srnm;
        /**
         * 可疑主体法定代表人身份证件类型 --没有可填@N
         */
        @JsonProperty("SRIT")
        private String srit;
        /**
         * 可疑主体法定代表人其他身份证件/证明文件类型 --没有可填@N
         */
        @JsonProperty("ORIT")
        private String orit;
        /**
         * 可疑主体法定代表人身份证件号码 --没有可填@N
         */
        @JsonProperty("SRID")
        private String seid;
        /**
         * 可疑主体控股股东或实际控制人名称 --没有可填@N
         */
        @JsonProperty("SCNM")
        private String scnm;
        /**
         * 可疑主体控股股东或实际控制人身份证件/证明文件类型 --没有可填@N
         */
        @JsonProperty("SCIT")
        private String scit;
        /**
         * 可疑主体控股股东或实际控制人其他身份证件/证明文件类型 --没有可填@N
         */
        @JsonProperty("OCIT")
        private String ocit;
        /**
         * 可疑主体控股股东或实际控制人身份证件/证明文件号码 --没有可填@N
         */
        @JsonProperty("SCID")
        private String scid;

        public SRIF(String srnm, String srit, String orit, String seid, String scnm, String scit, String ocit, String scid) {
            this.srnm = srnm;
            this.srit = srit;
            this.orit = orit;
            this.seid = seid;
            this.scnm = scnm;
            this.scit = scit;
            this.ocit = ocit;
            this.scid = scid;
        }
    }
}
