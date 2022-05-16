abstract class Docente {
  
  final double PLUS_RURALIDAD = 15000;

  private int numeroLegajo;
  private String nombre;
  private int edad;
  private double salario;

  Docente(int numeroLegajo, String nombre, int edad, double salario) {
    this.numeroLegajo = numeroLegajo;
    this.nombre = nombre;
    this.edad = edad;
    this.salario = salario;
  }

  abstract public void calcularPlus();

  public int getNumeroLegajo() {
    return numeroLegajo;
  }

  public String getNombre() {
    return nombre;
  }

  public int getEdad() {
    return edad;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

}
