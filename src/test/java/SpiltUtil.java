public class SpiltUtil {

	public static String[] split(String msg, int length) {
		int len = msg.length();
		if (len <= length)
			return new String[] { msg };

		int count = len / length;
		count += len > length * count ? 1 : 0;

		String[] result = new String[count];

		int pos = 0;
		int splitLen = length;
		for (int i = 0; i < count; i++) {
			if (i == count - 1)
				splitLen = len - pos;

			result[i] = msg.substring(pos, pos + splitLen);
			pos += splitLen;

		}

		return result;
	}

	public static void main(String[] args) {
		String temp = "Default values for the AllowUserInteraction and UseCaches parameters can be set using the methods setDefaultAllowUserInteraction and setDefaultUseCaches.";
		String[] ddd = split(temp, 50);
		System.out.println("temp length:" + temp.length());
		for (int i = 0; i < ddd.length; i++) {
			System.out.println(i + " " + ddd[i] + "\t长度:" + ddd[i].length());
		}
	}

}
//output
//temp length:153
//0 Default values for the AllowUserInteraction and Us	长度:50
//1 eCaches parameters can be set using the methods se	长度:50
//2 tDefaultAllowUserInteraction and setDefaultUseCach	长度:50
//3 es.	长度:3