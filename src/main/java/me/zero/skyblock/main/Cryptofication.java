package me.zero.skyblock.main;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.security.NoSuchAlgorithmException;
import java.security.InvalidKeyException;

public class Cryptofication {

    // AES encryption/decryption constants
    private static final String ALGORITHM = "AES";
    private static final String DEFAULT_KEY = "X9f@7#L!zP$wQm&d"; // Ensure this is exactly 16 bytes for AES (128-bit)

    public static String encrypt(String data) {
        return encryptWithKey(data, DEFAULT_KEY);
    }

    public static String encrypt(Number number) {
        return encryptWithKey(number.toString(), DEFAULT_KEY);
    }

    public static String decrypt(String encryptedData) {
        return decryptWithKey(encryptedData, DEFAULT_KEY);
    }

    public static String encryptWithKey(String data, String key) {
        try {
            byte[] keyBytes = key.getBytes(StandardCharsets.UTF_8);
            if (keyBytes.length != 16) {
                throw new InvalidKeyException("AES key must be exactly 16 bytes long");
            }

            Cipher cipher = Cipher.getInstance(ALGORITHM);
            SecretKeySpec secretKey = new SecretKeySpec(keyBytes, ALGORITHM);
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            
            byte[] encryptedBytes = cipher.doFinal(data.getBytes(StandardCharsets.UTF_8));
            return Base64.getEncoder().encodeToString(encryptedBytes);
        } catch (Exception e) {
            throw new RuntimeException("Error during encryption: " + e.getMessage(), e);
        }
    }

    public static String decryptWithKey(String encryptedData, String key) {
        try {
            byte[] keyBytes = key.getBytes(StandardCharsets.UTF_8);
            if (keyBytes.length != 16) {
                throw new InvalidKeyException("AES key must be exactly 16 bytes long");
            }

            Cipher cipher = Cipher.getInstance(ALGORITHM);
            SecretKeySpec secretKey = new SecretKeySpec(keyBytes, ALGORITHM);
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            
            byte[] decodedBytes = Base64.getDecoder().decode(encryptedData);
            byte[] decryptedBytes = cipher.doFinal(decodedBytes);
            return new String(decryptedBytes, StandardCharsets.UTF_8);
        } catch (Exception e) {
            throw new RuntimeException("Error during decryption: " + e.getMessage(), e);
        }
    }

    public static String generateRandomKey() throws NoSuchAlgorithmException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance(ALGORITHM);
        keyGenerator.init(128); 
        SecretKey secretKey = keyGenerator.generateKey();
        return Base64.getEncoder().encodeToString(secretKey.getEncoded());
    }

}
