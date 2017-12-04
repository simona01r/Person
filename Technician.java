
package Empl_Extended;


public class Technician extends Employee {
    
 private int noOfDetect;   
 private double salary;
 private final double baseSal=10000;
   
    public Technician(){}
    public Technician(Gender gender, String name, int age,int noOfDetect) {
        super(gender, name, age);
        this.noOfDetect=noOfDetect;
     
    }
    @Override
    public double bonus() {
        double bonus=baseSal*noOfDetect;
        return bonus;
    }
    
        @Override
    public double salary() {
         salary=baseSal+bonus();
        return salary;
    }

    
    public int getNoOfDetect() {
        return noOfDetect;
    }

    public double getSalary() {
        return salary;
    }

    public void setNoOfDetect(int noOfDetect) {
        this.noOfDetect = noOfDetect;
    }

    @Override
    public String toString() {
       String info="Technician{" +super.toString()+ " noOfDetect=" + noOfDetect + ", salary=" + salary() + '}';
       return info;
    }


    

}
