package clase;

public class ExpertoJava extends Programador{
private double salarioBono;

  
    public ExpertoJava( int intNumUnico, String strNombres, String strLenguaje, double dblSalario) {
         
        super(intNumUnico, strNombres, strLenguaje, dblSalario);
    }
  public double getSalarioBono() {
        return salarioBono;
    }

    public void setSalarioBono(double salarioBono) {
        this.salarioBono = (salarioBono*0.2)+salarioBono;
    }
    @Override
    public String toString() {
        return String.format("Programador %s -Salario + bono Programador Experto: %.2f",super.toString() ,getSalarioBono());
    }
    
    
}
