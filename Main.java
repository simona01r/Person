package Empl_Extended;

public class Main {

    static boolean loop = true;
    static Company comp = new Company();

   
    
    public static void main(String[] args) {
//      comp.addEmpl();
//      Company.addByKeyboard();
//        
        while (loop) {
            switchCase(opt());
        }
    }

    public static void switchCase(int option) {

        switch (option) {
            case 1:
                comp.addEmpl();
                break;
            case 2:
                comp.addByKeyboard();
                break;
            case 3:
                comp.showEmpl();
                break;
            case 4:
                comp.deleteById();
                break;
            case 5:
                comp.deleteBy_Gender_Name();
                break;
            case 6:
                comp.deleteByGender();
                break;
            case 7:
                comp.findById();
                break;
            case 8:
                comp.findBy_Gender();
                break;
//            case 100:
//                Customer c1 = new Customer(Gender.MRS, "Maria", 65);
//                comp.addParametru(c1);
//                break;

            case 9:
                System.out.println("Thank you!");
                loop = false;
                break;
            default:
                System.out.println("No option/ Try again!");
        }
    }

    public static int opt() {
        System.out.println("\n----------------------");
        System.out.println("1.Add  created Employee");
        System.out.println("2.Add by Keyboard");
        System.out.println("3.Show Customers:");
        System.out.println("4.Delete by Id");
        System.out.println("5.Delete by Gender and Name:");
        System.out.println("6.Delete by Gender");
        System.out.println("7.Find by Id");
        System.out.println("8.Find by Gender");
//        System.out.println("100.TEST Method Add cu Parametru ");
        System.out.println("9.Terminate");

        System.out.println("Choose an option");
        int option = Company.sc.nextInt();
        Company.sc.nextLine();
        return option;
    }
}
