abstract class Docente {
  
  final double PLUS_RURALIDAD = 15000;

  protected int numeroLegajo;
  protected String nombre;
  protected int edad;
  protected double salario;

  Docente(int numeroLegajo, String nombre, int edad, double salario) {
    this.numeroLegajo = numeroLegajo;
    this.nombre = nombre;
    this.edad = edad;
    this.salario = salario;
  }

  abstract public void calcularPlus();

}
