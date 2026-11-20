package com.javaintro;

public class Final {
	@Override
	protected void finalize() throws Throwable {
		System.out.println(" finalization");
	}
	//static void show() {
	//	Final f = new Final();
	//}

	public static void main(String[] args) {
		System.out.println("main method started");
		Final e1 = new Final();	
		Final e2 = new Final();
		Final e3 = new Final();
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		e3=null;
		
		System.out.println(e3);
		System.out.println("main method ended");
		System.gc();
		System.out.println(e1);
		System.out.println(e2);

		e1=e2;
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		//System.gc();
	   new Final();
	}

}





