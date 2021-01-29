import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.json.JettisonMappedXmlDriver;
import com.thoughtworks.xstream.io.xml.DomDriver;
import org.junit.Test;
import org.springframework.util.CollectionUtils;

import java.util.*;

/**
 * @author: lusen
 * @Date: 2021/1/25
 * @Class: PACKAGE_NAME.xStream1
 * @Description:
 */
public class xStream1 {
    /**
     * xml json javabean之间的相互转换
     */
    @Test
    public void beanToXml() {

        /**
         * DomDriver()
         * StaxDriver()
         */
        XStream xstream = new XStream();//需要xpp3的jar文件
        //        XStream xstream = new XStream(new DomDriver());
        //        XStream xstream = new XStream(new StaxDriver()); //不换行，适合网络传输


        /**
         * javaBean to xml
         */
        ArrayList<String> hobbys = new ArrayList<>();
        hobbys.add("打球");
        hobbys.add("游戏");
        hobbys.add("动漫");
        List<String> strings = new ArrayList<>(Arrays.asList(new String[]{"打球", "游戏", "动漫"}));
        ArrayList<String> string = new ArrayList<>(Collections.nCopies(3, "12321321312"));
        strings.addAll(string);
        //List<String> strings = Arrays.asList(new String[]{"打球", "游戏", "动漫"});
        Person p = new Person(1, "略略", false, new Date(), strings);
        System.out.println(p);
        //类重命名，去除包名，以下两种都可
        //        xstream.alias("Person", Person.class);
        //        xstream.aliasPackage("", "entity");
        //类重命名，修改包名
        //        xstream.alias("xxx.Person", Person.class);
        //        xstream.aliasPackage("xxx", "entity");
        //为字段重命名
        //        xstream.aliasField("性别", Person.class, "gender");
        //把字段设置成属性
        //        xstream.useAttributeFor(Person.class, "id");
        //隐藏字段
        //        xstream.omitField(Person.class, "hobby");

        xstream.alias("hobby", String.class);
        //xstream.aliasPackage("");
        //去除class属性
        xstream.autodetectAnnotations(true);
        xstream.aliasSystemAttribute(null, "class"); // 去掉 class 属性
        String xml = xstream.toXML(p);
        System.out.println(xml);
        System.out.println("-------------------");

        /**
         * beanList to xml
         */
        Person[] ps = {new Person(1, "略略", false, new Date(),hobbys),
                new Person(2, "哈哈", false, new Date(), hobbys)
        };
        //忽略集合根节点

        List<Person> list = Arrays.asList(ps);
        xml = xstream.toXML(list);
        //System.out.println(xml);


        /**
         * 使用注解
         */

    }

    /**
     * xml转换成javabean
     */
    @Test
    public void xmlToBean() {

        XStream xstream = new XStream(new DomDriver());

        String xml = "<?xml version=\"1.0\" ?><entity.Person><id>1</id><name>略略</name><gender>false</gender><birthday>2017-04-15 02:16:34.664 UTC</birthday><hobby class=\"java.util.Arrays$ArrayList\"><a class=\"string-array\"><string>打球</string><string>游戏</string><string>动漫</string></a></hobby></entity.Person>";
        Person person = (Person) xstream.fromXML(xml);
        System.out.println(person);

        xml = "<?xml version=\"1.0\" ?><java.util.Arrays_-ArrayList><a class=\"entity.Person-array\"><entity.Person><id>1</id><name>略略</name><gender>false</gender><birthday>2017-04-15 02:18:26.457 UTC</birthday><hobby class=\"java.util.Arrays$ArrayList\"><a class=\"string-array\"><string>打球</string><string>游戏</string><string>动漫</string></a></hobby></entity.Person><entity.Person><id>2</id><name>哈哈</name><gender>false</gender><birthday>2017-04-15 02:18:26.457 UTC</birthday><hobby class=\"java.util.Arrays$ArrayList\"><a class=\"string-array\"><string>打球</string></a></hobby></entity.Person></a></java.util.Arrays_-ArrayList>";
        List<Person> plist = (List<Person>) xstream.fromXML(xml);
        System.out.println(plist);
    }

    /**
     * java to json
     */
    @Test
    public void beanToJson() {

        XStream xStream = new XStream(new JettisonMappedXmlDriver());

        Person p = new Person(1, "略略", false, new Date(), Arrays.asList(new String[]{"打球", "游戏", "动漫"}));
        String json = xStream.toXML(p);
        System.out.println(json);

        json = "{\"entity.Person\":{\"id\":1,\"name\":\"略略\",\"gender\":false,\"birthday\":\"2017-04-15 02:38:41.767 UTC\",\"hobby\":{\"@class\":\"java.util.Arrays$ArrayList\",\"a\":{\"@class\":\"string-array\",\"string\":[\"打球\",\"游戏\",\"动漫\"]}}}}";
        Person t = (Person) xStream.fromXML(json);
        System.out.println(t);
    }
}
