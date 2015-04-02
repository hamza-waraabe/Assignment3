public class Week10_2 {
	public static void main(String [] args){
		int limit = 100;
		int j = 0;
		
		for(int n=1; n<=100; n++){
			if(n % 2 !=  0){
			System.out.println(n);
			}
			}
		
		do{
			j=j+2;
			System.out.println(j);} 
			while(j<limit);
		
		int i = 1;
		int numb = 0;
		int space =20;
		while(i<=5){
			int p = 0;
			int q =0;
			while(q<=space){
				System.out.print(" ");
				q++;
			}
			if( i <3){
				space = space -1;
			}
			else{
				space = space +1;
			}
			while(p <= numb){
				System.out.print("*");
				p++;
			}
			System.out.println();
			if(i<3){
				numb = numb+2;
			}
			else{
				numb= numb -2;}
			i++;
			}
		}
		
		
			
	
			
		
	}
