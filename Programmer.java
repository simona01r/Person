
package Empl_Extended;

public class Programmer extends Employee {
    
    private int noOfProjects;
    private double salary;
      private final double baseSal = 10000;
    public Programmer(){}
    
    public Programmer(Gender gender, String name, int age,int noOfProjects ) {
        super(gender, name, age);
        this.noOfProjects=noOfProjects;
     
    }
    
  @Override
    public double bonus() {
        double bonus=baseSal*noOfProjects;
        return bonus;
    }
    
        @Override
    public double salary() {
        salary=baseSal+bonus();
        return salary;
    }

    public int getNoOfProjects() {
        return noOfProjects;
    }

    public double getSalary() {
        return salary;
    }

    public void setNoOfProjects(int noOfProjects) {
        this.noOfProjects = noOfProjects;
    }

    @Override
    public String toString() {
        String info="Programmer{" +super.toString()+" noOfProjects=" + noOfProjects + ", salary=" + salary() + '}';
        return info;
    }


  
    
}
