package net.urlAndUri;

import java.applet.Applet;
import java.awt.GridLayout;
import java.awt.Label;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @Description: 相对于该web页面的URL
 * @Author     : lzh laizhihuan@basecity.com
 * @Date       : 2013-3-24 上午7:49:00
 *
 */
public class RelativeURLTest extends Applet {
	public void init() {
		try {
			URL base = this.getDocumentBase();
			URL relative = new URL(base, "mailinglists.html");
			this.setLayout(new GridLayout());
			this.add(new Label(base.toString()));
			this.add(new Label(relative.toString()));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
