package task_one; 
import java.util.Scanner; 
class test{ 
 public void arithmetic(int a,int b) 
 { 
        System.out.println("A+B value is:"+(a+b)); 
        System.out.println("A-B value is:"+(a-b)); 
        System.out.println("A*B value is:"+(a*b)); 
        System.out.println("A/B value is:"+(a/b)); 
        System.out.println("A%B value is:"+(a%b)); 
 } 
 public void relational(int a,int b) 
 { 
        System.out.println("A==B is:"+(a==b)); 
        System.out.println("A!=B is:"+(a!=b)); 
        System.out.println("A>B is:"+(a>b)); 
        System.out.println("A<B is:"+(a<b)); 
        System.out.println("A>=B is:"+(a>=b)); 
        System.out.println("A<=B is:"+(a<=b)); 
 } 
 public void logical(int a,int b) 
 { 
        System.out.println("A>3 && B<3 is:"+(a>3 && b<3)); 
        System.out.println("A>3 || B<3 is:"+(a>3 || b<3)); 
        System.out.println("A>B is:"+!(a>b)); 
 } 
 public void assignment(int a,int b) 
 { 
        System.out.println("A+3 is:"+(a+=3)); 
        System.out.println("B-5 is:"+(a-=5)); 
        System.out.println("A*4 is:"+(a*=4)); 
        System.out.println("B/2 is:"+(a/=2)); 
        System.out.println("A%2 is:"+(a%=2)); 
 } 
 public void unary(int a,int b) 
 { 
        System.out.println("A+ is:"+(+a)); 
        System.out.println("B- is:"+(-b)); 
        System.out.println("A++ is:"+(++a)); 
        System.out.println("B-- is:"+(--b)); 
 } 
 public void bitwise(int a,int b) 
 { 
        System.out.println("A&B is:"+(a&b)); 
        System.out.println("A|B is:"+(a|b)); 
        System.out.println("A^B is:"+(a^b)); 
        System.out.println("~A is:"+(~a)); 
        System.out.println("A>>2 is:"+(a>>2)); 
        System.out.println("B<<1 is:"+(b<<1)); 
 
 } 
} 
public class operator_example{ 
 public static void main(String[] args) 
 { 
    int a,b; 
       Scanner s1=new Scanner(System.in); 
       System.out.println("Enter a A value:"); 
       a=s1.nextInt(); 
       System.out.println("Enter a B value:"); 
       b=s1.nextInt(); 
       test t1=new test(); 
       System.out.println("Arithmetic Operators:"); 
       t1.arithmetic(a, b); 
       System.out.println(); 
       System.out.println("Relational Operators:"); 
       t1.relational(a, b);   
       System.out.println(); 
       System.out.println("Logical Operators:"); 
       t1.logical(a, b);   
       System.out.println(); 
       System.out.println("Assignment Operators:"); 
       t1.assignment(a, b);  
       System.out.println(); 
       System.out.println("Unary Operators:"); 
       t1.unary(a, b);   
       System.out.println(); 
       System.out.println("Bitwise Operators:"); 
       t1.bitwise(a, b);   
       System.out.println(); 
    } 
} 