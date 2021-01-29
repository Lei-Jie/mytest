package Suspic;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

/**
 * @author: lusen
 * @Date: 2021/1/11
 * @Class: Suspic.SuspicDataResponseVO
 * @Description:
 */
@Data
@JacksonXmlRootElement(localName = "body")
@JsonIgnoreProperties(ignoreUnknown = true)
public class SuspicDataResponseVO {
    @JsonProperty("head")
    private HEAD head;

    @Data
    public class HEAD{
        /**
         * 00-主表数据插入失败          01-明细数据插入失败      02-合同数据表插入失败
         * 03-被保险人表数据插入失败     04-受益人表数据插入失败   05-联系方式表数据插入失败
         * 06-涉及犯罪类型表数据插入失败 07-数据插入成功          08-文件上传服务器有误！
         */
        @JsonProperty("state")
        private String state;
        @JsonProperty("msg")
        private String msg;
    }
}
