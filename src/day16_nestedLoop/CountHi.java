package day16_nestedLoop;

public class CountHi {
    /*
    Count Hi [method, loop, String]

	create a method that will accept a String and count how many times the word "hi" is found in the String. return the count

		ex:
			input: aahiahiaaahh
			output: 2
				"hi" was found 2 times

			input: ahhhbchidefhihellohiiiiworld
			output: 3
				"hi" was found 3 times

	extra: overload the method to search for any word, not just "hi"
     */

    public static int countHi(String str){
        int count = 0;

        for(int i = 0; i < str.length() - 1; i++){
            if(str.charAt(i) == 'h' && str.charAt(i + 1) == 'i'){
                count++;
            }
        }
        return count;
    }
    public static int countHi4(String str){
        int count = 0;

        for(int i = 0; i < str.length() - 1; i++){
            if((""+str.charAt(i)+str.charAt(i+1)).equals("hi")){   // self made others from Saim review
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countHi("hiellhiowhhhhhiorld"));
        System.out.println(countHi3("hiellhiowhhhhhiorld"));
        System.out.println(countHi3("hiellhiowhhhhhiorld"));
        System.out.println(countHi4("hiellhiowhhhhhiorld"));
    }

    // the while loop will continue running as long as the sequence of "hi" is in the String. Each iteration it will increment the counter and replace only the first occurrence of hi with empty space, which basically deletes it. Using just replace will not work
    public static int countHi2(String str){
        int count = 0;

        while(str.contains("hi")){
            count++;
            str = str.replaceFirst("hi", "");
        }

        return count;
    }

    // using substring you can keep track of multiple characters at the same time. Look for the pattern that is repeating (look below) and use that to determine how to dynamically keep track of the iterations
    public static int countHi3(String str){
        int count = 0;

        for(int i = 0; i < str.length() - 2; i++){

            if(str.substring(i, i + 2).equals("hi")){
                count++;
            }

        }
        return count;
    }










    /*
        hiabhicdef

        sub(0, 2) -> hi
        sub(1, 3) -> ia
        sub(2, 4) -> ab
        sub(3, 5) -> bh
        sub(4, 6) -> hi

        etc..
     */

}
