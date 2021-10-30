class Constructorr{
	int a1;
	public Constructorr(){
	System.out.println("Hello Constructor");
	int a=4;
	int b=2;
	int c=6;
	System.out.println("The Sum of Three variables is "+(a+b+c));
	}
	public static void main(String args[]){
	Constructorr t=new Constructorr();
	t.a1=1;
	System.out.println("The value of t Object is " +(t.a1));
	}
}