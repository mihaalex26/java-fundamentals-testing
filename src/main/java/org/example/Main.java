package org.example;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int suma = calculator.suma(2,3);
        System.out.println("Suma este: " + suma);

        int scadere = calculator.scadere(5,3);
        System.out.println("Diferenta este: " + scadere);

        int produs = calculator.inmultire(4,6);
        System.out.println("Produsul este: " + produs);

        double diferenta = calculator.impartire(12,3);
        System.out.println("Diferenta este: " + diferenta);
    }
}