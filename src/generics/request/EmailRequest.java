package generics.request;

/**
 * User: User
 * Date: 13.09.17
 * Time: 11:25
 */
public class EmailRequest extends HeaderRequest{
    public EmailRequest(String name, String address, int packageId) {
        super(name, address, packageId);
    }

    public void setRequestName(String name){
            this.name = name;
    }
}
