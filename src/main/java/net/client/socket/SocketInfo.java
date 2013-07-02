package net.client.socket;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @Description: 获得socket信息
 * @Author     : kojavaee@qq.com
 * @Date       : 2013-3-27 下午9:50:43
 *
 */
public class SocketInfo {
	public static void main(String[] args) {
		for (int i=0; i<args.length; i++) {
			try {
				Socket theSocket = new Socket(args[i],80);
				System.out.println("Connected to " + theSocket.getInetAddress() +
						" on port " + theSocket.getPort() +
						" from port " + theSocket.getLocalPort() +
						" of " + theSocket.getLocalAddress());
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
