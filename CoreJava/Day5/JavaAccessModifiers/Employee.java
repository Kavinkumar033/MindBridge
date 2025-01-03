package Day5.shapes;

public class Employee extends Person{
     Employee(String name,int age,String address,double salary)
     {
         super(name,age,address,salary);
     }

     public void DisplayEmployeeDetails()
     {
         System.out.println("Employee Details...");
         System.out.println("Employee Name : "+this.name);
         System.out.println("Employee Age : "+this.age);
         System.out.println("Employee Address : "+this.address);
         System.out.println("Employee Salary : "+this.getSalary());
     }
}
