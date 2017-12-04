/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empl_Extended;


import java.util.Scanner;

/**
 *
 * @author User
 */
public class NewClass {
    public static void main(String[] args) throws ClassNotFoundException {
        Employee e= new Technician(Gender.MR, "name", 10, 20);
        
         if (Class.forName("Empl." +new Scanner(System.in).nextLine()).isInstance(e))
             System.out.println("Youe are a Tecnincan");
         else
              System.out.println("Youe are nota Tecnincan");
       
    }
}
