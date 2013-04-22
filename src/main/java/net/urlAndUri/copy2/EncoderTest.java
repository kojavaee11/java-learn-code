package net.urlAndUri.copy2;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * @Description: x-www-form-urlencoded的字符串
 * @Author     : lzh laizhihuan@basecity.com
 * @Date       : 2013-3-24 下午4:03:45
 *
 */
public class EncoderTest {
	public static void main(String[] args) throws UnsupportedEncodingException {
		System.out.println(URLEncoder.encode("This string has spaces", "UTF-8"));
		System.out.println(URLEncoder.encode("This*string*has*asterisks", "UTF-8"));
		System.out.println(URLEncoder.encode("This+string+has+pluses", "UTF-8"));
		System.out.println(URLEncoder.encode("This/string/has/slashes", "UTF-8"));
		System.out.println(URLEncoder.encode("This\"string\"has\"quote\"marks", "UTF-8"));
		System.out.println(URLEncoder.encode("This:string:has:colons", "UTF-8"));
		
	}
}
