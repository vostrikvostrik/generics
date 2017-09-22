package generics;

/**
 * User: User
 * Date: 13.09.17
 * Time: 11:24
 */
public interface ServiceInvoker<I, O> {
    O invokeService(I request);
}
