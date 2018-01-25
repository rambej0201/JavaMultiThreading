class MyThreadTwelve extends Thread 
{
	public void run(){
		for (int i = 0; i < 10 ; i++ )
		{
			try{Thread.sleep(1000);}
			catch(InterruptedException ie){ie.printStackTrace();}
			System.out.println("Daemon Thread Functionality "+i);
		}

	}
}
	class ThreadDemoTwelve
	{
	public static void main(String[] args) 
	{
		MyThreadTwelve t = new MyThreadTwelve();
		t.setDaemon(true);
		t.start();
		for (int i = 0; i < 10 ; i++ )
		{
			try{Thread.sleep(1000);}
			catch(InterruptedException ie){ie.printStackTrace();}
			System.out.println("Main Thread "+i);
		}
		
	}
}
