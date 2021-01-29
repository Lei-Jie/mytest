import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(name = "isImportDataService",targetNamespace = "http://service.aml.urp.sinosoft.com")
public interface QueryRiskLevelService {
    @WebMethod
    @WebResult(name = "")
    String queryRiskLevel(@WebParam(name = "xml") String rqxml);
}