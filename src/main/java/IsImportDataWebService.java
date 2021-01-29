import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * @User: lusen
 * @Date: 2020/12/7
 * @Class: PACKAGE_NAME.IsImportDataWebService
 * @Description:
 */
@WebService(name = "isImportDataService",targetNamespace = "http://service.aml.urp.sinosoft.com")
public interface IsImportDataWebService {
    @WebMethod
    @WebResult(name = "")
    String isImportData(@WebParam(name = "xml")String rqxml);
}
