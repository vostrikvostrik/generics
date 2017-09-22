package generics.request;

/**
 * User: User
 * Date: 13.09.17
 * Time: 11:23
 */
public class HeaderRequest implements Cloneable{
    String name;
    String address;
    int packageId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPackageId() {
        return packageId;
    }

    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }

    public HeaderRequest(String name, String address, int packageId){
        this.address = address;
        this.name = name;
        this.packageId = packageId;
    }

    public HeaderRequest clone() throws CloneNotSupportedException{
        HeaderRequest headerRequest = new HeaderRequest(this.name, this.address, this.packageId);
        return headerRequest;
    }
}
