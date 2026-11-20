package com.javaintro;

public class TestDemo6 {
	
		static void demo1() {
			System.out.println("static block1");
		}
		static void demo2() {
			
			System.out.println("static block2");

		}
		 void dog() {
			
			System.out.println("instance block1");
			
		}
		 void cat() {
		
			 System.out.println("instance block2");
			
		 }
		 static {
			 demo1();
			 demo2();
			 TestDemo6 t = new TestDemo6();
			 t.dog();
			 t.cat();
		 }
	public static void main(String[] args) {
	}
}
		

	

