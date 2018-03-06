package com.bootcamp.martinez.patricio.BootCampJavaDay0303.validations;

import java.security.InvalidParameterException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Utilidad {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static int obtenerEnteroPositivo() {
        int valor = 0;

        boolean error;

        do {
            try {
                valor = SCANNER.nextInt();

                if (valor < 0) {
                    throw new InputMismatchException();
                }
                error = false;
            } catch (InputMismatchException ex) {
                System.out.println("Ingrese un entero positivo:");
                error = true;
            } finally {
                SCANNER.nextLine();
            }
        } while (error);

        return valor;
    }

    public static int obtenerEntero() {
        int valor = 0;

        boolean error;

        do {
            try {
                valor = SCANNER.nextInt();

                error = false;
            } catch (InputMismatchException ex) {
                System.out.println("Ingrese un entero:");
                error = true;
            } finally {
                SCANNER.nextLine();
            }
        } while (error);

        return valor;
    }

    public static double obtenerDecimal() {
        double valor = 0;

        boolean error;

        do {
            try {
                valor = SCANNER.nextDouble();
                error = false;
            } catch (InputMismatchException ex) {
                System.out.println("Ingrese un decimal:");
                error = true;
            } finally {
                SCANNER.nextLine();
            }
        } while (error);

        return valor;
    }

    public static String obtenerCadenaDeCaracteres() {
        return SCANNER.nextLine();
    }
    
    
    public static String obtenerCadenaDeCaracteresSinDigitos() {
        String valor = null;

        boolean error;

        do {
            try {
                valor = SCANNER.nextLine();

                if (valor.matches(".*\\d+.*")) {
                    throw new InvalidParameterException();
                }
                error = false;
            } catch (InvalidParameterException ex) {
                System.out.println("La cadena de caracteres no debe contener números");
                error = true;
            }
        } while (error);

        return valor;
    }

    public static String validarExtensionArchivo(String extension) {
        String valor = null;

        boolean error;

        do {
            try {
                valor = SCANNER.nextLine();

                if (!valor.substring(valor.length() - 3).equals(extension)) {
                    throw new InvalidParameterException();
                }
                error = false;
            } catch (InvalidParameterException ex) {
                System.out.println("El arhivo no tiene la extension requerida: " + extension);
                error = true;
            }
        } while (error);

        return valor;
    }

}
