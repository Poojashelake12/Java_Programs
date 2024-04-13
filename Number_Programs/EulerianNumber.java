class EulerianNumber{
     public static void main(String[] args){
	     int num=123451;
		 System.out.println(eulerianNumber(num));
	 }
	 public static int eulerianNumber(int num){
	      int pair=0;
		  int last=num%10;
		  num/=10;
		  for(int i=num;i!=0;i/=10){
		         int secLast=num%10;
		       if(last> secLast){
			      pair++;
				  System.out.println(secLast+" "+last+"-->"+pair);
			   }
			   num/=10;
			   last=secLast;
		  }
		  return pair;
	 }
}