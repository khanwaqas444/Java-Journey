package multithreading;

public class Ab
{
	public static void main(String[] args) {
		DemoMulti t=new DemoMulti();
		t.start();
		
		for(int i=1; i<=5; i++)
		{
			System.out.println("Khan");
		}
	}

}