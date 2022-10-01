class College{
int c;
int d;   
int g=50;
int b=37;
float e;
double f;	 

void study(){
 c=g+b;
 d=g*b;
 e=g/b;
 f=g%b;
	System.out.println("Adition:" +c);
	System.out.println("Multiplication  " +d);
	System.out.println("division "+e);
	System.out.println("module  "+f);
}
public  static void main(String []arg){
	
	College student = new College();
	student.study();
	
}


}



