//find factors

class FindFactors{
    public static void main(String[] args){
     int num=20;
     int den=1;
     while(den<=num){
        if(num%den==0){
          System.out.println(den);
       }
        den++;
    }
}
}