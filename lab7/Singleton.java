package lab7;
//The purpose of the singleton class is to control object creation,
// limiting the number of objects to only one.
// The singleton allows only one entry point to create the new instance of the class.
//Singletons are often useful where we have to control the resources,
// such as database connections or sockets.
public class Singleton {
    private static Singleton dbObject;

    private Singleton() {
    }

    public static Singleton getInstance() {

        // create object if it's not already created
        if(dbObject == null) {
            dbObject = new Singleton();
        }

        // returns the singleton object
        return dbObject;
    }

    public void getConnection() {
        System.out.println("You are now connected to the database.");
    }
}

class MainPrograms {
    public static void main(String[] args) {
        Singleton db1;

        // refers to the only object of Database
        db1= Singleton.getInstance();

        db1.getConnection();
    }
}