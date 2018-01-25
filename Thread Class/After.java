class After extends Thread 
{ public void run(){
	System.out.println("hook thread functionality");
}
	}
	class DemoAfter
	{
	public static void main(String[] args) 
	{
		After a = new After();
		Runtime r = Runtime.getRuntime();
		r.addShutdownHook(a);
		for (int i = 0; i < 5; i++ )
		{
			System.out.println(i);
		}
		
	}
}
