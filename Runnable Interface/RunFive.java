class RunFive 
{
	public static void main(String[] args) 
	{
		Runnable r1 = new Runnable(){
			public void run(){
			System.out.println("first thread with Runnable interface");
			// System.out.println(r1.getClass().getName()); not valid
			}
		};
		Runnable r2 = new Runnable(){
			public void run(){
			System.out.println("second thread with Runnable interface");
			// System.out.println(r2.getClass().getName()); not valid
			}
		};
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
		
	}
}
