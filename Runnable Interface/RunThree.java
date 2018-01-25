class RunThree 
{
	public static void main(String[] args) 
	{
		new Thread(){
			public void run(){
				System.out.println("t1 thread with anonymous class & .start()");
			}
		}.start();

		new Thread(){
			public void run(){
				System.out.println("t2 thread with anonymous class & .start()");
			}
		}.start();
		
	}
}
