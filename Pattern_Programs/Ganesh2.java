class Ganesh2{
     public static void main(String[] args){
	   int n1=16,n2=17;
	   
	   for(int i=0;i<4;i++){
		    //n1=16;
			n2=12;
	      for(int j=0;j<=7-i-1;j++){
			    System.out.print(" "+" ");
		  }
		  for(int j=0;j<2*i+1&&i<4;j++){
			    System.out.print("*"+" ");
				
		   }
			 System.out.println();
	   }
        for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
			  if(j<i){
				  System.out.print("  ");
			  }
			  else{
				  System.out.print("#"+" ");
			  }
			
			}
			for(int j=6;j<13;j++){
				if(j>=6)
				  System.out.print("@"+" ");
			    else
					System.out.print("  ");
			}
			for(int j=13;j<=16-i;j++){
				System.out.print("#"+" ");
			}
             System.out.println();   			  
		 }	
		 for(int i=1;i<=8;i++){}
//for(int i=0;i<4;i++){
			 
			  /*for(int j=14;j<17-i;j++){
				  System.out.print("#"+" ");
			  }*/
			  
		 //}		 
		 
	 }
}