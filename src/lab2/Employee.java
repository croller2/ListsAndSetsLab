package lab2;

import common.*;

public class Employee {
    private String lastName;
    private String firstName;
    private String ssn;
    private Address address;

    public Employee(String lastName, String firstName, String ssn) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.ssn = ssn;
    }

    public final String getSsn() {
        return ssn;
    }

    public final void setSsn(String ssn) {
        this.ssn = ssn;
    }


    public final String getFirstName() {
        return firstName;
    }

    public final void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public final String getLastName() {
        return lastName;
    }

    public final void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public final Address getAddress() {
        return address;
    }

    public final void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + (this.ssn != null ? this.ssn.hashCode() : 0);

        return hash;
    }

    @Override
    //Check SSN's for equality
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if ((this.ssn == null) ? (other.ssn != null) : !this.ssn.equals(other.ssn)) {
            return false;
        }
        return true;
    }

    @Override
    //Return first and last name
    public final String toString() {
        return this.lastName + " " + this.firstName;
    }
    
    


    
}
