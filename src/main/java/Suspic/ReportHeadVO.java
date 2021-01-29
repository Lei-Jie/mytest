package Suspic;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
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
 * @Class: Suspic.ReportHeadVO
 * @Description: 可疑交易上报头
 */
@Data
@JacksonXmlRootElement(localName = "RBIF")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReportHeadVO {

    /**
     * --14位报送机构编码  默认值F2001011000019
     */
    @JsonProperty("RICD")
    private String ricd;
    /**
     * 上报网点代码 --报备的管理机构  保单对应的管理机构
     */
    @JsonProperty("RPNC")
    private String rpnc;
    /**
     * 可疑交易报告紧急程度 --01：非特别紧急，02：特别紧急。涉黑涉恐默认02
     */
    @JsonProperty("DETR")
    private String detr;
    /**
     * 报送次数标志 --默认写1
     */
    @JsonProperty("TORP")
    private String torp;
    /**
     * 初次报送的可疑交易报告报文名称 --填写@N
     */
    @JsonProperty("ORXN")
    private String orxn;
    /**
     * 报送方向 --默认01
     */
    @JsonProperty("DORP")
    private String dorp;
    /**
     * 其他报送方向 ----填写@N
     */
    @JsonProperty("ODRP")
    private String odrp;
    /**
     * 可疑交易报告触发点 --01，02，03，04，05，06，99
     */
    @JsonProperty("TPTR")
    private String tptr;
    /**
     * 其他可疑交易报告触发点 --01，02，03，04，05，06，99
     */
    @JsonProperty("OTPR")
    private String otpr;
    /**
     * 资金交易及客户行为情况 --填写@N
     */
    @JsonProperty("STCB")
    private String stcb;
    /**
     * 疑点分析 --填写@N
     */
    @JsonProperty("AOSP")
    private String aosp;
    /**
     * 投保人客户号
     */
    @JsonProperty("CSNM")
    private String csnm;
    /**
     * 保险类型 --01(个险）02(团险)
     */
    @JsonProperty("CONTTYPES")
    private String conttypes;

    //@JacksonXmlElementWrapper：可用于指定List等集合类，外围标签名；
    @JacksonXmlElementWrapper(localName = "TOSCs")
    /**
     * 疑似涉罪类型 --0201 -涉嫌与黑社会性质组织犯罪相关的可疑交易行为    0301-涉嫌与恐怖主义活动犯罪相关的可疑交易行为
     */
    //@JacksonXmlProperty：指定包装标签名，或者指定标签内部属性名；
    @JacksonXmlProperty(localName = "TOSC")
    private List<TOSC> toscList;

    @JacksonXmlElementWrapper(localName = "STCRs")
    /**
     * 可疑交易特征代码 --报备的可疑交易特征  默认0801   经核心系统筛查比对确认客户为恐怖组织或恐怖分子的。
     */
    @JacksonXmlProperty(localName = "STCR")
    private List<STCR> stcrList;
    /**
     * 可疑主体总数 --填写1
     */
    @JsonProperty("SETN")
    private String setn;
    /**
     * 可疑交易总数 --填写1
     */
    @JsonProperty("STNM")
    private String stnm;
    /**
     * 可疑交易报告的填报人员 --系统操作人
     */
    @JsonProperty("RPNM")
    private String rpnm;
    /**
     * 人工补正标识 --填写@N
     */
    @JsonProperty("MIRS")
    private String mirs;

    @Data
    public static class TOSC{
        @JacksonXmlProperty(isAttribute = true, localName = "seqno")
        private String seqno;

        //@JacksonXmlText：指定当前这个值，没有xml标签包裹。
        //这个值意义在于,一般这个值所在的类只有这一个正常属性，或者其他属性全部为  @JacksonXmlProperty(isAttribute = true,
        @JacksonXmlText
        @JsonProperty("TOSC")
        private String tosc;

        public TOSC(String seqno, String tosc) {
            this.seqno = seqno;
            this.tosc = tosc;
        }
    }
    @Data
    public static class STCR{
        @JacksonXmlProperty(isAttribute = true, localName = "seqno")
        private String seqno;
        @JacksonXmlText
        @JsonProperty("STCR")
        private String stcr;

        public STCR(String seqno, String stcr) {
            this.seqno = seqno;
            this.stcr = stcr;
        }
    }
}
