
public class Calculadora{
    //Funcion que suma dos numeros enteros
    public static int sumaEnteros (int num1, int num2){
        return num1+num2;
    } 

    //Funcion que reste dos numeros enteros
    public static int restaEnteros (int num1, int num2){
        return num1-num2;
    }

    //Funcion que multiplica dos numeros
    public static int multiplicacionEnteros (int num1, int num2){
        return num1*num2;
    }

    //Funcion que diide dos numeros
    public static int divisionEneteros (int num1, int num2){
        if (!esCero(num2))
         {
            return num1/num2;
         }
         else 
         {
             return 0;
         }
    }

    //funcion espacial para saber si un numero es cero
    public static boolean esCero (int num1){
        if (num1==0)
            return true;
        else    
            return false;
    }

}
