public class Titular extends Docente {

  private int antiguedad;

  Titular(int numeroLegajo, String nombre, int edad, double salario, int antiguedad) {
    super(numeroLegajo, nombre, edad, salario);
    this.antiguedad = antiguedad;
  }

  @Override
  public void calcularPlus() {
    if (this.edad > 30 && this.antiguedad > 6) {
      this.salario += this.PLUS_RURALIDAD;
    }
  }
  
  

}
