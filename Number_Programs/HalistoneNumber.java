class HalistoneNumber{
     public static void main(String[] args){
	      int num=8;
		  int ct=1;
		  while(num!=1){
		      if(num%2==0){
			      num=num/2;
				  ct++;
			  }
			  else{
			       num=3*num+1;
				   ct++;
			  } 
		  }
		  System.out.println("Steps:"+ct);
	 }
}