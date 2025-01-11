package oops;

public class GetterSetter {
    
    

    private String name ;
    private int age ;
    private int  salary ;

    public GetterSetter(String name , int age ,int salary){
        this.name = name ;
        this.age = age;
        this.salary = salary ;

    }

     String EmployeeDetails(){
       return "EmployeesDetails : name : "+name + " age : "+age +" salary : "+salary;
    }

    public String getname(){
        return name ;
    }
    public void setname(String name){
        this.name= name ;   
    }


    public int getage(){
        return age ;
    }
    public void setage(int age){
        this.age=age ;
    }


    public int getsalary(){
        return salary ;
    }
    public void setsalary(int salary){
        this.salary = salary ;
    }

    public static void main(String[] args) {

        GetterSetter emp = new GetterSetter(" nikhil ", 22 , 50000) ;
        System.out.println(emp.EmployeeDetails());
        emp.setsalary(1234562);
        System.out.println(emp.salary);

      }
 
}

