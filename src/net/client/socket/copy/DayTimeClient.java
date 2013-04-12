package net.client.socket.copy;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @Description: 日期时间协议客户端
 * @Author     : kojavaee@qq.com
 * @Date       : 2013-3-27 下午9:57:52
 *
 */
public class DayTimeClient {
	public static void main(String[] args) {
		String hostname;
		
		if(args.length > 0)
			hostname = args[0];
		else
			hostname = "time.nist.gov";
		
		try {
			Socket theSocket = new Socket(hostname, 13);
			InputStream timeStream = theSocket.getInputStream();
			StringBuffer sb = new StringBuffer();
			int c;
			while((c = timeStream.read()) != -1) sb.append((char)c);
			String timeStr = sb.toString().trim();
			System.out.println("It is " + timeStr + " at " + hostname);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
