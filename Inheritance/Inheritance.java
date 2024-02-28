import java.util.*;
class Employe   {
   String name;
   String address;
   int age;
   int ph;
   float salary;
   public Employe(String name,String address, int age,int ph,float salary)   {
      this.name = name;
      this.address = address;
      this.age = age;
      this.ph = ph;
      this.salary = salary;
   }
   public void printSalary()   {
      System.out.print("Salary of employee: "+salary);
   }
}
class Officer extends Employe   {
   String specialization;
   public Officer(String name ,String address ,int age, int ph ,float salary, String specialization)   {
      super(name,address,age,ph,salary);
      this.specialization = specialization;
   }
   void Display()   {
      System.out.println("\nOFFICER DETAILS\n");
      System.out.println("Name:"+name);
      System.out.println("Address:"+address);
      System.out.println("Age"+age);
      System.out.println("Phone number:"+ph);
      System.out.println("Salary: "+salary);
      System.out.println("Specialization: "+specialization);
      super.printSalary();
      System.out.print("\n");
   }
}

class Manager extends Employe   {
   String department;
   public Manager(String name ,String address ,int age, int ph ,float salary, String department)   {
      super(name,address,age,ph,salary);
      this.department = department;
   }
   void Display()   {
      System.out.println("\nMANAGER DETAILS\n");
      System.out.println("Name:"+name);
      System.out.println("Address:"+address);
      System.out.println("Age:"+age);
      System.out.println("Phone number:"+ph);
      System.out.println("Salary:"+salary);
      System.out.println("Department:"+department);
   }
}
public class Inheritance   {
   public static void main(String[] args)   {
      Scanner sc = new Scanner(System.in);
      
      //Officer
      System.out.print("Enter name of officer: ");
      String name1 = sc.next();
      System.out.print("Enter address of officer: ");
      String address1 = sc.next();
      System.out.print("Enter age of officer: ");
      int age1 = sc.nextInt();
      System.out.print("Enter phone number of officer: ");
      int ph1 = sc.nextInt();
      System.out.print("Enter salary of officer: ");
      float salary1 = sc.nextFloat();
      System.out.print("Enter speciaization: ");
      String sp1 = sc.next();

      //Manager
      System.out.print("Enter name of manager: ");
      String name2 = sc.next();
      System.out.print("Enter address of manager: ");
      String address2 = sc.next();
      System.out.print("Enter age of manager: ");
      int age2 = sc.nextInt();
      System.out.print("Enter phone number: ");
      int ph2 = sc.nextInt();
      System.out.print("Enter salary of manager: ");
      float salary2 = sc.nextFloat();
      System.out.print("Enter department: ");
      String dept2 = sc.next();

      //Display
      Officer Of = new Officer(name1,address1,age1,ph1,salary1,sp1);
      Of.Display();
      Manager M = new Manager(name2,address2,age2,ph2,salary2,dept2);
      M.Display();
   }
}

/*
  Write a Java program which creates a class named 'Employee' having the following members: Name, Age, Phone number, Address, Salary. It also has a method named 'printSalary' which prints the salary of the Employee. Two classes 'Officer' and 'Manager' inherits the 'Employee' class. The 'Officer' and 'Manager' classes have data members 'specialization' and 'department' respectively. Now, assign name, age, phone number, address and salary to an officer and a manager by making an object of both of these classes and print the same.
 */