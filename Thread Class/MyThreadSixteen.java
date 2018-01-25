class MyThreadSixteen extends Thread 
{
	public void run(){
		for (int i = 0; i < 5 ; i++ )
		{System.out.println(Thread.currentThread().getName()+"--"+i);
		try {Thread.sleep(2000);}
		catch(InterruptedException ie)
			{ie.printStackTrace();}
		}
	}
	}
	class ThreadDemoSixteen
	{
	public static void main(String[] args) 
	{
		MyThreadSixteen si = new MyThreadSixteen();
		MyThreadSixteen sx = new MyThreadSixteen();
		si.start();
		try {si.join(2000);}
		catch(InterruptedException ie)
		{ie.printStackTrace();}
		sx.start();
		for (int i = 0; i < 5 ; i++ )
		{System.out.println("Main Thread -"+i);
		try {Thread.sleep(2000);}
		catch(InterruptedException ie)
			{ie.printStackTrace();}
		}
		
	}
}
