class RunTwo 
{
	public static void main(String[] args) 
	{
		Thread t1 = new Thread(){
			public void run(){
			System.out.println("First Thread with anonymous class");}
		};
		
		Thread t2 = new Thread(){
			public void run(){
				System.out.println("Second Thread with anonymous class");}
		};
		t1.start();
		t2.start();
	}
}
