package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * download image by url
 * @author lzh
 *
 */
public class TestDownloadImage implements Runnable {
	
	public int buffer_size = 1024*1024*10;
	public String url = "";
	public String path = "";
	
	public TestDownloadImage(String url, String path) {
		this.url = url;
		this.path = path;
	}
	
	public boolean downlaodImage(String url,String outputPath) throws IOException {
		boolean successed = true;
		OutputStream os = null;
		InputStream is = null;
		try {
			URL imageUrl = new URL(url);
			is = imageUrl.openStream();
		
			os = new FileOutputStream(new File(outputPath));
		
			byte[] buffer = new byte[buffer_size];
		
			int reader = 0;
		
			while((reader = is.read(buffer,0,buffer_size)) != -1) {
				os.write(buffer,0,reader);
			}
		} catch (MalformedURLException e) {
			successed = false;
		} catch (FileNotFoundException e) {
			successed = false;
		} catch (IOException e) {
			successed = false;
		} finally {
			if(os != null) {
				os.flush();
				os.close();
				os = null;
			}
			if(is != null) {
				is.close();
				is = null;
			}
		}
		
		return successed;
	}
	
	 public void run() {
		 try {
			System.out.println("download : "+ url);
			boolean result = downlaodImage(url, path);
			System.out.println("download : "+ result);
		} catch (IOException e) {
			e.printStackTrace();
		}
     }
	
	
	public static void main(String[] args) {
		String url = "http://119.147.87.137:18080/file/init_images/0/";
//		String url = "http://192.168.0.173:18080/file/init_images/0/";
		String path = "/Users/lzh/temp/";
		long start = System.currentTimeMillis();
		System.out.println("start : " + start);
		
		TestDownloadImage imageDownload1 = new TestDownloadImage(url + "IMG_0514.jpg",path + "IMG_0514.jpg");
		TestDownloadImage imageDownload2 = new TestDownloadImage(url + "IMG_0121.jpg",path + "IMG_0121.jpg");
		TestDownloadImage imageDownload3 = new TestDownloadImage(url + "IMG_0488.jpg",path + "IMG_0488.jpg");
		TestDownloadImage imageDownload4 = new TestDownloadImage(url + "IMG_0702.jpg",path + "IMG_0702.jpg");
		
		ExecutorService exec = Executors.newCachedThreadPool();
		exec.execute(imageDownload1);
		exec.execute(imageDownload2);
		exec.execute(imageDownload3);
		exec.execute(imageDownload4);
		
		exec.shutdown();
		
		System.out.println("end");
	}
	
}
