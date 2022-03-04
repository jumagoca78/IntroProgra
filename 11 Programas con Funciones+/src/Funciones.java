//
// Funciones
// by Gerardo Ayala
// Universidad de las Americas Puebla
// UDLAP
///////////////////////////////////////////////////


import java.util.Scanner;

public class Funciones
{

    // Funcion que no tiene parametros de entrada ()
    // y no regresa nada, regresa void
    public static void showMyData()
    {
        System.out.println("******************************");
        System.out.println("Software by ACME              ");
        System.out.println("******************************");
    }//end showMyData


    // Funcion que  tiene parametros de entrada (numberOfBlankSpaces)
    // y no regresa nada, regresa void
    public static void blankSpaces(int numberOfBlankSpaces)
    {
        int contador;
        //
        contador = 1;
        while(contador <= numberOfBlankSpaces)
        {
            System.out.print(" ");
            contador = contador + 1;
        }//end while
    }//end blankSpaces


    // Funcion que  no tiene parametros de entrada ()
    // y  regresa un valor, regresa un int
    public static int getInt()
    {
        Scanner keyboard;
        int theValue;
        //
        keyboard = new Scanner(System.in);
        theValue = keyboard.nextInt();
        keyboard.close();
        return theValue;
    }//end getInt


    // Funcion que  tiene parametros de entrada (farenheit)
    // y  regresa un valor, regresa un int
    public static int convertFarenheitToCelsius(int farenheit)
    {
        int celsius;
        //
        celsius = (farenheit - 32) * 5 / 9;
        return celsius;
    }//end convertFarenheitToCelsius


    public static void main(String[] args)
    {
        int temperatureFarenheit;
        int temperatureCelsius;
        //
        // Invocamos la funcion showMyData.
        // Sin parametros. No regresa nada.
        showMyData();
        System.out.print("hola");

        // Invocamos la funcion blankSpaces.
        // Con un parametro: 10. No regresa nada.
        blankSpaces(10);
        System.out.println("@@@@");
        System.out.print("Indique la temperatura en Farenheit: ");

        // Invocamos la funcion getInt.
        // Sin parametros.  Regresa el valor para temperatureFarenheit.
        temperatureFarenheit = getInt();

        // Invocamos la funcion convertFarenheitToCelsius.
        // Con un parametro: temperatureFarenheit.
        // Regresa el valor para temperatureCelsius.
        temperatureCelsius = convertFarenheitToCelsius(temperatureFarenheit);
        //
        System.out.print("La temperatura en celsius es: ");
        System.out.println(temperatureCelsius);

    }//end main

}//end class