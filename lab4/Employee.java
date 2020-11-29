package lab4;

class Person
{
    private String name;

    public Person()
    {
        name = "No name yet.";
    }
    public Person(String n)
    {
        name = n;
    }
    public void setName(String newName)
    {
        name = newName;
    }
    public String getName()
    {
        return name;
    }
    public void print()
    {
        System.out.println("Name: " + name);
    }
    public boolean equals(Object p)
    {
        return name.equals(this.name);
    }


}
 class Employee extends Person
{
    private double  salary;
    private int year;
    private String NIN;

    public Employee ()
    {
        super ();
        salary = 0; //Indicating no number yet
        year = 0; //Indicating no number yet
        NIN ="";
    }
    public Employee (String n, int initialSalary)
    {
        super (n);
        salary = initialSalary;
    }
    public void reset (String newName)
    {
        setName (newName);
    }

    public double getSalary ()
    {
        return  salary;
    }
    public int getyear ()
    {
        return  year;
    }
    public String getnin ()
    {
        return  NIN;
    }

    public void setSalary (double  newsalary)
    {
        salary = newsalary;
    }
    public void setyear (int  newyear)
    {
        year = newyear;
    }
    public void setString (String  newsnin)
    {
        NIN = newsnin;
    }
    public void writeOutput ()
    {
        System.out.println ("Name: " + getName ());
        System.out.println ("Salary: " + salary);
        System.out.println ("Year: " + year);
        System.out.println ("National insurance number : " + NIN);
    }


    public boolean equals (Employee records)
    {
        return this.equals (records) &&
                (this.salary == records.salary);
    }
}
class Mainpgm
{
    public static void main (String [] args)
    {
        Employee s = new Employee();
        s.setName ("Subarna Basnet");
        s.setSalary (5555);
        s.setyear(2020);
        s.setString("BCA2020");
        s.writeOutput ();
    }
}