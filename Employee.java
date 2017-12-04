package Empl_Extended;

public abstract class Employee {

    private Gender gender;
    private String name;
    private int age;
    private int idEmpl;
    private static int idGenerator = 100;

    public Employee(){}
    public Employee(Gender gender, String name, int age) {
        this.gender = gender;
        this.name = name;
        this.age = age;
        this.idEmpl = idGenerator;
        idGenerator++;

    }
    
public abstract double bonus();

public abstract double salary();

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setIdEmpl(int idEmpl) {
        this.idEmpl = idEmpl;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }
    
    public int getIdEmpl(){
        return idEmpl;
    }
     @Override
    public String toString(){
        return "["+idEmpl+","+gender+" " +name+", age: "+ age+"]";
    }
}
