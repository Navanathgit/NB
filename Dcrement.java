class Decrement{
public static void main(String arg[]){

int a=40;
int b=--a;
--b;
int c=b--;

System.out.println("a  :"+a);//39
System.out.println("b  :"+b);//37
System.out.println("c  :"+c);//38
System.out.println("postdecrement  :"+(c--));//38
System.out.println("c  :"+c);//37
System.out.println("Adition  :"+(a+b+c));//113



}





}