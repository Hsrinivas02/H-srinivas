package pom;

public class sauce2 {
public static void main(String[] args) throws InterruptedException {
	s2 e=new s2();
	e.exe("lb");
	Thread.sleep(2000);
	e.exe("url");
	Thread.sleep(2000);

	e.exe("user");
	Thread.sleep(2000);

	e.exe("pass");
	Thread.sleep(2000);

	e.exe("login");
	
	e.exe("close");
}
}
