package net.urlAndUri;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @Description: download web page
 * @Author     : lzh kojavaee@qq.com
 * @Date       : 2013-3-24 下午12:04:28
 *
 */
public class SourceViewer {
	public static void main(String[] args) throws IOException {
		String url = "http://www.oreilly.com";
		try {
			URL u = new URL(url);
			InputStream in = u.openStream();
			
			in = new BufferedInputStream(in);
			Reader r = new InputStreamReader(in);
			
			int c;
			while((c = r.read()) != -1) {
				System.out.print((char) c);
			}
			
		} catch (MalformedURLException e) {
			System.err.println(url + "is not a pareseable URL");
			
		}
		
	}
}
