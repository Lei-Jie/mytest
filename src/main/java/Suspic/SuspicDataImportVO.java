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
 * @Class: Suspic.SuspicDataImportVO
 * @Description: 可疑数据导入对象
 */
@Data
@JacksonXmlRootElement(localName = "ISTR")
@JsonIgnoreProperties(ignoreUnknown = true)
public class SuspicDataImportVO {
    @JsonProperty("RBIF")
    private ReportHeadVO rbif;

    @JacksonXmlElementWrapper(localName = "SEIFs")
    @JacksonXmlProperty(localName = "SEIF")

    private List<SuspicPersonVO> seifList;
    @JacksonXmlElementWrapper(localName = "STIFs")
    @JacksonXmlProperty(localName = "STIF")
    private List<SuspicMessageVO> stifList;
}
