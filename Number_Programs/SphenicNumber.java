
class SphenicNumber{
     public static void main(String[] args){
	       int num=42;
		   if(isSphenicNumber(num)){
		        System.out.println("It is SphenicNumber");
		   }
		   else{
		      System.out.println("It is not SphenicNumber");
		   }
	 }
	 public static boolean isSphenicNumber(int num){
		 int prod=1;
		 int ct=0	;
		 for(int i=2;i<num;i++){
			 if(num%i==0 && isPrime(i)){
				 prod=prod*i;
                  ct++;
				 if(ct==3){
					break;				 
				 }
			 }
		 }
		 return prod==num&&ct==3;
	 }
	 public static boolean isPrime(int num){
	     for(int i=2;i<num;i++){
		     if(num%i==0){
			    return false;
			 }
		 }
		 return true;
	 }
}

//range of SphenicNumber
/*
class SphenicNumber{
     public static void main(String[] args){
		 
		 int start=1;
		 int end=100;
		 while(start<=end){
			 if(isSphenicNumber(start)){
			    System.out.println(start);
			 }
			 start++;
		 }
		 
	 }
	 public static boolean isSphenicNumber(int num){
		 int prod=1;
		 int ct=0	;
		 for(int i=2;i<num;i++){
			 if(num%i==0 && isPrime(i)){
				 prod=prod*i;
                  ct++;
				 if(ct==3){
					break;				 
				 }
			 }
		 }
		 return prod==num&&ct==3;
	 }
	 public static boolean isPrime(int num){
		 for(int i=2;i<num;i++){
			 if(num%i==0){
				 return false;
			 }
		 }
		 return true;
	 }
}*/