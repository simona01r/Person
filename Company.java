package Empl_Extended;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Company {

    static boolean loop = true;

    static private ArrayList<Employee> myEmpl = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void addEmpl() {

        myEmpl.add(new Technician(Gender.MISS, "Diana", 45, 15));
        myEmpl.add(new Technician(Gender.MRS, "Andrew", 37, 10));
        myEmpl.add(new Programmer(Gender.MRS, "Simona", 40, 9));
        myEmpl.add(new Programmer(Gender.MR, "Gunnar", 29, 8));
        myEmpl.add(new Athleet(Gender.MR, "Gunnar", 53, 3));
        myEmpl.add(new Athleet(Gender.MR, "Steve", 38, 7));

        showEmpl();
    }

    public static void addByKeyboard() {

        while (loop) {
//                   cu FORE nu iese EVER din for...deci nu folosim
//            for (Employee e : myEmpl) {
                Employee e = null;
                System.out.println("Choose type of Employee ={technician, athleet, programmer}");
                String staff = sc.nextLine();
                
//                  if (e instanceof Technician) {
                if (staff.equalsIgnoreCase("Technician")) {
               e = new Technician();
//                    if (e instanceof Technician) {
                        detailsByKeyboard(e);
                        System.out.println("Insert the NoOfDetectons:");
                        ((Technician) e).setNoOfDetect(sc.nextInt());
                        myEmpl.add(new Technician(e.getGender(), e.getName(), e.getAge(), ((Technician) e).getNoOfDetect()));
                        showEmpl();
//                    }
                }
//                  if (e instanceof Athleet) {
                if (staff.equalsIgnoreCase("Athleet")) {
//                    if (e instanceof Athleet) {
                        e = new Athleet();
                        detailsByKeyboard(e);
                        System.out.println("Insert the NoOfMedals:");
                        ((Athleet) e).setNoOfMedals(sc.nextInt());
                        myEmpl.add(new Athleet(e.getGender(), e.getName(), e.getAge(), ((Athleet) e).getNoOfMedals()));
                        showEmpl();
//                    }
                }
//                    if (e instanceof Programmer) {
                if (staff.equalsIgnoreCase("Programmer")) {
//                    if (e instanceof Athleet) {
                        e = new Programmer();
                        detailsByKeyboard(e);
                        System.out.println("Insert the NoOfMedals:");
                        ((Programmer) e).setNoOfProjects(sc.nextInt());
                        
                        myEmpl.add(new Programmer(e.getGender(), e.getName(), e.getAge(), ((Programmer) e).getNoOfProjects()));
                        showEmpl();
//                    }
                }
sc.nextLine();
                System.out.println("Do u want one more item?Y/N?");
                String ans = sc.nextLine();

                if (ans.equalsIgnoreCase("n")) {
                    System.out.println("Thanks!");
                    loop=false;
                    break;
                }
        }
    }


    public static void detailsByKeyboard(Employee e) {
        System.out.println("Insert a gender = {mrs,mr,miss}");
        e.setGender(Gender.valueOf(sc.nextLine().toUpperCase()));

        System.out.println("Insert a name:");
        e.setName(sc.nextLine());

        System.out.println("Insert the age:");
        e.setAge(sc.nextInt());

        sc.nextLine();
    }

    public static void showEmpl() {

for (Employee employee : myEmpl) {
        System.out.println(employee);    
        }

//              OR(with lamda)
//        myEmpl.forEach(System.out::println);
        
    }

    public static void deleteById() {
        Employee temp = null;

        while (true) {
            System.out.println("Insert the id:");
            int id = sc.nextInt();
            sc.nextLine();

            for (Employee c : myEmpl) {
                if (c.getIdEmpl() == id) {
                    temp = c;
                }
            }
            myEmpl.remove(temp);
            showEmpl();

            System.out.println("Another Id? Y/N?");
            String ans = sc.nextLine();

            if (ans.equalsIgnoreCase("n")) {
                System.out.println("Thanks!");
                break;
            }
        }
    }

//              Case 5 cu ArrayList!!!!!!!!!!!!
    public static void deleteBy_Gender_Name() {

        ArrayList<Employee> myTemp = new ArrayList<>();

        while (true) {
            System.out.println("Insert a gender:");
            String titlu = sc.nextLine();

            System.out.println("Insert a name:");
            String nume = sc.nextLine();

            for (Employee c : myEmpl) {
                if (c.getGender().equals(Gender.valueOf(titlu.toUpperCase())) && c.getName().equalsIgnoreCase(nume)) {
                    myTemp.add(c);
                }
            }

            myEmpl.removeAll(myTemp);
            showEmpl();

            System.out.println("\nAnother Gender/Name? Y/N?");
            String ans = sc.nextLine();

            if (ans.equalsIgnoreCase("n")) {
                System.out.println("Thanks!");
                break;
            }
        }
    }

//      Case 6 cu Iterator!!!!!
    public static void deleteByGender() {

        Employee temp = null;

        while (true) {
            System.out.println("Insert gender ={mrs,miss,mr}");
            String gender = sc.nextLine();

            Iterator<Employee> it = myEmpl.iterator();
            while (it.hasNext()) {
                temp = it.next();
                if (temp.getGender().equals(Gender.valueOf(gender.toUpperCase()))) {
//                    System.out.println("if");
                    it.remove();
                    showEmpl();
                }
            }

            System.out.println("Delete by OTHER gender? Y/N");
            String answ = sc.nextLine();
            if (answ.equalsIgnoreCase("n")) {
                System.out.println("Tanks!");
                break;

            }
        }
    }

    public static void findById() {
        Employee temp = null;

        while (true) {
            System.out.println("Insert the id:");
            int id = sc.nextInt();
            sc.nextLine();

            for (Employee c : myEmpl) {
                if (c.getIdEmpl() == id) {
                    temp = c;
                }
            }

            System.out.println(temp);

            System.out.println("Another Id? Y/N?");
            String ans = sc.nextLine();

            if (ans.equalsIgnoreCase("n")) {
                System.out.println("Thanks!");
                break;
            }
        }
    }

    public static void findBy_Gender() {
        ArrayList<Employee> myTemp = new ArrayList<>();

        while (true) {
            System.out.println("Insert a gender:");
            String titlu = sc.nextLine();

            for (Employee c : myEmpl) {
                if (c.getGender().equals(Gender.valueOf(titlu.toUpperCase()))) {
                    myTemp.add(c);
                }
            }

            System.out.println(myTemp);

            System.out.println("\nAnother Title/Name? Y/N?");
            String ans = sc.nextLine();

            if (ans.equalsIgnoreCase("n")) {
                System.out.println("Thanks!");
                break;
            }
        }
    }

}
