class MyThreadEleven extends Thread 
{
	public void run(){
		System.out.println("Hook Thread Functionality");
	}

}
	class ThreadDemoEleven
	{	
	public static void main(String[] args) 
	{
		MyThreadEleven e = new MyThreadEleven();
		Runtime r = Runtime.getRuntime();
		r.addShutdownHook(e);
		for (int i = 0; i < 10 ; i++)
		{
			System.out.println("main thread my friend "+i);
			try{Thread.sleep(1000);}
			catch(InterruptedException ie){ie.printStackTrace();}
			if (i == 5)
		{
			System.exit(0);
		}
		}
		
	}
}
