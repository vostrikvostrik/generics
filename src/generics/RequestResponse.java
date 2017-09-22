package generics;

/**
 * User: User
 * Date: 13.09.17
 * Time: 12:13
 */
public interface RequestResponse {
    <I, O> O sendRequest(I request, ServiceInvoker<I, O> invoker);

}
