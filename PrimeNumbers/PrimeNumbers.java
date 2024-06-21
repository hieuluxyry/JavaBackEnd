public class PrimeNumbers {
    public static void main(String[] args) {
        int count =0;
        int number = 2;
        System.out.println("20 số nguyên tố đầu tiên là : ");
        do{
            if(isPrime(number)){
                System.out.println(number +" ");
                count++;
            }
            number++;
        } while (number< 20);
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
