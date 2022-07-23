class math{  
  int cube(final int n){  
   n=n+2;//can't be changed as n is final  
   n*n*n;  
  }  
  public static void main(String args[]){  
    math b=new math();  
    b.cube(5);  
 }  
}  
