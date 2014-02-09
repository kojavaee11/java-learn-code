package encoding;

import java.io.UnsupportedEncodingException;

/**
 * 转换字符编码
 * @author lzh
 *
 */
public class ChangeCharset {
	public static final String GBK = "gbk";
	public static final String UTF_8 = "utf-8";
	
	public static String changeCharset(String str, String oldCharset, String newCharset) throws UnsupportedEncodingException {
		String result = null;
		if(str != null) {
			byte[] b = str.getBytes(oldCharset);
			result = new String(b,newCharset);
		}
		return result;
	}
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		String gbkStr = new String("你好GBK".getBytes(),GBK);
		String utfStr = changeCharset(gbkStr, GBK, UTF_8);
		System.out.println(gbkStr);
		System.out.println(utfStr);
	}
}
