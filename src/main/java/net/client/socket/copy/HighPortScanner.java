package net.client.socket.copy;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @Description: 高性能的扫描
 * @Author     : kojavaee@qq.com
 * @Date       : 2013-3-27 下午9:35:58
 *
 */
public class HighPortScanner {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String host = "127.0.0.1";
		
		try {
			InetAddress theAddress = InetAddress.getByName(host);
			for(int i=1024; i<65536; i++) {
				try {
					Socket theSocket = new Socket(theAddress, i);
					System.out.println("There is a server on port " + i + " of " + host);
				} catch (IOException e) {
//					e.printStackTrace();
				}
			}
			
		} catch (UnknownHostException e) {
			System.err.println(e);
		}
	}
}
