package cn.myapps.util;

import java.io.PrintStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class Security
{
  public static final String ENCRYPTION_BASE64 = "base64";
  private static Blowfish cipher = null;
  
  public static String encodeToMD5(String s)
    throws NoSuchAlgorithmException
  {
    if (s == null) {
      return null;
    }
    StringBuffer digstr = new StringBuffer();
    MessageDigest MD = MessageDigest.getInstance("MD5");
    
    byte[] oldbyte = new byte[s.length()];
    for (int i = 0; i < s.length(); i++) {
      oldbyte[i] = ((byte)s.charAt(i));
    }
    MD.update(oldbyte);
    byte[] newbyte = MD.digest(oldbyte);
    for (int i = 0; i < newbyte.length; i++) {
      digstr.append(newbyte[i]);
    }
    return digstr.toString();
  }
  
  public static String encodeToBASE64(String s)
  {
    if (s == null) {
      return null;
    }
    return encodeToBASE64(s.getBytes());
  }
  
  public static String encodeToBASE64(byte[] obj)
  {
    if (obj == null) {
      return null;
    }
    return new BASE64Encoder().encode(obj);
  }
  
  public static String decodeBASE64(String s)
  {
    if (s == null) {
      return null;
    }
    BASE64Decoder decoder = new BASE64Decoder();
    try
    {
      byte[] b = decoder.decodeBuffer(s);
      return new String(b);
    }
    catch (Exception e) {}
    return null;
  }
  
  public static String encryptPassword(String password)
  {
    if (password == null) {
      return null;
    }
    Blowfish cipher = getCipher();
    if (cipher == null) {
      throw new UnsupportedOperationException();
    }
    return cipher.encryptString(password);
  }
  
  public static String decryptPassword(String encryptedPassword)
  {
    if (encryptedPassword == null) {
      return null;
    }
    Blowfish cipher = getCipher();
    if (cipher == null) {
      throw new UnsupportedOperationException();
    }
    return cipher.decryptString(encryptedPassword);
  }
  
  private static synchronized Blowfish getCipher()
  {
    if (cipher != null) {
      return cipher;
    }
    try
    {
      String keyString = "obpm";
      if (keyString == null) {}
      cipher = new Blowfish(keyString);
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
    return cipher;
  }
  
  public static byte[] hexStringToByte(String hex)
  {
    int len = hex.length() / 2;
    byte[] result = new byte[len];
    char[] achar = hex.toCharArray();
    for (int i = 0; i < len; i++)
    {
      int pos = i * 2;
      result[i] = ((byte)(toByte(achar[pos]) << 4 | toByte(achar[(pos + 1)])));
    }
    return result;
  }
  
  private static byte toByte(char c)
  {
    byte b = (byte)"0123456789ABCDEF".indexOf(c);
    return b;
  }
  
  public static final String bytesToHexString(byte[] bArray)
  {
    StringBuffer sb = new StringBuffer(bArray.length);
    for (int i = 0; i < bArray.length; i++)
    {
      String sTemp = Integer.toHexString(0xFF & bArray[i]);
      if (sTemp.length() < 2) {
        sb.append(0);
      }
      sb.append(sTemp.toUpperCase());
    }
    return sb.toString();
  }
  
  public static void main(String[] args)
  {
    try
    {
      String password = encryptPassword("123456");
      System.out.println("encrypt: " + password);
      
      password = decryptPassword(password);
      System.out.println("decrypt: " + password);
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
  }
}
