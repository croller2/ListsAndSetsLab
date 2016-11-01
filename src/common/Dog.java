package common;

public class Dog {
    private String name;
    private int rabiesId;

    public Dog() {
    }

    public Dog(String name, int rabiesId) {
        this.name = name;
        this.rabiesId = rabiesId;
    }
    

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final int getRabiesId() {
        return rabiesId;
    }

    public final void setRabiesId(int rabiesId) {
        this.rabiesId = rabiesId;
    }

    @Override
    public final int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.rabiesId;
        return hash;
    }

    
    //Check Rabies ID for equality;
    @Override
    public final boolean equals(Object obj) {
        Dog other = (Dog) obj;
        if (this.rabiesId == other.rabiesId) {
            return true;
        }
        return false;
    }

    //Output name and rabies ID
    @Override
    public final String toString() {
        return "This dog is named: " + this.getName() + " with a rabies ID of: " + this.rabiesId;
    }

    

}
