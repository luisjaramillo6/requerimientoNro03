package clase;

public class Programador {

    private int intNumUnico;
    private String strNombres, strLenguaje;
    private double dblSalario;

    public Programador(int intNumUnico, String strNombres, String strLenguaje, double dblSalario) {
        this.intNumUnico = intNumUnico;
        this.strNombres = strNombres;
        this.strLenguaje = strLenguaje;
        this.dblSalario = dblSalario;
    }

    public int getIntNumUnico() {
        return intNumUnico;
    }

    public void setIntNumUnico(int intNumUnico) {
        this.intNumUnico = intNumUnico;
    }

    public String getStrNombres() {
        return strNombres;
    }

    public void setStrNombres(String strNombres) {
        this.strNombres = strNombres;
    }

    public String getStrLenguaje() {
        return strLenguaje;
    }

    public void setStrLenguaje(String strLenguaje) {
        this.strLenguaje = strLenguaje;
    }

    public double getDblSalario() {
        return dblSalario;
    }

    public void setDblSalario(double dblSalario) {
        this.dblSalario = dblSalario;
    }

    @Override
    public String toString() {
        return "" + "- Numero Unico:" + getIntNumUnico() + ", - Nombres: " + getStrNombres() + ", - Lenguaje de Programacion: " + getStrLenguaje() + ", - Salario: " + getDblSalario();
    }

}
