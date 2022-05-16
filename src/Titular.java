public class Titular extends Docente {

  private int antiguedad;

  Titular(int numeroLegajo, String nombre, int edad, double salario, int antiguedad) {
    super(numeroLegajo, nombre, edad, salario);
    this.antiguedad = antiguedad;
  }

  @Override
  public void calcularPlus() {
    if (this.getEdad() > 30 && this.getAntiguedad() > 6) {
      this.setSalario(this.getSalario() + this.PLUS_RURALIDAD);
    }
  }
  
  public int getAntiguedad() {
    return antiguedad;
  }

}
