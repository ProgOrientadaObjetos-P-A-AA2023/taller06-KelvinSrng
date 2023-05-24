package paquetedos;

public class Enfermero {
    
    private String nombreEnfermero;
    private String tipo;
    private double sueldoMensual;
    
    public Enfermero(String nom,String t,double x){
        nombreEnfermero = nom;
        tipo = t;
        sueldoMensual = x;
    }
    
    public void establecerNombreEnfermero(String x){
        nombreEnfermero = x;
    }
    
    public void establecerTipo(String x){
        tipo=x;
    }  
    
    public void establecerSalarioMensualEnf(double x){
        sueldoMensual = x;
    }
 
    public String obtenerNombreEnfermero(){
        return nombreEnfermero;
    }
    
    public String obtenerTipo(){
        return tipo;
    }
    
    public double obtenerSalarioMensualEnf(){
        return sueldoMensual;
    }  
}
