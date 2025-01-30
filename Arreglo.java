package com.mycompany.arreglo;
import javax.swing.*;

public class Arreglo {
    public static void main(String[] args) {
        main operaciones = new main();
        double[][] numeros = new double[1][2];
        String[] opciones = {"Sumar", "Restar"};
        int opcion = JOptionPane.showOptionDialog(null, "Selecciona una operación:", "Calculadora", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
        numeros[0][0] = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el primer número:"));
        numeros[0][1] = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el segundo número:"));
        double resultado;

        switch (opcion) {
            case 0:
                resultado = operaciones.sumar(numeros, 0);
                JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                break;
            case 1:
                resultado = operaciones.restar(numeros, 0);
                JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción inválida.");
        }
    }
}
