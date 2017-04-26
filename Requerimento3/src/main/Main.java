package main;

import clase.ExpertoJava;
import clase.Lider;
import clase.Archivos;
import clase.Registro;
import clase.LenguajeProgramacion;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Registro objRegistro = new Registro();
        Lider objLider;
        ExpertoJava objPJ;
        LenguajeProgramacion objLenguaje;
        int intOpcion;
        int intNomina = 0;
        int intIntegrantes = 0;
        int intConSal;
        int intSi;
        int intNominaP = 0;
        double dblSalario = 0;
        double dblSalarioP = 0;
        String strNombres = null;
        String strNombresP = null;
        String strLenguaje = null;
        String strLenguajeExtra = null;
        String strLenguajeP = null;
        boolean blnBandera = true;
        objLider = new Lider(intNomina, strNombres, strLenguaje, dblSalario, intIntegrantes);
        objPJ = new ExpertoJava(intNominaP, strNombresP, strLenguajeP, dblSalarioP);
        objLenguaje = new LenguajeProgramacion(strLenguajeExtra);
        Archivos obArchivo = new Archivos();
        while (blnBandera) {
            System.out.println("Identifique su estado\n[1] Lider\n{2] Programador");
            intOpcion = entrada.nextInt();
            switch (intOpcion) {
                case 1:
                    System.out.println("Ingrese su numero de nomina");
                    intNomina = entrada.nextInt();
                    objLider.setIntNumUnico(intNomina);
                    entrada.nextLine();
                    System.out.println("Ingrese sus nombres");
                    strNombres = entrada.nextLine();
                    objLider.setStrNombres(strNombres);
                    System.out.println("Ingrese salario");
                    dblSalario = entrada.nextDouble();
                    objLider.setDblSalario(dblSalario);
                    entrada.nextLine();
                    System.out.println("Ingrese el lenguaje de programacion en el cual es EXPERTO");
                    strLenguaje = entrada.nextLine();
                    objLider.setStrLenguaje(strLenguaje);
                    System.out.println("Ingrese el numero de integrantes de su equipo");
                    intIntegrantes = entrada.nextInt();
                    objLider.setIntNumeroIntegrantes(intIntegrantes);
                    if (intIntegrantes == 0) {
                        objLider.setDblsalrioBono(0);
                    } else {
                        objLider.setDblsalrioBono(dblSalario);
                    }
                    //objLider.CalculoSalarioLider();
                    System.out.println("Tiene conocimiento de otro Lenguaje de Programacion\n[1] SI \n[2] NO");
                    intSi = entrada.nextInt();
                    entrada.nextLine();
                    if (intSi == 1) {
                        System.out.println("Escriba lenguajes");
                        strLenguajeExtra = entrada.nextLine();
                        objLenguaje.setStrLenguaje(strLenguajeExtra);
                    } else {
                        strLenguajeExtra = "Ninguno";
                        objLenguaje.setStrLenguaje(strLenguajeExtra);
                    }

                    objRegistro.ingresarDatos(objLenguaje, objLider);
                    obArchivo.ingresarDatosTxt(objLider, objLenguaje);
                    break;

                case 2:

                    System.out.println("Ingrese su numero de nomina");
                    intNominaP = entrada.nextInt();
                    objPJ.setIntNumUnico(intNominaP);
                    entrada.nextLine();
                    System.out.println("Ingrese sus nombres");
                    strNombresP = entrada.nextLine();
                    objPJ.setStrNombres(strNombresP);
                    System.out.println("Ingrese salario");
                    dblSalarioP = entrada.nextDouble();
                    entrada.nextLine();
                    objPJ.setDblSalario(dblSalarioP);
                    System.out.println("Ingrese el lenguaje de programacion en el cual es EXPERTO");
                    strLenguajeP = entrada.nextLine();
                    if (strLenguajeP.equals("Java")) {
                        objPJ.setSalarioBono(dblSalarioP);
                    } else {
                        objPJ.setSalarioBono(0);
                    }
                    objPJ.setStrLenguaje(strLenguajeP);
                    System.out.println("Tiene conocimiento de otro Lenguaje de Programacion\n[1] SI \n[2] NO");
                    intSi = entrada.nextInt();
                    entrada.nextLine();
                    if (intSi == 1) {
                        System.out.println("Escriba lenguajes");
                        strLenguajeExtra = entrada.nextLine();
                        objLenguaje.setStrLenguaje(strLenguajeExtra);
                    } else {
                        strLenguajeExtra = "Ninguno";
                        objLenguaje.setStrLenguaje(strLenguajeExtra);
                    }
                    objRegistro.ingresarDatos(objLenguaje, objPJ);
                    obArchivo.ingresarDatosProgramador(objPJ, objLenguaje);

                    break;
                default:
                    break;

            }
            System.out.println("Desea continuar en el menu\n[1] SI\n[2] NO");
            intConSal = entrada.nextInt();
            if (intConSal != 1) {
                blnBandera = false;
                objRegistro.mostrarDatos();
            }

        }

    }
}
