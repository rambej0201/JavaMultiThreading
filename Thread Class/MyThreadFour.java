class MyThreadFour extends Thread 
{
	public void start(){
		for (int i = 0; i < 10 ; i++ )
		{System.out.println("User Thread");
		}
	}

}
	class ThreadDemoThree 
	{
	public static void main(String[] args) 
	{
		MyThreadFour f = new MyThreadFour();
		f.start();
		for (int i = 0; i < 10 ;i++ )
		{
			System.out.println("main thread");

		}
		
	}
}
