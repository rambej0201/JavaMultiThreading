class SyncOne 
{
	static void msg (String str){
		for (int i = 0; i < 5 ; i++ )
		{
			System.out.println("Hello My Dear: "+str);
			try {Thread.sleep(1000);}
			catch (InterruptedException ie)
			{ie.printStackTrace();}
		}
	}
}
	class MyThreadOne extends Thread
	{
		public void run(){
			SyncOne.msg("Tyson");
		}
	}
	class MyThreadTwo extends Thread
	{
		public void run(){
			SyncOne.msg("Raghu");
		}
	}
	class MyThreadThree extends Thread
	{
		public void run(){
			SyncOne.msg("Anil");
		}
	}
	class OneSync
	{
	
	public static void main(String[] args) 
	{
		System.out.println("An example of non-synchronized in multi-threading");
		new MyThreadOne().start();
		new MyThreadTwo().start();
		new MyThreadThree().start();
	}
}
