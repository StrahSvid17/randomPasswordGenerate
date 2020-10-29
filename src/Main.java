public class Main {
    public static void main(String[] args) {
        PasswordGenerator passwordGenerator = new PasswordGenerator.PasswordGeneratorBuilder().
            useDigits(false).
            useLower(false).
            useUpper(false).
            usePunctuation(true).
            build();

        String password = passwordGenerator.generate(5);

        System.out.println("\n\n" + password + "\n\n");
    }    
}
