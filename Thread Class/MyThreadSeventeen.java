class MyThreadSeventeen extends Thread 
{
	public void run(){
		for (int i = 0; i < 5 ; i++ )
		{
			System.out.println("User Thread -"+i);
			try {Thread.sleep(3000);}
			catch(InterruptedException ie)
			{System.out.println("Thread Interrupted");}
		}
	}
	}
	class ThreadDemoSeventeen
	{
	public static void main(String[] args) 
	{
		MyThreadSeventeen se = new MyThreadSeventeen();
		se.start();
		se.interrupt();
		
	}
}
