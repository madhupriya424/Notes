
https://www.tutorialspoint.com/design_pattern/factory_pattern.htm
https://dzone.com/articles/singleton-design-pattern-%E2%80%93
https://sourcemaking.com/design_patterns
https://dzone.com/articles/singleton-design-pattern-%E2%80%93
https://www.geeksforgeeks.org/singleton-design-pattern/

class A{
    
    private static A obj;
    
    //default constructor
    private A(){
    }
       
    //static method so that we dont need any obj to call this method    
    public static A getObject(){
        if(obj == null){
            obj = new A();
        }
        
        return obj;   
    }
}
//  Sprinf, databaseConnectivity, 
class B{
    public static void main(String[] args){
        A o1 = A.getObject();  
        A o2 = A.getObject();
        A o3 = A.getObject();
        
        System.out.println(o1);        // A@1233455
        System.out.println(o2);        // A@1233455
        System.out.println(o3);        // A@1233455
    }
}

===============================================================================================================================
public class SingletonExample {
    private static final SingletonExample singletonInstance = new SingletonExample;
    // SingletonExample prevents any other class from instantiating
    private SingletonExample() {
    }
    // Providing Global point of access
    public static SingletonExample getSingletonInstance() {
        return singletonInstance;
    }
    public void printSingleton(){
        System.out.println("Inside print Singleton");
    }
}
----------------------------------------------------------------------------------------------------------------------------------
    
    
 /*package whatever //do not write package name here */

import java.io.*;

//singleton class
class Student{
    private static Student obj=null;
    
    public void showMessage(){
	 System.out.print("Hello world!");
	}
	
    public static Student getInstance(){
        if(obj==null){
           obj = new Student();
        }
    return obj;
    }
}


class Employee {

	public static void main (String[] args) {
	    Student s = Student.getInstance();
		s.showMessage();
	}
}

Output:
Hello World!
