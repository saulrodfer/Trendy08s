package model.validations;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author saulrodfer
 */
public class UserDataValidations {
//Comprueba si el NIF introducido tiene menos de nueve letras si es asi devuelve que es incorrecto
//El bucle for comprueba los 8 primeros caracteres no son Numeros  

    public static boolean checkId(int typeDoc, String id) {
        if (typeDoc != 1) {
            return false;
        }
        if (id.length() != 9) {
            return false;
        }
        for (int i = 0; i < 8; i++) {
            if (!Character.isDigit(id.charAt(i))) {
                return false;
            }
        }
        char lastChar = id.charAt(8);
        if (!Character.isLetter(lastChar)) {
            return false;
        }
        int numericValue = Integer.parseInt(id.substring(0, 8));
        int remainder = numericValue % 23;
        char[] letters = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        if (Character.toUpperCase(lastChar) == letters[remainder]) {
            return true;
        } else {
            return false;
        }
    }
//El split sirve para dividir una cadena (date) en subcadenas
//El if sirve para que si lo que hemos puesto no tiene 3 elementos devuelva false
// El segundo if sirve para decir el rango de mes, dia y año no es correcto   

    public static boolean checkFormatDate(String date) {

        String[] separacion = date.split("/");
        if (separacion.length != 3) {
            return false;
        }
        int dia = Integer.parseInt(separacion[0]);
        int mes = Integer.parseInt(separacion[1]);
        int anyo = Integer.parseInt(separacion[2]);

        if (mes < 1 || mes > 12 || dia < 1 || dia > 31 || anyo < 1000) {
            return false;
        }
        return true;

    }

//Esto lo que hace es calcular la edad de la persona basandose en su fecha de nacimiento
    public static int calculateAge(String birthDate) {

        if (checkFormatDate(birthDate)) {
            LocalDate dob = LocalDate.parse(birthDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

            LocalDate currentDate = LocalDate.now();

            return Period.between(dob, currentDate).getYears();
        } else {
            return -1;
        }
    }

    //primero se llama la funcion creada para comprobar si son números
    //El primer if comprueba si no tiene 5 caracteres
    //El for comprueba si todo lo que hemos escrito no son caracteres devuelva false
    public static boolean checkPostalCode(String zip) {

        UserDataValidations.isNumeric(zip);
        if (zip.length() != 5) {
            return false;
        }
        for (int i = 0; i < zip.length(); i++) {
            if (!Character.isDigit(zip.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    //Comprueba si hay algun caracter que no es un número
    public static boolean isNumeric(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
//Comprueba si hay algun caracter que no es una letra

    public static boolean isAlphabetic(String str) {

        for (char caracteres : str.toCharArray()) {
            if (!Character.isLetter(caracteres)) {
                return false;
            }
        }
        return true;
    }

//creamos dos boolean y luego ponemos que sean true
//Hacemos que compruebe si la longitud del email es menor a 0 y luego compruebe si tiene @ y . si es así devolverá true
    public static boolean checkEmail(String email) {
        for (int i = 0; i < email.length(); i++) {

            for (int j = 0; j < email.length(); j++) {
                if (email.charAt(i) == '@' && email.charAt(j) == '.') {
                    return true;
                    /* Verifica la presencia de '@' y '.' en el correo electrónico */
                }
            }
        }
        return false;
    }

// Comprueba que el nombre no tenga de longitud como maximo 30
    public static boolean checkName(String name) {
        for (int i = 0; i < name.length(); i++) {
            if (!Character.isAlphabetic(name.charAt(i))) {
                return false;
            }
        }
        return name.length() <= 12;

    }

    public static boolean checkSurname(String surname) {
        for (int i = 0; i < surname.length(); i++) {
            if (!Character.isAlphabetic(surname.charAt(i))) {
                return false;
            }
        }
        return surname.length() <= 20;
    }

    public static boolean checkPassword(String password) {

        return password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$");
    }
}
