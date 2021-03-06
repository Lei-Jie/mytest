import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import lombok.Data;

/**
 * @author: lusen
 * @Date: 2020/12/8
 * @Class: PACKAGE_NAME.XMLEncodeModel
 * @Description: 111
 */
public class XMLEncodeModel {

    private Map<String, String> heads = new HashMap<String, String>();//XML报文头
    private Map<String, String> roots = new HashMap<String, String>();//XML报文数据

    /**
     * 往XML模型添加报文头
     *
     * @param key   数据名
     * @param value 数据值
     * @return
     */
    public String setHeadParameter(String key, String value) {
        if (heads == null) {
            heads = new HashMap<String, String>();
        }
        return heads.put(key, value);
    }

    /**
     * 往XML模型添加报文数据
     *
     * @param key   数据名
     * @param value 数据值
     * @return
     */
    public String setRootParameter(String key, String value) {
        if (roots == null) {
            roots = new HashMap<String, String>();
        }
        return roots.put(key, value);
    }

    public String getHeadParameter(String key) {
        return heads != null ? heads.get(key) : null;
    }

    public String getRootParameter(String key) {
        return roots != null ? roots.get(key) : null;
    }


    /**
     * 产生模型对应的XML数据
     *
     * @param charset 编码
     * @return
     */
    public String toSendData(Charset charset) {
        StringBuilder builder = new StringBuilder();
        builder.append("<?xml version=\"1.0\" encoding=\"").append(charset.displayName()).append("\"?>");
        builder.append("<DATA>");
        builder.append("<HEAD>");
        if (heads != null) {
            for (Map.Entry<String, String> keyVal : heads.entrySet()) {
                if (keyVal != null) {
                    builder.append("<").append(keyVal.getKey()).append(">");
                    builder.append(keyVal.getValue() != null ? keyVal.getValue() : "");
                    builder.append("</").append(keyVal.getKey()).append(">");
                }
            }
        }
        builder.append("</HEAD>");
        builder.append("<ROOT>");
        if (roots != null) {
            for (Map.Entry<String, String> keyVal : roots.entrySet()) {
                if (keyVal != null) {
                    builder.append("<").append(keyVal.getKey()).append(">");
                    builder.append(keyVal.getValue() != null ? keyVal.getValue() : "");
                    builder.append("</").append(keyVal.getKey()).append(">");
                }
            }
        }
        builder.append("</ROOT>");
        builder.append("</DATA>");
        return builder.toString();
    }
}