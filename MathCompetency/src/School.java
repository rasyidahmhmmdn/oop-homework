public class School {
    private String name;
    private Address address;
    private principalsName principalName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public principalsName getPrincipalName() {
        return principalName;
    }

    public void setPrincipalName(principalsName principalName) {
        this.principalName = principalName;
    }

    public School(String name, Address address, principalsName principalName) {
        this.name = name;
        this.address = address;
        this.principalName = principalName;


    }
}
