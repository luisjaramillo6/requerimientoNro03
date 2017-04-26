package clase;

public class Lider extends Programador {

    private int intNumeroIntegrantes;
    private double dblsalrioBono;

    public Lider(int intNumUnico, String strNombres, String strLenguaje, double dblSalario, int intNumeroIntegrantes) {
        super(intNumUnico, strNombres, strLenguaje, dblSalario);
        this.intNumeroIntegrantes = intNumeroIntegrantes;
    }

    public int getIntNumeroIntegrantes() {
        return intNumeroIntegrantes;
    }

    public void setIntNumeroIntegrantes(int intNumeroIntegrantes) {
        this.intNumeroIntegrantes = intNumeroIntegrantes;
    }

    public double getDblsalrioBono() {
        return dblsalrioBono;
    }

    public void setDblsalrioBono(double dblsalrioBono) {
        this.dblsalrioBono = (dblsalrioBono * 0.1) * getIntNumeroIntegrantes() + dblsalrioBono;
    }

    @Override
    public String toString() {
        return String.format("Lider %s - Salario Final: %s Numero de Integrantes: %d\n", super.toString(), getDblsalrioBono(), getIntNumeroIntegrantes());
    }

}
