/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4p1_howardpadgett;

import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Lab4P1_HowardPadgett {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] setA = new char[100];
        char[] setB = new char[100];
        int sizeA = 0;
        int sizeB = 0;

        System.out.print("Ingrese los elementos del conjunto A separados por comas: ");
        String inputA = sc.nextLine();
        for (String elem : inputA.split(",")) {
            setA[sizeA++] = elem.trim().charAt(0);
        }

        System.out.print("Ingrese los elementos del conjunto B separados por comas: ");
        String inputB = sc.nextLine();
        for (String elem : inputB.split(",")) {
            setB[sizeB++] = elem.trim().charAt(0);
        }

        char[] union = new char[200];
        int sizeUnion = 0;

        for (int i = 0; i < sizeA; i++) {
            if (!contains(union, sizeUnion, setA[i])) {
                union[sizeUnion++] = setA[i];
            }
        }

        for (int i = 0; i < sizeB; i++) {
            if (!contains(union, sizeUnion, setB[i])) {
                union[sizeUnion++] = setB[i];
            }
        }

        char[] intersection = new char[100];
        int sizeIntersection = 0;

        for (int i = 0; i < sizeA; i++) {
            if (contains(setB, sizeB, setA[i]) && !contains(intersection, sizeIntersection, setA[i])) {
                intersection[sizeIntersection++] = setA[i];
            }
        }

        System.out.print("La unión de los conjuntos A y B es: { ");
        for (int i = 0; i < sizeUnion; i++) {
            System.out.print(union[i] + " ");
        }
        System.out.println("}");

        System.out.print("La intersección de los conjuntos A y B es: { ");
        for (int i = 0; i < sizeIntersection; i++) {
            System.out.print(intersection[i] + " ");
        }
        System.out.println("}");

        // Validar contraseña
        System.out.print("Ingrese su contraseña: ");
        String password = sc.nextLine();
        if (validarPassword(password)) {
            System.out.println("La contraseña es aceptable");
        } else {
            System.out.println("La contraseña no es aceptable");
        }
    }

    public static boolean contains(char[] arr, int size, char elem) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == elem) {
                return true;
            }
        }
        return false;
    }

    public static boolean validarPassword(String password) {
        if (password.length() < 8) {
            return false;
        }

        boolean tieneMayuscula = false;
        boolean tieneMinuscula = false;
        boolean tieneNumero = false;
        boolean tieneCaracterEspecial = false;

        for (int i = 0; i < password.length(); i++) {
            
        }
        int i = 0;
            char c = password.charAt(i);

            if (Character.isUpperCase(c)) {
                tieneMayuscula = true;
            } else if (Character.isLowerCase(c)) {
                tieneMinuscula = true;
            } else if (Character.isDigit(c)) {
                tieneNumero = true;
            } else{
                
            }
        return false;
      
       } 
    }


        
       
        // TODO code application logic here
    
    

