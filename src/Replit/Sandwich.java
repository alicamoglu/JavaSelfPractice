package replit;

public class Sandwich {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        String str = scan.next();
//        System.out.println(str.length());
//        System.out.println(str.replaceAll("bread","").length());
//
//        int repeating = (str.length() - str.replaceAll("bread","").length())/5;
//        if (repeating == 2){
//            String str1 = str.substring(str.indexOf("bread")+5,str.lastIndexOf("bread"));
//            if (str1.length() != 0) {
//                System.out.println(str1);
//            }else {
//                System.out.println("nothing");
//            }
//        }else {
//            System.out.println("nothing");
//        }

       ALL THESE ARE TRY FOR SANDWİCH TASK JUST ABOVE

        if (repeating == 2 && str.replaceAll("bread","").length() != 0) {
            str = str.replace(str.substring(str.lastIndexOf("bread")),"");
//            System.out.println(str);
            System.out.println(str.indexOf("bread")+5);
            str = str.replaceFirst(str.substring(0,str.indexOf("bread")+5),"");
            System.out.println(str);
        }else {

            System.out.println("nothing");
        }

        int breadFirst = str.indexOf("bread");

        String str1 = str.replace(str.substring(0,str.indexOf("bread")+5),"");
        System.out.println(str1);
        String str2 = str1.replace(str1.substring(str1.indexOf("bread")),"");
        System.out.println(str2);
        if (str.length()!= str1.length()&&str1.length()!=str2.length()){
            System.out.println(str2);
        }else{
            System.out.println("nothing");
//
       }
    }
}
