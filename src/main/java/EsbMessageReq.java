import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;
import lombok.Data;

/**
 * @author: lusen
 * @Date: 2020/12/8
 * @Class: PACKAGE_NAME.EsbMessageReq
 * @Description:
 */
@Data
@JacksonXmlRootElement(localName = "Message")
@JsonIgnoreProperties(ignoreUnknown = true)
public class EsbMessageReq {

    @JsonProperty("Message_Body")
    private EsbMessageBodyReq esbMessageBodyRequest;

    @JsonProperty("Message_Header")
    private EsbMessageHead esbMessageHead;

    @Data
    @JacksonXmlRootElement(localName = "Message_Header")
    @JsonIgnoreProperties(ignoreUnknown = true)
    public class EsbMessageHead {

        @JsonProperty("msgId")
        private String msgId;

        @JsonProperty("msgRef")
        private String msgRef;

        @JsonProperty("channel")
        private String channel;

        @JsonProperty("fromNodeId")
        private String fromNodeId;

        @JsonProperty("toServiceCode")
        private String toServiceCode;

        @JsonProperty("externalReferenceNo")
        private String externalReferenceNo;

        @JsonProperty("transactionBranch")
        private String transactionBranch;

        @JsonProperty("transactionDate")
        private String transactionDate;

        @JsonProperty("msgPri")
        private String msgPri;

        @JsonProperty("msgVer")
        private String msgVer;

        @JsonProperty("replyCode")
        private String replyCode;

        @JsonProperty("replyText")
        private String replyText;
    }

    @Data
    @JacksonXmlRootElement(localName = "Message_Body")
    @JsonIgnoreProperties(ignoreUnknown = true)
    public class EsbMessageBodyReq {

        @JsonProperty("request")
        private BodyReq request;
    }
}