public class PrimeNumberChecker {
    public static void main(String[] args) {
         for (int i=2;i<=100;i++){
             if(isPrime(i)){
                 System.out.println("số nguyên tố là : " +i);
             }
         }
    }
    public static  boolean isPrime(int num){
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
