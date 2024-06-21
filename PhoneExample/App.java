public class App {
    public static void main(String[] args) {
        String[] phoneNumbers = {
                "(84)-(0835882764)",
                "(65)-(0935882764)",
                "(AB)-(0935882764)",
        };

        for (String phoneNumber : phoneNumbers) {
            System.out.println(phoneNumber + " is valid : " + PhoneExample.isPhone(phoneNumber));
        }
    }
}

