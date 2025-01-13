

public class Test2 {

	public static void main(String[] args) {
		
		int a[]= { 1,2, 3, 4,5, 6, 7, 8, 9};
		int even=0;
		int odd=0;
		
		for(int i=0; i<a.length; i++) {
			if(a[i]%2==0) {
				even++;
				System.out.println("even numbers are " +a[i]);
				
			}
			else
			{
				//System.out.println(a[i]);
				odd++;
				System.out.println("odd numbers are " +a[i]);
			}
		}
			 System.out.println("Number of even numbers: " + even);
		        System.out.println("Number of odd numbers: " + odd);
				
			}
		}
		
		
		



