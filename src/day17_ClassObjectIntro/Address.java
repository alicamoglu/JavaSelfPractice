package day17_ClassObjectIntro;
/*5. Create a class named Address
        Attributes:
        buildingNumber, street, city, state, zipCode

        Actions
        setInfo: sets all the instances
        toString: returns the address
        EX:
        7925 Jones Branch Dr
        McLean Va, 22012*/

public class Address {
    public String street,
                    city,
                    buildingNumber,
                    state;
    public int zipCode;

    public void setInfo(String street, String city, String buildingNumber, String state, int zipCode) {
        this.street = street;
        this.city = city;
        this.buildingNumber = buildingNumber;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", buildingNumber='" + buildingNumber + '\'' +
                ", state='" + state + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }

    public int changeZipCode(int newZipCode){
        this.zipCode = newZipCode;
        return zipCode;
    }
}
