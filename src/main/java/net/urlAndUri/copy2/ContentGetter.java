package net.urlAndUri.copy2;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @Description: download object
 * @Author     : lzh laizhihuan@basecity.com
 * @Date       : 2013-3-24 下午12:12:07
 *
 */
public class ContentGetter {
	public static void main(String[] args) {
		if(args.length == 0) return;
		
		try {
			URL u = new URL(args[0]);
			Object o = u.getContent();
			System.out.println("I got a " + o.getClass().getName());
		} catch (MalformedURLException e) {
			System.err.println(e);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
}
