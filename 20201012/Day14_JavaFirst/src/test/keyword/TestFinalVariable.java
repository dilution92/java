package test.keyword;
public class TestFinalVariable{
	public static void main(String[] args) {
		final int num = 10;
		num = 100; // 에러. 변경 불가
	}
}