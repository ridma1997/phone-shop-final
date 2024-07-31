
package model;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;


public class Encryption {

    private static final String ALGO = "AES";
    private static final byte[] keyValue = new byte[]{'T', 'h', 'e', 'B', 'e', 's', 't','S', 'e', 'c', 'r', 'e', 't', 'K', 'e', 'y'};

    public static String encrypt(String Data) throws Exception {
        String encryptedValue = "";
        Key key = generateKey();
        Cipher c = Cipher.getInstance(ALGO);
        c.init(Cipher.ENCRYPT_MODE, key);
        byte[] encVal = c.doFinal(Data.getBytes());
        encryptedValue = new BASE64Encoder().encode(encVal);
        return encryptedValue;
    }

    private static String decrypt(String encryptedData) throws Exception {
        Key key = generateKey();
        Cipher c = Cipher.getInstance(ALGO);
        c.init(Cipher.DECRYPT_MODE, key);
        byte[] decordedValue = new BASE64Decoder().decodeBuffer(encryptedData);
        byte[] decValue = c.doFinal(decordedValue);
        String decryptedValue = new String(decValue);
        return decryptedValue;
    }

    private static Key generateKey() throws Exception {
        Key key = new SecretKeySpec(keyValue, ALGO);
        return key;
    }
    
    public static String passwordEncryption(String password)throws Exception{
        String pass = password;
        
        String part1 = pass.substring(0,5);
        String encrypt1 = encrypt(part1);
        String part2 = pass.substring(5);
        String encrypt2 = encrypt(part2);
        
        String ss = encrypt1+" "+encrypt2;        
        return encrypt(ss).substring(30,65);
    }
    
    
    public static void main(String[] args) throws Exception {
        System.out.println(passwordEncryption("12345"));
    }
}

