/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webchat.utilities;

import java.security.*;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import sun.misc.*;

/**
 *
 * @author KK
 */
public class AES {
    private static final String algo = "AES";
    private static final byte[] keyBytes = new byte[] { 's','o','m','e','r','a','m','d','o','m','k','e','y'};
    
    public static Key genKey() throws Exception{
        Key key = new SecretKeySpec(keyBytes, algo);
        return key;
    }
    
    public static String encrypt(String data) throws Exception{
        Key key = genKey();
        Cipher c = Cipher.getInstance(algo);
        c.init(Cipher.ENCRYPT_MODE, key);
        byte[] enc = c.doFinal(data.getBytes());
        String encrypted = new BASE64Encoder().encode(enc);
        return encrypted;
    }
}
