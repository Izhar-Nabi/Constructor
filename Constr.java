class Constr{
	int a;
	public Constr(){
	System.out.println("Hello Constructor");
	int a=4;
	int b=2;
	int c=6;
	System.out.println(a+b+c);
	}
	public Constr(int arr[]){
	for(int i=0; i<arr.length; i++){
	System.out.print(arr[i]); }
	System.out.print("  Array ");
		}
	public static void main(String args[]){
	Constr t=new Constr();
	t.a=1;
	int arr[]={1,2,3,4,5};
	Constr t1=new Constr(arr);
	t1.a=3;
	System.out.println("\nThe value of t Object is "+t.a);
	System.out.println("\nThe value of t1 object is " +t1.a);
	}	
}