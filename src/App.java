import java.util.ArrayList;
import java.util.Scanner;

public class App {

  private static Scanner sc = new Scanner(System.in);
  
  public static void main(String[] args) throws Exception {
    
    ArrayList<Titular> titulares = new ArrayList<>();
    ArrayList<Suplente> suplentes = new ArrayList<>();

    mostrarMenu();
    int opcion = sc.nextInt();

    switch (opcion) {
      case 1:
        ingresarTitular(titulares);
        break;
      case 2:
        ingresarSuplente(suplentes);
        break;
      case 3:
        calcularPlus(titulares, suplentes);
        break;
      case 4:
        mostrarDocentes(titulares, suplentes);
        break;
    }


  }

  private static void mostrarDocentes(ArrayList<Titular> titulares, ArrayList<Suplente> suplentes) {

    titulares.toString();

  }

  private static void calcularPlus(ArrayList<Titular> titulares, ArrayList<Suplente> suplentes) {
    titulares.forEach((t) -> t.calcularPlus());
    suplentes.forEach((s) -> s.calcularPlus());
  }

  private static void ingresarSuplente(ArrayList<Suplente> suplentes) {

    System.out.println("\n-- Ingresar Datos ---------------");
    System.out.print("Legajo: ");
    int numeroLegajo = sc.nextInt();
    System.out.print("Nombre: ");
    String nombre = sc.next();
    System.out.print("Edad: ");
    int edad = sc.nextInt();
    System.out.print("Salario: ");
    double salario = sc.nextDouble();
    System.out.print("Zona: ");
    String zona = sc.next();
    System.out.println("---------------------------------");

    suplentes.add(new Suplente(numeroLegajo, nombre, edad, salario, zona));

  }

  private static void ingresarTitular(ArrayList<Titular> titulares) {

    System.out.println("\n-- Ingresar Datos ---------------");
    System.out.print("Legajo: ");
    int numeroLegajo = sc.nextInt();
    System.out.print("Nombre: ");
    String nombre = sc.next();
    System.out.print("Edad: ");
    int edad = sc.nextInt();
    System.out.print("Salario: ");
    double salario = sc.nextDouble();
    System.out.print("Antiguedad: ");
    int antiguedad = sc.nextInt();
    System.out.println("---------------------------------");
      
    titulares.add(new Titular(numeroLegajo, nombre, edad, salario, antiguedad));

  }

  public static void mostrarMenu() {
    
    System.out.println("\n-- Gestion Docente --------------");
    System.out.println("1) - Agregar Nuevo Titular");
    System.out.println("2) - Agregar Nuevo Suplente");
    System.out.println("3) - Mostrar Docentes");
    System.out.println("4) - Calcular Plus");
    System.out.println("---------------------------------");
    System.out.print("> ");

  }

}
