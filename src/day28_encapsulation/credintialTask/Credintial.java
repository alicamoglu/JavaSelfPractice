package day28_encapsulation.credintialTask;

public class Credintial {
    private String username, password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if(username.isEmpty() ||username.isBlank()|| hasBlank(username)){      // if a blank is wanted nowhere in username
            System.err.println("user name can have no blank or can not be empty!");
            System.exit(1);
        }
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        boolean flag = true;
        char[] charArrary = password.toCharArray();
        if(charArrary.length<8){
            flag = false;
        }
        int digitCount = 0, letterCount = 0, specialCount = 0;

        for (char c : charArrary) {
            if(Character.isDigit(c)){
                digitCount++;
            }else if(Character.isLetter(c)){
                letterCount++;
            }else{
                specialCount++;
            }
        }
        if(digitCount ==0 ||letterCount==0||specialCount==0){
            flag = false;
        }
        if (!flag) {
            System.err.println("invalid password");
            System.exit(1);
        }else {
            this.password = password;
        }
    }

    public Credintial(String username, String password) {
        setUsername(username);      //        this.username = username;
        setPassword(password);      //        this.password = password;
    }

    public String toString() {
        return "Credintial{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
    public static boolean hasBlank(String str){
        boolean flag = false;
        for (int i = 0; i < str.length(); i++) {
            (""+ str.charAt(i)).equals(" ");

            flag = true;
        }
        return flag;
    }
}
/*5. create a class named Credentials
        Variables:
        username, password
        Encapsulate all the fields
        (password MUST be a strong password)
        Add a constructor that allows user to set all the fields when the object is created.
        (If the arguments not valid it should not be set to the instances)
        Methods:
        isStrongPassWord(): takes an argument of string and verify if the given string is strong password, returns boolean
        Characteristics of strong passwords are:
        1. Password MUST be at least have 8 characters long, and should not contain space
        2. PassWord should at least contain one letter
        3. Password should at least contain one special characters
        4. Password should at least contain a digit
        toString() */
