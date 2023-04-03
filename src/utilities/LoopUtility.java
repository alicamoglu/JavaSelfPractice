package utilities;

public class LoopUtility {
    public static boolean isPrime(int n){   //this method checks if given number prime (can be evenly divisible only 1 and itself
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static String primeInRange(int range){
        String prime = "";
        for(int i = 2; i <= range; i++){
            if(isPrime(i)){
                prime += i + ", ";
            }
        }
        return prime.substring(0, prime.length()-2); // this part removes last space and come after last prime number
    }
}
