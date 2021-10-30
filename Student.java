class Student{  
int id;  
String name;   
void display(){System.out.println(id+" "+name);}  
  
public static void main(String args[]){  
//creating objects  
Student s1=new Student();  
Student s2=new Student();
s1.id=10;
s1.name="XYZ";
s2.id=12;
s2.name="XYZ";    
s1.display();  
s2.display();  
}  
}  