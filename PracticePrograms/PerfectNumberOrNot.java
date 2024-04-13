//find thr factors of the excluding digit are equals to given number
//perfect Number

import java.util.Scanner;
class PerfectNumberOrNot{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
         int num=sc.nextInt();
         int sum=0;
        int din=1 ;
         int temp=num;
        while(din<num){
             if(num%din==0){
                  sum+=din;
            }
         din++;
      }
         
        if(temp==sum){
            System.out.println("It is a perfect number");
         }
          else{
            System.out.println("It is a not perfect number");
        }
   }
}
