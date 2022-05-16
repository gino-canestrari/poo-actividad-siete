import java.util.ArrayList;
import java.util.Scanner;

public class App {

  private static Scanner sc = new Scanner(System.in);
  
  public static void main(String[] args) throws Exception {
    
    ArrayList<Titular> titulares = new ArrayList<>();
    ArrayList<Suplente> suplentes = new ArrayList<>();

    int opcion;
    do {
      
      mostrarMenu();
      opcion = sc.nextInt();
  
      switch (opcion) {
        case 1:
          Titular titular = obtenerTitular();
          titular.calcularPlus();
          titulares.add(titular);
          break;
        case 2:
          Suplente suplente = obtenerSuplente();
          suplente.calcularPlus();
          suplentes.add(suplente);
          break;
        case 3:
          mostrarDocentes(titulares, suplentes);
          break;
        case 4:
          titulares.forEach((t) -> t.calcularPlus());
          suplentes.forEach((s) -> s.calcularPlus());
          break;
      }

    } while (opcion != 0);

  }

  private static void mostrarDocentes(ArrayList<Titular> titulares, ArrayList<Suplente> suplentes) {

    for (Titular t : titulares) {
      System.out.println("\n-- Titular ----------------------");
      System.out.println("Legajo: " + t.getNumeroLegajo());
      System.out.println("Nombre: " + t.getNombre());
      System.out.println("Edad: " + t.getEdad());
      System.out.println("Salario: " + t.getSalario());
      System.out.println("Antiguedad: " + t.getAntiguedad());
      System.out.println("---------------------------------");
    }

    for (Suplente s : suplentes) {
      System.out.println("\n-- Suplente ---------------------");
      System.out.println("Legajo: " + s.getNumeroLegajo());
      System.out.println("Nombre: " + s.getNombre());
      System.out.println("Edad: " + s.getEdad());
      System.out.println("Salario: " + s.getSalario());
      System.out.println("Zona: " + s.getZona());
      System.out.println("---------------------------------");
    }

  }

  private static Suplente obtenerSuplente() {

    System.out.println("\n-- Ingresar Datos ---------------");
    System.out.print("Legajo: ");
    int numeroLegajo = sc.nextInt();
    sc.nextLine();
    System.out.print("Nombre: ");
    String nombre = sc.nextLine();
    System.out.print("Edad: ");
    int edad = sc.nextInt();
    System.out.print("Salario: ");
    double salario = sc.nextDouble();
    sc.nextLine();
    System.out.print("Zona: ");
    String zona = sc.nextLine();
    System.out.println("---------------------------------");

    return new Suplente(numeroLegajo, nombre, edad, salario, zona);

  }

  private static Titular obtenerTitular() {

    System.out.println("\n-- Ingresar Datos ---------------");
    System.out.print("Legajo: ");
    int numeroLegajo = sc.nextInt();
    sc.nextLine();
    System.out.print("Nombre: ");
    String nombre = sc.nextLine();
    System.out.print("Edad: ");
    int edad = sc.nextInt();
    System.out.print("Salario: ");
    double salario = sc.nextDouble();
    System.out.print("Antiguedad: ");
    int antiguedad = sc.nextInt();
    sc.nextLine();
    System.out.println("---------------------------------");
      
    return new Titular(numeroLegajo, nombre, edad, salario, antiguedad);

  }

  public static void mostrarMenu() {
    
    System.out.println("\n-- Gestion Docente --------------");
    System.out.println("1) - Agregar Nuevo Titular");
    System.out.println("2) - Agregar Nuevo Suplente");
    System.out.println("3) - Mostrar Docentes");
    System.out.println("0) - Salir");
    System.out.println("---------------------------------");
    System.out.print("> ");

  }

}
