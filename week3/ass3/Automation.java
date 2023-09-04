package homeassignments.week3.ass3;

public class Automation extends MultipleLangauge {

	@Override
	public void Java() {
		// TODO Auto-generated method stub
		System.out.println("I am Java");
	}

	@Override
	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("I am Selenium");
	}

	public static void main(String[] args) {
		
		Automation auto = new Automation();
		auto.Java();
		auto.Selenium();
		auto.ruby();
		auto.python();
		
		
	}
	
}
