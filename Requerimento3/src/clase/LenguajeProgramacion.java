package clase;

public class LenguajeProgramacion {

    private String strLenguaje;

    public LenguajeProgramacion(String strLenguaje) {
        this.strLenguaje = strLenguaje;
    }

    public String getStrLenguaje() {
        return strLenguaje;
    }

    public void setStrLenguaje(String strLenguaje) {
        this.strLenguaje = strLenguaje;
    }

    @Override
    public String toString() {
        return "- Lenguaje Extra: " + getStrLenguaje();
    }

}
