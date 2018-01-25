class MyThreadTwo extends Thread
{
	}
	class ThreadDemoTwo
	{
	
	public static void main(String[] args) 
	{
		MyThreadTwo p = new MyThreadTwo();
		p.start();
		for (int i = 0; i < 10; i++ )
		{
			System.out.println("main method");
		}
		
	}
}
