package generics.request;

/**
 * User: User
 * Date: 13.09.17
 * Time: 11:24
 */
public class PostRequest extends HeaderRequest {

    public PostRequest(String name, String address, int packageId) {
        super(name, address, packageId);
    }

    public void setRequestName(String name){
        this.name = name;
    }
}
