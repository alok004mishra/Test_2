package work;

public class myclasscode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "aabbcdddddefg"; 
		
		char a[] = s.toCharArray();
		
	//System.out.println(a[10]);

		 
		 int  i,z1 = 0, t=0, j = 0 ;
		 
		 for (i=0; i < s.length(); i++){
			 int z = 0;
		 for (j=t; j< s.length(); j++){
			 
		 
		 if(a[i] == (a[j])){ 
		  z++;
		  z1++;
		 		 
		 }	 
		 t=z1;
		 }
		 if(z !=  0) {
		 System.out.print("Occurence of character " +a[i] + " is : ");
		 System.out.print(z);
		 System.out.println(" . ");
		 }
		 }
		 
		 }
		
		
	}


