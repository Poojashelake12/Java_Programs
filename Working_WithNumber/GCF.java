class GCF{
     public static void main(String[] args){
	    int num1=36,num2=60,gcf=0; //gcf==hcf
		 
		 for(int i=1;i<num1||i<num2;i++){
		     if(num1%i==0 && num2%i==0){
			     gcf=i;
			 }
		 }
		 System.out.println(gcf);
	 }

}