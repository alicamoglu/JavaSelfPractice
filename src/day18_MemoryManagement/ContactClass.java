package day18_MemoryManagement;
/*2. Create a custom class named Contact
        Attributes:
        name
        phoneNumber
        email

        Action:
        setInfo(): sets all the fields
        call(): displays the message "Calling $name now"
        sendMessage(): displays the message "sending message to $phoneNumber now"
        sendEmail(): displays the message "sending email to $email now"*/
public class ContactClass {
    public String name;
    public String phoneNumber ;
    public String email;


    public void setInfo(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String toString() {
        return "ContactClass{" +
                "name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }
    public void calling(){
        System.out.println("calling" + name);
    }
    public void sendMessage(){
        System.out.println("sending message to " + phoneNumber + " now");
    }
    public void sendEmail(){
        System.out.println("sending email to " + email + " now");
    }
}
