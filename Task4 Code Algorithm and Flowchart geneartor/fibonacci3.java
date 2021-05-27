class parent{
 void parent(){}
}
class fibonacci extends parent{  
 void fibonacci(){}
 static int n1=0,n2=1,n3=0;    
 static void printFibonacci(int count){    
    if(count>0){    
         n3 = n1 + n2;    
         n1 = n2;    
         n2 = n3;    
         System.out.print(" "+n3);   
         printFibonacci(count-1);    
     }    
 }
}
public class fibonacci3{    
 public static void main(String args[]){    
  fibonacci obj1 = new fibonacci();
  int count=10;    
  System.out.print(obj1.n1+" "+obj1.n2);//printing 0 and 1    
  obj1.printFibonacci(count-2);//n-2 because 2 numbers are already printed   
 }  
}  