package day08_tasks;

public class SelectedBrowser {
    public static void main(String[] args) {
        String browserName = "firefox";
        String validBrowser = "";
        switch (browserName) {
            case "firefox":
                validBrowser = "firefox";
                break;
            case "opera":
                validBrowser = "opera";
                break;
            case "safari":
                validBrowser = "safari";
                break;
            case "edge":
                validBrowser = "edge";
                break;
            case "chrome":
                validBrowser = "chrome";
                break;
            default:
                validBrowser = "Invalid Browser";
        }
        System.out.println(validBrowser);

    }
}

/*
9. write a program that can display the selected browser
        3.1  declare a String variable called browserName
        3.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
        3.3 if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser

        Do Not use if statement or ternary
*/
