package tests;

import generics.RequestResponse;
import generics.ServiceInvoker;
import generics.request.EmailRequest;
import generics.request.EmailResponse;
import generics.request.HeaderRequest;
import junit.framework.TestCase;
import org.junit.Test;

import java.lang.reflect.Method;

/**
 * User: User
 * Date: 13.09.17
 * Time: 11:58
 */
public class ServiceInvokerTest extends TestCase {
    @Test
    public void testInvokeService() throws Exception {
        EmailRequest request = new EmailRequest("Name","Street", 5672);

        RequestResponse requestReponse = new RequestResponse() {
            @Override
            public <I, O> O sendRequest(I request, ServiceInvoker<I, O> invoker) {
                O result = null;
                try {
                    Class[] cArg = new Class[1];
                    cArg[0] = String.class;
                    Method getRequest = request.getClass().getMethod("setRequestName",cArg);
                    // fimiService=fimiServiceWork.setPort((HeaderRq) getRequest.invoke(request, null), serviceSettings);
                    HeaderRequest headerRequest = (HeaderRequest)getRequest.invoke(request, "name");
                    result = invoker.invokeService(request);
                    return result;
                }
                catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
                return result;
            }
        };

        requestReponse.sendRequest(request, new ServiceInvoker<EmailRequest, EmailResponse>() {
            public EmailResponse invokeService(EmailRequest request) {
                EmailResponse response = null;
                return response;
            }
        });
    }
}
