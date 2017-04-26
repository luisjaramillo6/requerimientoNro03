package clase;

import java.io.*;

public class Archivos {

    public void ingresarDatosTxt(Lider objLider, LenguajeProgramacion objLenguaje) {
        try {
            File f = new File("SistemaAcademico.csv");
            FileWriter fw;
            BufferedWriter bw;
            if (f.exists()) {
                fw = new FileWriter(f, true);
                bw = new BufferedWriter(fw);
                bw.newLine();
                bw.write("Lider" + ";" + objLider.getIntNumUnico() + ";" + objLider.getStrNombres() + ";" + objLider.getDblSalario() + ";" + objLider.getDblsalrioBono() + ";" + objLider.getStrLenguaje() + ";" + objLenguaje.getStrLenguaje() + ";" + objLider.getIntNumeroIntegrantes());
            } else {
                fw = new FileWriter(f, true);
                bw = new BufferedWriter(fw);
                bw.write("Tipo;" + "Nomina;" + "Nombres;" + "Salario;" + "Salario + bono;" + "Lenguaje experto;" + "Lenguaje Extra;" + "Integrantes;");
                bw.newLine();
                bw.write("Lider" + ";" + objLider.getIntNumUnico() + ";" + objLider.getStrNombres() + ";" + objLider.getDblSalario() + ";" + objLider.getDblsalrioBono() + ";" + objLider.getStrLenguaje() + ";" + objLenguaje.getStrLenguaje() + ";" + objLider.getIntNumeroIntegrantes());
            }
            bw.close(); // cierra el archivo nuevo.trabajo
            fw.close(); // cierra el archivo
        } catch (IOException e) {
        }
    }

    public void ingresarDatosProgramador(ExpertoJava objProgramador, LenguajeProgramacion objLenguaje) {
        try {
            File f = new File("SistemaAcademico.csv");
            FileWriter fw;
            BufferedWriter bw;
            if (f.exists()) {
                fw = new FileWriter(f, true);
                bw = new BufferedWriter(fw);
                bw.newLine();
                bw.write("Programador" + ";" + objProgramador.getIntNumUnico() + ";" + objProgramador.getStrNombres() + ";" + objProgramador.getDblSalario() + ";" + objProgramador.getSalarioBono() + ";" + objProgramador.getStrLenguaje() + ";" + objLenguaje.getStrLenguaje());
            } else {
                fw = new FileWriter(f, true);
                bw = new BufferedWriter(fw);
                bw.write("Tipo;" + "Nomina;" + "Nombres;" + "Salario;" + "Salario + bono;" + "Lenguaje experto;" + "Lenguaje Extra;" + "Integrantes;");
                bw.newLine();
                bw.write("Programador" + ";" + objProgramador.getIntNumUnico() + ";" + objProgramador.getStrNombres() + ";" + objProgramador.getDblSalario() + ";" + objProgramador.getSalarioBono() + ";" + objProgramador.getStrLenguaje() + ";" + objLenguaje.getStrLenguaje());
            }
            bw.close(); // cierra el archivo nuevo.trabajo
            fw.close(); // cierra el archivo
        } catch (IOException e) {
        }

    }
}
