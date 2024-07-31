
package model;

public class PasswordGenerator {
    
    private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890@#%^&*()!{}()";
    public static String generatePassword(){
        StringBuilder b = new StringBuilder();
        for (int i = 13; i > 0; i--) {
            int character = (int)(Math.random()*ALPHA_NUMERIC_STRING.length());
            b.append(ALPHA_NUMERIC_STRING.charAt(character));
        
        }
        return b.toString();
    }
    public static void main(String[] args) {
        System.out.println(generatePassword());
        System.out.println(generatePassword());
        System.out.println(generatePassword());
        System.out.println(generatePassword());
    }
}
