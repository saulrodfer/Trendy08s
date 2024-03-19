/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.console;

import model.validations.UserDataValidations;
import java.util.Scanner;

/**
 *
 * @author saulrodfer
 */
public class main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        sc.useDelimiter("\n");
        int opcion = 0;

        do {
            System.out.println("1.- NIF\n");
            System.out.println("2.- Date\n");
            System.out.println("3.- Calculate Age\n");
            System.out.println("4.- Postal Code\n");
            System.out.println("5.- Numeric\n");
            System.out.println("6.- Alphabetic\n");
            System.out.println("7.- Email\n");
            System.out.println("8.- Name\n");
            System.out.println("9.- Terminar \n");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    NIF();
                    break;
                case 2:
                    Date();
                    break;
                case 3:
                    CalculateAge();
                    break;
                case 4:
                    PostalCode();
                    break;
                case 5:
                    Numeric();
                    break;
                case 6:
                    Alphabetic();
                    break;
                case 7:
                    Email();
                    break;
                case 8:
                    Name();
                    break;
                case 9:
                    break;
                default:
                    System.out.println("");
            }

        } while (opcion != 9);

    }

    public static void NIF() {
        int typeDoc = 1;
        System.out.println("Introduzca su NIF: ");
        String id = sc.next();
        UserDataValidations.checkId(typeDoc, id);
        if (UserDataValidations.checkId(typeDoc, id)) {
            System.out.println("El NIF introducido es válido.");
        } else {
            System.out.println("El NIF introducido no es válido.");
        }
    }

    public static void Date() {
        System.out.println("Introduzca una fecha en formato (dd/mm/aaaa): "); 
        String date = sc.next();
        UserDataValidations.checkFormatDate(date);
           if (UserDataValidations.checkFormatDate(date)) {
            System.out.println("La fecha introducida es correcta.");
        } else {
            System.out.println("El fecha introducida no es correcta.");
        }
    }
    
    public static void CalculateAge() {
    System.out.println("Introduzca tu fecha de nacimiento en formato (dd/mm/aaaa): ");
    String birthDate = sc.next();
    UserDataValidations.calculateAge(birthDate);
    int anyos = UserDataValidations.calculateAge(birthDate);
        System.out.println("Tu edad es: " + anyos);
    }   
    public static void PostalCode() {
     System.out.println("Introduzca tu Código Postal: "); 
     String zip = sc.next();
        UserDataValidations.checkPostalCode(zip);
           if (UserDataValidations.checkPostalCode(zip)) {
            System.out.println("El CP introducido es correcto.");
        } else {
            System.out.println("El fecha introducido no es correcto.");
        }
    }
    public static void Numeric() {
        String str = sc.next();
        UserDataValidations.isNumeric(str);
           if (UserDataValidations.isNumeric(str)) {
            System.out.println("Los números introducidos son correctos");
        } else {
            System.out.println("Los números introducidos no son correctos");
        }
    }

    public static void Alphabetic() {
        String str = sc.next();
        UserDataValidations.isAlphabetic(str);
           if (UserDataValidations.isAlphabetic(str)) {
            System.out.println("Los números introducidos son correctos");
        } else {
            System.out.println("Los números introducidos no son correctos");
        }
    }

    public static void Email() {
        System.out.println("Introduzca tu email(@ y .com,.es etc): "); 
        String email = sc.next();
        UserDataValidations.checkEmail(email);
           if (UserDataValidations.checkEmail(email)) {
            System.out.println("El email introducido es correcto");
        } else {
            System.out.println("El email introducido no es correcto");
        }
    }
    public static void Name() {
     System.out.println("Introduzca tu nombre "); 
        String name = sc.next();
        UserDataValidations.checkName(name);
           if (UserDataValidations.checkEmail(name)) {
            System.out.println("El nombre introducido es correcto");
        } else {
            System.out.println("El nombre introducido no es correcto");
        }
    }
}
