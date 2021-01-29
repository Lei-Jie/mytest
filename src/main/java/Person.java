import com.fasterxml.jackson.annotation.JsonProperty;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author: lusen
 * @Date: 2021/1/25
 * @Class: PACKAGE_NAME.Person
 * @Description:
 */
@Data
public class Person {
    private int id;
    private String name;
    private Boolean gender;
    private Date birthday;
    //@JsonProperty("list")
    //@XStreamImplicit(itemFieldName = "hobby")
    private List<String> hobbys;
    //private List<String> hobbys;

    public Person() {
    }

    public Person(int id, String name, Boolean gender, Date birthday, List<String> hobbys) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.hobbys = hobbys;
    }
}
