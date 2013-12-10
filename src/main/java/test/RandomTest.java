package test;

public class RandomTest {
	public static void main(String[] args) {
		System.out.println(Math.random());
		int i = (int)Math.random()*2;// random()会自动产生一个0.0-1.0的双精度随机数
		System.out.println(i);// 输出
		i = (int)Math.random() * 1000;// 产生0-1000的双精度随机数
		System.out.println(i);
		int b = (int) (Math.random() * 1000);// 产生0-1000的整数随机数
		System.out.println(b);
	}
}
