package recursionV1;

public class Program {

	public static void main(String[] args) {
// ejercicio A
		int x = d(15,5,0);
		System.out.println(x);
		
// ejercicio numer b
		int y = p (2,5);
		System.out.println(y);
// ejercicio numero c		
		int z = fac(5,1);
		System.out.println(z);
			
	}
		public static int  d( int a , int b,int i ) {
			
		if (a < b) {
				return i;
			}
			else {
				return d (a-b,b,i+1);
			}
				
		}
		
		public static int  p( int a , int b) {
			
			if (b == 1) {
					return a;
				}
				else {
					return  a * p( a , b-1);
				}
					
			}
		
		
        public static int  fac( int a , int b) {
			
			if (a == 1) {
					return b;
				}
				else {
					return  fac( a-1 , b*a);
					
				}
		
        }
	
		
		
	}

