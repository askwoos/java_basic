package java_basic;



public class For {
	

		public static void main(String[] args) {
			
			for(int idx=0;idx<=5;idx=idx+1) {
				
				System.out.println("Hello world");
			}//for
			
			
			calculateValuse();
			
			
		}//main
		


		public static void calculateValuse() {
			
			int sum = 0;
			
			for(int idx=0;idx<=5;idx=idx+1) {
				
			 sum = sum + idx;
			 
			
			}//for
			
			System.out.println(sum);
			
		}//main

}

