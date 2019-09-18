package chaotu;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class WebServiceUtil {

    @WebMethod
    public String sayHello(String name, int i) {
        return name;
    }

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9001/springboot-study/WebServiceUtil",new WebServiceUtil());
        System.out.println("service start");
    }
}
