package paqueteuno;

import paquetedos.*;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String nomHospital;
        String provinciaH;
        String dir;
        String ciudHospital;
        int numEnfer;
        int lMed;
        int lEnf;
        
        System.out.print("Ingrese el nombre del Hospital: ");
        nomHospital = sc.nextLine();
        System.out.print("Ingrese la direccion del Hospital: ");
        dir = sc.nextLine();
        System.out.print("Ingrese la ciudad del Hospital: ");
        ciudHospital = sc.nextLine();
        System.out.print("Ingrese la provincia del Hospital: ");
        provinciaH = sc.nextLine();
        
        CiudadHospital cd = new CiudadHospital (ciudHospital,provinciaH);
        
        System.out.print("Ingrese el numero de especialidades: ");
        numEnfer = sc.nextInt();
        System.out.print("Ingrese el numero de Medicos: ");
        lMed = sc.nextInt();
        System.out.print("Ingrese el numero de Enfermeros: ");
        lEnf = sc.nextInt();
        
        Medico[] med = new Medico[lMed];
        Enfermero[] enferm = new Enfermero[lEnf];
        
        String n;
        String especialidad;
        String tipo;
        double sueldoMensual;
        
        sc.nextLine();
        
        for (int i = 0; i < lMed; i++) {
            System.out.print("Ingrese el nombre del médico "+(i+1) + ": ");
            n = sc.nextLine();
            
            System.out.print("Ingrese la especialidad: ");
            especialidad = sc.nextLine();
            
            System.out.print("Ingrese el sueldo mensual del médico "+(i+1) + ": ");
            sueldoMensual = sc.nextDouble();
            
            sc.nextLine();
            
            System.out.print("\n");
            
            med[i]= new Medico(n,especialidad,sueldoMensual);
        }
        
        sc.nextLine();
        
        for (int i = 0; i < lEnf; i++) {
            System.out.print("Ingrese el nombre del enfermero "+(i+1)+": ");
            n = sc.nextLine();
            
            System.out.print("Ingrese el tipo (nombramiendo o contrato): ");
            tipo = sc.nextLine();
            
            System.out.print("Ingrese el sueldo mensual del enfermero "+(i+1)+": ");
            sueldoMensual = sc.nextDouble();
            
            sc.nextLine();
            
            System.out.print("\n");
            
            enferm[i]= new Enfermero(n,tipo,sueldoMensual);
          
        }
        
        Hospital hs  = new Hospital(nomHospital,dir, cd, med, enferm, numEnfer);
        
        System.out.printf("\n%s\n" , hs);
        
        hs.calcularSueldos(med, enferm);
        
        System.out.printf("\n%s", hs);
    }
    
}
