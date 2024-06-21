public class App {
    public static AccountExample accountExample;
    public static final String[] validAccount = new String[]{"hieu17b5", "huydepzai123"};
    public static final String[] invalidAccount = new String[]{"#$hieu", "@huydep"};

    public static void main(String[] args) {
        accountExample = new AccountExample();
        for (String account : validAccount) {
            boolean isValid = accountExample.validate(account);
            System.out.println("Account " + account + " is valid: " + isValid);
        }
        for (String account : invalidAccount) {
            boolean isValid = accountExample.validate(account);
            System.out.println("Account " + account + " is valid: " + isValid);
        }
    }
}
