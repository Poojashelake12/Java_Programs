import java.util.Scanner;
class PrimePattern{
    public static void main(String[] args){
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the number");
	   int n=sc.nextInt();
	   
	    int start=2,end=n-1;
         for(;start<end;start++){
		      int den=2;
			  for(int j=den;den<start;den++){
				 if(start%den==0){
			       break;
			  } 
			  }
			  
			  if(start==den){
				  //System.out.print(start);
			      for(int i=0;i<n;i++){
				     for(int j=0;j<n;j++){
					    System.out.print(start+" ");
					 }
					 System.out.println();
				  }
			  }
		 }		
	   
	}
}