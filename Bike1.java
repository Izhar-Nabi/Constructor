class Bike1{  
//creating a default constructor  
int model;
String colour;
String Company;
Bike1(){System.out.println("Bike is created");}  
//main method  
public static void main(String args[]){  
//calling a default constructor  
Bike1 b=new Bike1();  
b.model=2021;
b.colour="Black";
b.Company="Honda";
System.out.println(b.model+ " Model");
System.out.println(b.colour+ " Colour");
System.out.println(b.Company+ " Company");
}  
}  