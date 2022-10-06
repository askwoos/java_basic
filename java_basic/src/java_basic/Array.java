package java_basic;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
	//String 배열 내용 찍기.
		
		printStringinArray3();
		calcultateNumberofMatrix() ;		
	}//main
	
	
	public static void printStringinArray() {
		//String 배열 내용 찍기.

		String [] names = {"woo","kim","lee"};
		
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		
	}//calculateValuse
	
	
	public static void printStringinArray2() {
		//String 배열 내용 찍기.len을 블럭바깥으로 빼면 메모리 효율이 조금 낫다  .과 []메모리접근시간이 들기때문

		String [] names = {"woo","kim","lee"};
		
		final int LEN = names.length;
			
		for(int i=0;i<names.length;i++) {
			//System.out.println(names[i]);
		}
		
	}//calculateValuse
	
	public static void printStringinArray3() {
		//String 배열 내용 찍기.len을 블럭바깥으로 빼면 메모리 효율이 조금 낫다  .과 []메모리접근시간이 들기때문
       

		
		String [] names = {"woo","kim","lee"};
		
		
		for(String singer : names) {
		//	System.out.println(singer);
		}
		
	}//calculateValuse
	
	public static void calcultateNumberofMatrix() {
		//String 배열 내용 찍기.len을 블럭바깥으로 빼면 메모리 효율이 조금 낫다  .과 []메모리접근시간이 들기때문
       

		
		String [][] groups = {{"woo","kim"},
		           			  {"레드벨벳","에스파"},
		           			  {"2ne1","에스파"}
		           			  };
		
			System.out.println(groups[1][1]);
			System.out.println(groups.length);//행갯수
			System.out.println(groups[1].length);//열갯수

		
	}//calculateValuse
	
	
	
	
	

}
