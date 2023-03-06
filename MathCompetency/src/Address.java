public class Address {

    private int unitNo;
    private String street;
    private float poscode;
    private String district;
    private String state;

    public Address(int unitNo, String street, float poscode, String district, String state) {
        this.unitNo = unitNo;
        this.street = street;
        this.poscode = poscode;
        this.district = district;
        this.state = state;
    }
}
