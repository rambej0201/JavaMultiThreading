class MyThreadFourteen extends Thread
{
	public void run(){
		for (int i = 0; i < 5 ; i++ )
		{
			System.out.println(Thread.currentThread().getName()+"--"+i);
			try
			{Thread.sleep(1000);}
			catch (InterruptedException ie)
			{ie.printStackTrace();}
		}
	}
	}
	class ThreadDemoFourteen
	{
	public static void main(String[] args) 
	{
		MyThreadFourteen ft = new MyThreadFourteen();
		MyThreadFourteen fn = new MyThreadFourteen();
		ft.start(); fn.start();
		for (int i = 0; i < 5 ; i++ )
		{
			System.out.println("main thread- "+i);
			try
			{Thread.sleep(1000);}
			catch (InterruptedException ie)
			{ie.printStackTrace();}
		}
	}
}
