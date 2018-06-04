package ClasesyObjetos;

import javax.swing.*;

public class Operacion {
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;

    //Metodos

    //Metodo para pedirle al usuario que nos digite dos numeros
    public void leerNumeros(){
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
    }

    //Metodo para sumar los dos números
    public void sumar(){
        suma = numero1 + numero2;
    }

    //Metodo que muestra el resultado


    public void mostrarResultado () {
        System.out.println("La suma es: "+suma);
    }
}
