package net.urlAndUri;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @Description: 虚拟机支持那些协议？
 * @Author     : lzh kojavaee@qq.com
 * @Date       : 2013-3-24 上午7:05:53
 *
 */
public class ProtocolTester {
	private static void testProtocol(String urlStr) {
		try {
			URL url = new URL(urlStr);
		} catch (MalformedURLException e) {
			String protocol = urlStr.substring(0,urlStr.indexOf(':'));
			System.out.println(protocol + " is not supported");
		}
	}
	
	public static void main(String[] args) {
		testProtocol("http://www.abc.org");
		testProtocol("https://www.amazon.com/exec/obidos/order2/");
		testProtocol("ftp://metalab.unc.edu/pub/languages/java/javafag/");
		testProtocol("mailto:kojavaee@qq.com");
		testProtocol("telnet://dibner.poly.edu/");
		testProtocol("file:///etc/passwd");
		
//		Gopher是Internet上一个非常有名的信息查找系统，它将Internet上的文件组织成某种索引，
//		很方便地将用户从Internet的一处带到另一处，现在已经过时了
		testProtocol("gopher://goper.anc.org.za/");
		
		//轻量级目录访问协议
		//LDAP其实是一个电话簿，类似于我们所使用诸如NIS(Network Information Service)、DNS (Domain Name Service)等网络目录
		testProtocol("ldap://ldap.itd.umich.edu/o=University%20of%20Michigan,c=US?postalAddress");
		testProtocol("jar:http://cafeaulait.org/books/javaio/ioexamples/javaio.jar!"
				+ "/com/macfaq/io/StreamCopier.class");
		testProtocol("nfs://utopia.poly.edu/usr/tmp");
		testProtocol("jdbc:mysql://luna.metalab.unc.edu:3306/NEWS");
		testProtocol("rmi://metalab.unc.edu/RederEngine");
		
		//HotJava的定制协议
		testProtocol("doc:/UsersGuide/release.html");
		testProtocol("netdoc:/UserGuide/release.html");
		testProtocol("systemresource:/www.adc.org/+/index.html");
		testProtocol("verbatim:http://www.adc.org/");
		
		
	}
}
