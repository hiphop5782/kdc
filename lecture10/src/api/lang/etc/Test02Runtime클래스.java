package api.lang.etc;

public class Test02Runtime클래스 {
	public static void main(String[] args) {
//		Runtime 클래스
//		- 외부 실행환경을 이용할 수 있도록 도와주는 클래스
//		- 생성자가 없지만 인스턴스 생성 메소드가 존재 (Factory 패턴)
		
//		Runtime r = new Runtime();
		Runtime r = Runtime.getRuntime();
		
		String osName = System.getProperty("os.name");
		
		try {
			//r.exec("명령");
			
			if(osName.startsWith("Windows")) {
				//r.exec("notepad");//windows
				r.exec(new String[] {"notepad"});
			}
			else if(osName.startsWith("Mac")) {
				//r.exec("open -a TextEdit.app");//mac
				r.exec(new String[] {"open", "-a", "TextEdit.app"});
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
