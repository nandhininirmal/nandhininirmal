package week3.day1;

public class samsung extends AndroidTV {
	
	public static void main(String[] args) 
	{
		
		samsung op = new samsung();
		op.openApp();
		op.playVideo();
		
	}

	@Override
	public void openApp() {
		// TODO Auto-generated method stub
		System.out.println("Open Application");
	}

	public void playVideo() {
		// TODO Auto-generated method stub
		System.out.println("Play Video");
	}

	


}
