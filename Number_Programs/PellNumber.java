/*
class PellNumber{
    public static void main(String[] args){
	   int num=10;
	   pellNumbers(num);
	}
	public static void pellNumbers(int num){
	    int n1=0;
		int n2=1;
		int n3;
		for(int i=1;i<=num;i++){
		    n3=2*n2+n1;
			System.out.println(n1);
			n1=n2;
			n2=n3;
		}
	}			
}*/

//range of pell number
class PellNumber{
	 public static void main(String[] args){
		 int num=30;
		 if(isPell(num)){
			 System.out.println("It is Pell Number");
		 }
		 else{
			 System.out.println("It is not Pell Number");
		 }
		 
	 }
	 public static boolean isPell(int num){
		 int n1=0,n2=1, n3;
		while(true){ 
		 if(n1==num){
			break;
		 }
		 else if(n1>num){
			 break;
		 }
		 else{
			 n3=2*n2+n1;
			 n1=n2;
			 n2=n3;
		 }
		}
		 return n1==num;
	 }
}