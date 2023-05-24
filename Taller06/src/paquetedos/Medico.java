package paquetedos;


public class Medico {
    
    private String nomDoctor;
    private String especialidad;
    private double sueldoMensualM;
    
    public Medico(String nom, String e, double x) {
        nomDoctor = nom;
        especialidad = e;
        sueldoMensualM = x;
    }
    
    public void estalbecerNombreDoctor(String x) {
        nomDoctor = x;
    }
    
    public void establecerEspecialidad(String x) {
        especialidad = x;
    }
    
    public void establecerSalarioMensualM(double x) {
        sueldoMensualM = x;
    }
    
    public String obtenerNombreDoctor() {
        return nomDoctor;
    }
    
    public String obtenerEspecialidad(){
        return especialidad;
    }
    
    public double obtenerSalarioMensualM() {
        return sueldoMensualM;
    }
}
