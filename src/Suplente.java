public class Suplente extends Docente {

  private String zona;

  Suplente(int numeroLegajo, String nombre, int edad, double salario, String zona) {
    super(numeroLegajo, nombre, edad, salario);
    this.zona = zona;
  }

  @Override
  public void calcularPlus() {
    if (this.getEdad() < 25 && this.getZona().equalsIgnoreCase("Zona A")) {
      this.setSalario(this.getSalario() + this.PLUS_RURALIDAD);
    }
  }

  public String getZona() {
    return zona;
  }
  
}
