package com.auexpress.util;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Base64;
import sun.misc.BASE64Encoder;

/**
 * Created by 维军 on 2016/07/18.
 */
public class EncryptionCommen {
    private static String Algorithm = "DESede";
    private static final String Default_Key = "A3F/DEI69+WCJS+JEOT/+5DYQW/68H1Y";

    public static String decryptString(String value)
            throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException
    {
        byte[] bytesKey = null;byte[] bytes = null;byte[] bytesCipher = null;
        SecretKey deskey = null;
        if (value == null) {
            new IllegalArgumentException("错误的密码");
        }
        Cipher desCipher = Cipher.getInstance(Algorithm);
        try
        {
            bytesKey = Base64.decodeBase64("A3F/DEI69+WCJS+JEOT/+5DYQW/68H1Y");
            deskey = new SecretKeySpec(bytesKey, Algorithm);
            bytes = Base64.decodeBase64(value);
            desCipher.init(2, deskey);
            bytesCipher = desCipher.doFinal(bytes);
            return new String(bytesCipher, "UTF-8");
        }
        finally
        {
            bytesKey = null;
            bytes = null;
            bytesCipher = null;
        }
    }

    public static String EncoderByMd5(String password)
    {
        String newstr = "";
        try
        {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            BASE64Encoder base64en = new BASE64Encoder();
            newstr = base64en.encode(md5.digest(password.getBytes("utf-8")));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return newstr;
    }
}
