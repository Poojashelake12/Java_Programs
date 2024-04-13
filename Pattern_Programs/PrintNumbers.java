
class PrintNumbers{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the number");
	  int n=sc.nextInt();
	    int a=1;
	  for(int i=1;i<=n;i++){
		  
	     for(int j=1;j<=n;j++){
			 
		    System.out.print(a+" ");
			a=a+1;
		 }
	     System.out.println();
		 
	  }
   }
}