package Empl_Extended;

public class Athleet extends Employee {

    private int noOfMedals;
    private double salary;
    private final double baseSal = 10000;

    public Athleet(){}
    public Athleet(Gender gender, String name, int age, int noOfMedals) {
        super(gender, name, age);
        this.noOfMedals = noOfMedals;
     
    }

    @Override
    public double bonus() {
        double bonus = baseSal * noOfMedals;
        return bonus;
    }

    public void setNoOfMedals(int noOfMedals) {
        this.noOfMedals = noOfMedals;
    }

    @Override
    public double salary() {
        salary=baseSal+bonus();
        return salary;
    }

    public int getNoOfMedals() {
        return noOfMedals;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        String info = "Athleet{" + super.toString() + " noOfMedals=" + noOfMedals + ", salary=" + salary() + '}';
        return info;
    }

}
