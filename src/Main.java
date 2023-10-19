import javax.swing.*;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Damos la bienvenida al usuario
        System.out.println("Bienvenido al Calculador Iva");

        //Inicializamos scanner y otras variables
        Scanner scan = new Scanner(System.in);
        boolean opcionValida = false;
        String opcion = " ";
        double precioProducto, iva;
        double ivaCalculado = 0;
        double resultado = 0;
        boolean salida = false;

        while (!salida){
            //Mostramos las opciones disponibles al usuario
            System.out.println("S) SUMA  R) RESTA  M) MULTIPLICACIÓN  D)DIVISIÓN  Q) SALIDA");

            //validamos que la opcion ingresada

            opcion = scan.next().toUpperCase();
            if (opcion.equals("S") || opcion.equals("R") || opcion.equals("M") || opcion.equals("D") || opcion.equals("Q")){
                opcionValida = true;
            }


            if(opcion.equals("Q")){
                System.out.println("Adios! Vuelve pronto! 😀");
                salida = true;
            } else {
                //Pedimos las variables que se van a operar
                System.out.println("Ingrese el precio del producto: ");
                precioProducto = scan.nextDouble();
                System.out.println("Ingrese el IVA del producto con el formato (0,21): ");
                iva = scan.nextDouble();

                //Calculamos el iva
                ivaCalculado = (precioProducto * iva);
                switch (opcion) {
                    //FUNCION SUMAR IVA
                    case "S" -> {
                        System.out.println("Operación suma");
                        resultado = precioProducto + ivaCalculado;
                        System.out.println(precioProducto + " + " + ivaCalculado + " = " + resultado);
                    }
                    //FUNCION RESTAR IVA
                    case "R" -> {
                        System.out.println("Operación resta");
                        resultado = precioProducto - ivaCalculado;
                        System.out.println(precioProducto + " - " + ivaCalculado + " = " + resultado);
                    }
                    //FUNCION MULTIPLICAR IVA
                    case "M" -> {
                        System.out.println("Operación multiplicación");
                        resultado = precioProducto * ivaCalculado;
                        System.out.println(precioProducto + " * " + ivaCalculado + " = " + resultado);
                    }
                    //FUNCION DIVISION IVA
                    case "D" -> {
                        System.out.println("Operación división");
                        if (ivaCalculado != 0) {
                            resultado = precioProducto / ivaCalculado;
                            System.out.println(precioProducto + " / " + ivaCalculado + " = " + resultado);
                        } else {
                            System.out.println("La división por cero no es posible");
                        }
                    }default -> {
                        System.out.println("Error! Opción invalida");
                        System.out.println("Intenta nuevamente");
                    }
                }
            }

        }
    }
}