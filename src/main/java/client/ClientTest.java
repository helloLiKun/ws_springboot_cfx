package client;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

/**
 * Created by likun on 2018/2/11 0011.
 */
public class ClientTest {
    public static void main(String[] args) throws Exception {
        String url = "http://localhost:8080/test/user?wsdl";
        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
        Client client = dcf.createClient(url);
        Object[] objects = client.invoke("getUser", "411002");
        System.out.println("-------------" + objects[0].toString());
    }
}
