package api.lang.exception;

public class Calculator {
	//이 메소드는 잠재적으로 예외가 발생할 수 있는 "위험한" 메소드이다
	//이용을 할 때 이에 대한 대비가 되어 있지 않으면 오류가 발생한다
	//-> throws (예외 전가 키워드)
	//(주의) RuntimeException은 전가해도 예외가 발생하지 않는다 (Unchekced Exception)
	public static int div(int left, int right) throws Exception {
		return left / right;
	}
}
