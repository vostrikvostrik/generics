package generics.impl;

import generics.RequestResponse;
import generics.ServiceInvoker;

/**
 * User: User
 * Date: 13.09.17
 * Time: 12:13
 */
public class RequestResponseImpl implements RequestResponse {
    @Override
    public <I, O> O sendRequest(I request, ServiceInvoker<I, O> invoker) {
        O result = null;
        return result;
    }
}
