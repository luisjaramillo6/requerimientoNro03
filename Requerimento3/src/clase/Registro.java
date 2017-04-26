package clase;

import java.util.ArrayList;

public class Registro {
    ArrayList<LenguajeProgramacion> lstLenguaje = new ArrayList();
    
    ArrayList<Programador> lstProgramador = new ArrayList();
    
    
    public void ingresarDatos(LenguajeProgramacion a, Programador b){
            lstLenguaje.add(a);
            lstProgramador.add(b);
    }
    
    public void mostrarDatos(){
            for (int i = 0; i < lstProgramador.size(); i++) {
                System.out.println(lstProgramador.get(i).toString() + lstLenguaje.get(i).toString());
        }
    }
}
