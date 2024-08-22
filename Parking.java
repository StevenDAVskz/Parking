import java.util.*;
class Parking{
    static Scanner leer = new Scanner(System.in);

public static void main(String[] args) {
    

    System.out.println("Hola bienvenido al parking de unicolombo");
    System.out.println("Que deseas hacer?");
    opInicio();
    int opRespuesta = leer.nextInt();
    Chose(opRespuesta);




}

public static void opInicio(){
    System.out.println("1.Ingresar al parking");
    System.out.println("2.Consultar tu carnet");
    System.out.println("3.Buscar espacio");
    System.out.println("4.Reservar");
    System.out.println("5.salir");


}

public static void Chose(int opRespuesta){
    switch (opRespuesta) {
        case 1:
            System.out.println("Igresando");
            ingresando();
            break;
        case 2:
        System.out.println("Consultando");
            break;
        case 3:
        System.out.println("Buscando");
            break;
        case 4:
        System.out.println("Reservando");
            break;
        case 5:
        System.out.println("Saliendo");
            break;
        default:
            throw new AssertionError();
    }
}

public static void ingresando(){
    System.out.println("Ingrese el ID para registrar");
    int IdNewUser = leer.nextInt();
    System.out.println("Ingrese Su nombre");
    String NombreUser = leer.next();
    System.out.println("Ingrese su apellido");
    String ApellidoUser = leer.next();
    System.out.println("Ingrese su segundo apellido");
    String Apellido2User = leer.next();
    System.out.println("Ingrese su email");
    String EmailUser = leer.next();
    System.out.println("Ingrese su rol");
    System.out.println("Funcionario\n Normal\n Invitado" );
    String RolUser = leer.next();
    System.out.println("Ingrese su telefono");
    int TelUsuer = leer.nextInt();
}

}