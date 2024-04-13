import java.util.Scanner;
class Hotel{
     public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
		System.out.println(" 1.veg \n 2.non-veg");
		int ch=sc.nextInt();
		switch(ch){
		   case 1:
		   {
		     System.out.println("veg Menu: \n1.VadaPav  ------------- 15/-");
			 System.out.println("2.Samosa   ------------- 20/-");
			 System.out.println("3.Patis   ------------- 20/-");
			 System.out.println("4.Poha   ------------- 15/-");
			 
			 System.out.println("Enter your choice");
			 int choice=sc.nextInt();
		      switch(choice){
				 case 1:
				 {  
					 System.out.println("Quantity:");
					 int quan=sc.nextInt();
					 int availablequan=10;
					 if(quan<=10){
						 System.out.println("Order successful");
						 double totalBill=15*quan;
					 System.out.println("your total Bill of "+quan+" Vadapav is:"+totalBill);
					 }
					 else{
						 System.out.println("available quantity is:"+availablequan+" please order another item..");
						 	       //availablequan=availablequan-quan;
					 }
					   break;
					 
				   }
				 
				 case 3:
				 {
					 System.out.println("Quantity:");
					 int quan=sc.nextInt();
					 int availablequan=10;
					 if(quan<=10){
						 System.out.println("Order successful");
						 double totalBill=20*quan;
					     System.out.println("your total Bill of "+quan+" Patice is:"+totalBill);
					 }
					 else{
						 System.out.println("available quantity is:"+availablequan+" please order another item..");
						 	       //availablequan=availablequan-quan;
					 }
					  break;
				 }
				 case 4:
				 {
					System.out.println("Quantity:");
					 int quan=sc.nextInt();
					 int availablequan=10;
					 if(quan<=10){
						 System.out.println("Order successful");
						 double totalBill=20*quan;
					     System.out.println("your total Bill of "+quan+" Poha plates is:"+totalBill); 
					 }
					 else{
						 System.out.println("available quantity is:"+availablequan+" please order another item..");
						 	       //availablequan=availablequan-quan;
					 }
					  break;
				 }
				  
			  } 
		   }
		   case 2:{
			 System.out.println("veg Menu: \n1.Andakari  ------------- 35/-");
			 System.out.println("2.Biryani   ------------- 70/-");
			 System.out.println("3.Chaines   ------------- 50/-");
			 System.out.println("4.Burji   ------------- 30/-");
			 
			 System.out.println("Enter your choice");
			 int choice=sc.nextInt();
		      switch(choice){
				 case 1:
				 {  
					 System.out.println("Quantity:");
					 int quan=sc.nextInt();
					 int availablequan=10;
					 if(quan<=10){
						 System.out.println("Order successful");
						 double totalBill=15*quan;
					 System.out.println("your total Bill of "+quan+" Vadapav is:"+totalBill);
					 }
					 else{
						 System.out.println("available quantity is:"+availablequan+" please order another item..");
						 	       //availablequan=availablequan-quan;
					 }
					   break;
					 
				   }
				 
				 case 3:
				 {
					 System.out.println("Quantity:");
					 int quan=sc.nextInt();
					 int availablequan=10;
					 if(quan<=10){
						 System.out.println("Order successful");
						 double totalBill=20*quan;
					     System.out.println("your total Bill of "+quan+" Patice is:"+totalBill);
					 }
					 else{
						 System.out.println("available quantity is:"+availablequan+" please order another item..");
						 	       //availablequan=availablequan-quan;
					 }
					  break;
				 }
				 case 4:
				 {
					System.out.println("Quantity:");
					 int quan=sc.nextInt();
					 int availablequan=10;
					 if(quan<=10){
						 System.out.println("Order successful");
						 double totalBill=20*quan;
					     System.out.println("your total Bill of "+quan+" Poha plates is:"+totalBill); 
					 }
					 else{
						 System.out.println("available quantity is:"+availablequan+" please order another item..");
						 	       //availablequan=availablequan-quan;
					 }
					  break;
				 }
				  
			  }   
			   
		   }
		}
	 }
	 
}