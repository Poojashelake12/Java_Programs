
class RangeUniqueNumber{

   public static boolean isUnique(int num){
       while(num!=0){
	      int temp=num;
		  int last=temp%10;
		   temp/=10;
		   while(temp!=0){
		     if(last!=temp%10){
			    temp/=10;
			 }
			 else{
			     break;
			 }
		   }
		   if(temp!=0){
		      break;
		   }
		   num/=10;
	   }
	   return num==0;
   }
   public static void main(String[] args){
         int start=1;
		 int end=100;
		 
		 while(start<=end){
		    if(isUnique(start)){
			   System.out.println(start);
			}
			start++;
		 }
   }
}