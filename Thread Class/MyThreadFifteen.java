class MyThreadFifteen extends Thread  
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
	class ThreadDemoFifteen
	{
	public static void main(String[] args) 
	{
		MyThreadFifteen ft = new MyThreadFifteen();
		MyThreadFifteen fn = new MyThreadFifteen();
		ft.start();
		try {ft.join();}
		catch (InterruptedException ie)
		{ie.printStackTrace();}
		fn.start();

		for (int i = 0; i < 5 ; i++)
		{System.out.println("main thread -"+i);
		try {Thread.sleep(1000);}
		catch(InterruptedException ie)
			{ie.printStackTrace();}
		}
	}
}
