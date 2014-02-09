package test;

public class LearnTest {
	public static void main(String[] args) {
		String readInput = "1,2";
		String ALLOCATE_MONEY_LIMIT_MILLIS_DESC = "用户%s加入公会15天后才可分配祝福";
		String f = String.format(ALLOCATE_MONEY_LIMIT_MILLIS_DESC, "hi");
		System.out.println(f);
	}
}
