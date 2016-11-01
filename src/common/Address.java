package common;

public class Address {
    private String address1;
    private String city;
    private String state;
    private String zipCode;
    private String phone;
    private String email;

    public final String getAddress1() {
        return address1;
    }

    public final void setAddress1(String address1) {
        this.address1 = address1;
    }

    public final String getCity() {
        return city;
    }

    public final void setCity(String city) {
        this.city = city;
    }

    public final String getState() {
        return state;
    }

    public final void setState(String state) {
        this.state = state;
    }

    public final String getZipCode() {
        return zipCode;
    }

    public final void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public final String getPhone() {
        return phone;
    }

    public final void setPhone(String phone) {
        this.phone = phone;
    }

    public final String getEmail() {
        return email;
    }

    public final void setEmail(String email) {
        this.email = email;
    }

    @Override
    public final int hashCode() {
        int hash = 7;
        hash = 97 * hash + (this.address1 != null ? this.address1.hashCode() : 0);
        hash = 97 * hash + (this.zipCode != null ? this.zipCode.hashCode() : 0);

        return hash;
    }

    @Override
    //Check against Address and Zip
    public final boolean equals(Object obj) {
        Address other = (Address) obj;
        return (this.address1 == other.address1 && this.zipCode == other.zipCode);
    }

    @Override
    //Return: Address
    public final String toString() {
        return this.address1 + "\n" + this.city + ", " + this.state + " " + this.zipCode + "\n" + this.phone + "\n" + this.email;
    }



}
