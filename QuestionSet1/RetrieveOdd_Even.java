package QuestionSet1;

public class RetrieveOdd_Even {

	public static void main(String[] args) {
		
		int a[]= {12,1,32,3};
		System.out.println("Even Numbers:");
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] %2==0) {
				System.out.println(a[i]);
			}
		}	
		
		int b[]= {0,12,2,23};
		System.out.println("Odd Numbers:");
		
		for(int j = 0; j < b.length; j++) {
			if(b[j] %2!=0) {
				
				System.out.println(b[j]);
			}
		}

	}

}
