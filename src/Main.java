import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws IOException {

        int numero1=0;
        int numero2=0;
        int opcion=0;
        int salir=0;
        int resultado=0;
        BufferedReader s= new BufferedReader((new InputStreamReader((System.in))));
        do {
            System.out.println("Introduce el primer numero");
            numero1=Integer.parseInt(s.readLine());

            System.out.println("Introduce el segundo numero");
            numero2=Integer.parseInt(s.readLine());

            System.out.println("Que operacion deseas hacer ?");
            System.out.println("1.-suma");
            System.out.println("2.- resta");
            System.out.println("3.- multiplicacion");
            System.out.println("4.- division");
            opcion=Integer.parseInt(s.readLine());

            switch (opcion){
                case 1:
                    resultado=numero1+numero2;
                    System.out.println("El resultado de la suma es: " +resultado);
                    System.out.println("Desea continuar con el programa ?");
                    System.out.println("1.- salir");
                    System.out.println("continuar - cualquier numero");
                    opcion=Integer.parseInt(s.readLine());
                    break;
                case 2:
                    resultado=numero1-numero2;
                    System.out.println("El resultado de la resta es: " +resultado);
                    System.out.println("Desea continuar con el programa ?");
                    System.out.println("1.- salir");
                    System.out.println("continuar - cualquier numero");
                    opcion=Integer.parseInt(s.readLine());
                    break;
                case 3:
                    resultado=numero1*numero2;
                    System.out.println("El resultado de la multiplicacion es: " +resultado);
                    System.out.println("Desea continuar con el programa ?");
                    System.out.println("1.- salir");
                    System.out.println("continuar - cualquier numero");
                    opcion=Integer.parseInt(s.readLine());
                    break;
                case 4:
                    resultado=numero1/numero2;
                    System.out.println("El resultado de la division es: " +resultado);
                    System.out.println("Desea continuar con el programa ?");
                    System.out.println("1.- salir");
                    System.out.println("continuar - cualquier numero");
                    opcion=Integer.parseInt(s.readLine());
                    break;

                case 5:
                    System.out.println("Gracias por utilizar el programa, hasta pronto ");
                    System.out.println("Desea continuar con el programa ?");
                    System.out.println("1.- salir");
                    System.out.println("continuar - cualquier numero");
                    opcion=Integer.parseInt(s.readLine());
                    break;
                default:
                    System.out.println("Opcion no encontrada");
                    break;
            }


        }while (salir==1);

    }
}