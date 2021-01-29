import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

/**
 * @author: lusen
 * @Date: 2020/12/8
 * @Class: PACKAGE_NAME.BodyReq
 * @Description:
 */
@Data
@JacksonXmlRootElement(localName = "request")
@JsonIgnoreProperties(ignoreUnknown = true)
public class BodyReq {
    @JsonProperty("trcd")
    private String trcd;

    @JsonProperty("channo")
    private String channo;

    @JsonProperty("charset")
    private String charset;

    @JsonProperty("bussid")
    private String bussid;

    @JsonProperty("branchno")
    private String branchno;

    @JsonProperty("signbranchno")
    private String signbranchno;

    @JsonProperty("immedflag")
    private String immedflag;

    @JsonProperty("lastsndtime")
    private String lastsndtime;

    @JsonProperty("msgcode")
    private String msgcode;

    @JsonProperty("msgdesc")
    private String msgdesc;

    @JsonProperty("jyrq")
    private String jyrq;

    @JsonProperty("jysj")
    private String jysj;

    @JsonProperty("name")
    private String name;

    @JsonProperty("mobile")
    private String mobile;

    @JsonProperty("cdno1")
    private String cdno1;

    @JsonProperty("cdno2")
    private String cdno2;

    @JsonProperty("amount")
    private String amount;

    @JsonProperty("endbal")
    private String endbal;

    @JsonProperty("tdbal")
    private String tdbal;

    @JsonProperty("curtype")
    private String curtype;

    @JsonProperty("mark1")
    private String mark1;

    @JsonProperty("mark2")
    private String mark2;

    @JsonProperty("mark3")
    private String mark3;

    @JsonProperty("mark4")
    private String mark4;

    @JsonProperty("tjd")
    private String tjd;

    @JsonProperty("useWord")
    private String useWord;

    @JsonProperty("msgcontent")
    private String msgcontent;

    @JsonProperty("trntype")
    private String trntype;

    @JsonProperty("orderNo")
    private String orderNo;

    @JsonProperty("validTime")
    private String validTime;

    @JsonProperty("filename")
    private String filename;
}
