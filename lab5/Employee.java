package lab5;

public abstract  class Employee {
    private  String name;
    private int perhour;
     Employee(String name,int perhour){
         this.name = name;
         this.perhour = perhour;
         System.out.println("Employee Details");

     }
    public abstract int CalSal();

    public String getEmpName(){
        return name;
    }
    public int getPerhour() {
        return perhour;
    }
}

 class Contractor extends Employee{

    private int workhours;
    public Contractor(String name, int perhour, int workhours){
        super(name, perhour);
        this.workhours = workhours;
        System.out.println("Contractor");
    }
     public int CalSal() {
         return getPerhour() * workhours;
     }
 }

class FulltimeEmp extends Employee{

    public FulltimeEmp(String name, int perhour){
        super(name,perhour);
        System.out.println("Full Time");
    }
    public int CalSal(){
        return getPerhour()* 8;
    }
}


class Main{
    public static void main(String[] args){
        Employee data = new Contractor("subarna",1000,2);
        System.out.println("Name: " +data.getEmpName());
        System.out.println("Salary: " +data.CalSal());
        System.out.println("..........................");
        Employee data2 = new FulltimeEmp("basnet",1000);
        System.out.println("Name: " +data2.getEmpName());
        System.out.println("Salary: " +data2.CalSal());
        System.out.println("..........................");
    }
}