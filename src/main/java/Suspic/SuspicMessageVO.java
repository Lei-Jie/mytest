package Suspic;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.util.List;

/**
 * @author: lusen
 * @Date: 2020/12/8
 * @Class: Suspic.SuspicMessageVO
 * @Description: 可疑交易信息
 */
@Data
@JacksonXmlRootElement(localName = "STIF")
@JsonIgnoreProperties(ignoreUnknown = true)
public class SuspicMessageVO {
    @JacksonXmlProperty(isAttribute = true, localName = "seqno")
    private String seqno;

    @JacksonXmlProperty(localName = "ALIF")
    private ALIF alif;
    @JacksonXmlProperty(localName = "ICIF")
    private ICIF icif;

    @JacksonXmlElementWrapper(localName = "IABIs")
    @JacksonXmlProperty(localName = "IABI")
    private List<IABI> iabiList;

    @JacksonXmlProperty(localName = "TSIF")
    private TSIF tsif;

    @Data
    public static class ALIF{
        /**
         * 金融机构网点代码 --报备的管理机构
         */
        @JsonProperty("FINC")
        private String finc;
        /**
         * 投保人姓名/名称
         */
        @JsonProperty("ALNM")
        private String alnm;
        /**
         * 投保人身份证件/证明文件类型
         */
        @JsonProperty("AITP")
        private String aitp;
        /**
         * 其他身份证件/证明文件类型 --没有可填@N
         */
        @JsonProperty("OITP")
        private String oitp;
        /**
         * 投保人身份证件/证明文件号码
         */
        @JsonProperty("ALID")
        private String alid;
        /**
         * 投保人类型
         */
        @JsonProperty("ALTP")
        private String altp;

        public ALIF(String finc, String alnm, String aitp, String oitp, String alid, String altp) {
            this.finc = finc;
            this.alnm = alnm;
            this.aitp = aitp;
            this.oitp = oitp;
            this.alid = alid;
            this.altp = altp;
        }
    }
    @Data
    public static class ICIF{
        /**
         * 投保人客户号
         */
        @JsonProperty("APPNO")
        private String appno;
        /**
         * 保险类型 --01(个险）02(团险)
         */
        @JsonProperty("CONTTYPE")
        private String conttype;
        /**
         * 保险合同号
         */
        @JsonProperty("ICNM")
        private String icnm;
        /**
         * 保险种类 --默认01（人寿险）
         */
        @JsonProperty("ISTP")
        private String istp;
        /**
         * 保险名称
         */
        @JsonProperty("ISNM")
        private String isnm;
        /**
         * 保险编码
         */
        @JsonProperty("RISKCODE")
        private String riskcode;
        /**
         * 保险期间 --以起始日期+终止日期的形式报送，格式为“年年年年月月日日年年年年月月日日"
         */
        @JsonProperty("ISPS")
        private String isps;
        /**
         * 保险标的 --默认@N
         */
        @JsonProperty("ISOG")
        private String isog;
        /**
         * 保险金额 数值型，20 位	包括“."，小数点后最多保留3位小数。
         */
        @JsonProperty("ISAT")
        private String isat;
        /**
         * 保险费 数值型，20 位	包括“."，小数点后最多保留3位小数。
         */
        @JsonProperty("ISFE")
        private String isfe;
        /**
         * 保费缴费方式 01(期缴)，02(趸缴)，99(其他)
         */
        @JsonProperty("ISPT")
        private String ispt;
        /**
         * 保险合同其他信息 --没有可填@N
         */
        @JsonProperty("CTES")
        private String ctes;
        /**
         * 被保险人总数
         */
        @JsonProperty("ITNM")
        private String itnm;

        public ICIF(String appno, String conttype, String icnm, String istp, String isnm, String riskcode, String isps, String isog, String isat, String isfe, String ispt, String ctes, String itnm) {
            this.appno = appno;
            this.conttype = conttype;
            this.icnm = icnm;
            this.istp = istp;
            this.isnm = isnm;
            this.riskcode = riskcode;
            this.isps = isps;
            this.isog = isog;
            this.isat = isat;
            this.isfe = isfe;
            this.ispt = ispt;
            this.ctes = ctes;
            this.itnm = itnm;
        }
    }
    @Data
    public static class IABI{
        @JacksonXmlProperty(isAttribute = true, localName = "seqno")
        private String seqno;
        @JacksonXmlProperty(localName = "ISIF")
        private ISIF isif;
        /**
         * 受益人总数 --默认1
         */
        @JsonProperty("BNTN")
        private String bntn;
        @JacksonXmlElementWrapper(localName = "BNIFs")
        @JacksonXmlProperty(localName = "BNIF")
        private List<BNIF> bnifList;
    }
    @Data
    public static class ISIF{
        /**
         * 保险合同号
         */
        @JsonProperty("CSNM")
        private String csnm;
        /**
         * 被保险人编码
         */
        @JsonProperty("INSUREDNO")
        private String insuredno;
        /**
         * 被保险人姓名/名称
         */
        @JsonProperty("ISTN")
        private String istn;
        /**
         * 被保险人身份证件/证明文件类型 --没有可填@N
         */
        @JsonProperty("IITP")
        private String iitp;
        /**
         * 其他身份证件/证明文件类型 --没有可填@N
         */
        @JsonProperty("OITP")
        private String oitp;
        /**
         * 被保险人身份证件/证明文件号码 --没有可填@N
         */
        @JsonProperty("ISID")
        private String isid;
        /**
         * 投保人和被保险人关系
         */
        @JsonProperty("RLTP")
        private String rltp;

        public ISIF(String csnm, String insuredno, String istn, String iitp, String oitp, String isid, String rltp) {
            this.csnm = csnm;
            this.insuredno = insuredno;
            this.istn = istn;
            this.iitp = iitp;
            this.oitp = oitp;
            this.isid = isid;
            this.rltp = rltp;
        }
    }
    public static class BNIF{
        @JacksonXmlProperty(isAttribute = true, localName = "seqno")
        private String seqno;
        /**
         * 保险合同号
         */
        @JsonProperty("CSNM")
        private String csnm;
        /**
         * 被保险人编码
         */
        @JsonProperty("INSUREDNO")
        private String insuredNo;
        /**
         * 受益人姓名/名称 --没有可填@N
         */
        @JsonProperty("BNNM")
        private String bnnm;
        /**
         * 受益人身份证件/证明文件类型 --没有可填@N
         */
        @JsonProperty("BITP")
        private String bitp;
        /**
         * 其他身份证件/证明文件类型 --没有可填@N
         */
        @JsonProperty("OITP")
        private String oitp;
        /**
         * 受益人身份证件/证明文件号码 --没有可填@N
         */
        @JsonProperty("BNID")
        private String bnid;

        public BNIF(String seqno, String csnm, String insuredNo, String bnnm, String bitp, String oitp, String bnid) {
            this.seqno = seqno;
            this.csnm = csnm;
            this.insuredNo = insuredNo;
            this.bnnm = bnnm;
            this.bitp = bitp;
            this.oitp = oitp;
            this.bnid = bnid;
        }
    }
    @Data
    public static class TSIF{
        /**
         * 保险合同号
         */
        @JsonProperty("ICNMS")
        private String icnms;
        /**
         * 交易时间 --年年年年月月日日时时分分秒秒
         */
        @JsonProperty("TSTM")
        private String tstm;
        /**
         * 交易发生地
         */
        @JsonProperty("TRCD")
        private String trcd;
        /**
         * 保险交易类型
         */
        @JsonProperty("ITTP")
        private String ittp;
        /**
         * 资金进出方向
         */
        @JsonProperty("CRDR")
        private String crdr;
        /**
         * 资金进出方式
         */
        @JsonProperty("CSTP")
        private String cstp;
        /**
         * 交易币种
         */
        @JsonProperty("CRTP")
        private String crtp;
        /**
         * 交易金额
         */
        @JsonProperty("CRAT")
        private String crat;
        /**
         * 资金账户开户行
         */
        @JsonProperty("CAOI")
        private String caoi;
        /**
         * 银行转账资金账户
         */
        @JsonProperty("TCAN")
        private String tcan;
        /**
         * 保险合同号
         */
        @JsonProperty("ICNM")
        private String icnm;

        public TSIF(String icnms, String tstm, String trcd, String ittp, String crdr, String cstp, String crtp, String crat, String caoi, String tcan, String icnm) {
            this.icnms = icnms;
            this.tstm = tstm;
            this.trcd = trcd;
            this.ittp = ittp;
            this.crdr = crdr;
            this.cstp = cstp;
            this.crtp = crtp;
            this.crat = crat;
            this.caoi = caoi;
            this.tcan = tcan;
            this.icnm = icnm;
        }
    }
}
