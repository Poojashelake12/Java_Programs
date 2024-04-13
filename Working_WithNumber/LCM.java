//LCM of two numbers

class LCM{
     public static void main(String args[]){
	    
		int num1=12,num2=14,lcm=0,hcf=0;
		
		/*int max=(num1>num2 ? num1 :num2);
		
		for(int i=max;i<=num1*num2;i++){
		   if(i%num1==0 && i%num2==0){
		      lcm=i;
			  break;
		   }
		}
		System.out.println(lcm);*/
		
		
		for(int i=1;i<num1 || i<num2;i++){
			
			if(num1%i==0 && num2%i==0){
				hcf=i;
			}
		}
		
		lcm=(num1*num2)/hcf;
		System.out.println(lcm);
	 }
}