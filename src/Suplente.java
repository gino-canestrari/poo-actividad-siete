public class Suplente extends Docente {

  private String zona;

  Suplente(int numeroLegajo, String nombre, int edad, double salario, String zona) {
    super(numeroLegajo, nombre, edad, salario);
    this.zona = zona;
  }

  @Override
  public void calcularPlus() {
    if (this.edad < 25 && this.zona.equalsIgnoreCase("Zona A")) {
      this.salario += this.PLUS_RURALIDAD;
    }
  }
  
}
