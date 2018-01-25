class RunFour 
{
	public static void main(String[] args) 
	{
		Thread t1 = new Thread(){
			public void run(){
				System.out.println("Starting Thread twice to get IlligalThreadStateException");
			}
		};

		t1.start();
		t1.start();
	}
}
