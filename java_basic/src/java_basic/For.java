package java_basic;



public class For {
	

		public static void main(String[] args) {
			
			for(int idx=0;idx<=5;idx=idx+1) {
				
		//		System.out.println("Hello world");
			}//for
			
			
			
			// 2중 for 줄어드는 별찍기
			//*****
			//****
			//***
			//**
			//*
			

			for(int i=0; i<5 ; i=i+1 ) {
				  
			   for(int j=0;j<5-i;j=j+1) {
				  
				   System.out.print("*");
				   
			   }//second for j
			   System.out.println();

			   
			}// first for i
			
			
			
			
			
			boolean flag = false;
			

			for(int i=0; i<10 ; i=i+1 ) {

			  
					
			}// for i
			calculateValuse();
			
			
		}//main
		


		public static void calculateValuse() {
			
			int sum = 0;
			
			for(int idx=0;idx<=5;idx=idx+1) {
				
			 sum = sum + idx;
			 
			
			}//for
			
			System.out.println(sum);
			
		}//calculateValuse

}

