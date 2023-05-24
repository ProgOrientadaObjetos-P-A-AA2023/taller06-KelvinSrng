package paquetedos;


public class CiudadHospital {
    
    private String ciudad;
    private String provincia;
    
    public CiudadHospital(String nombre, String x) {
        ciudad = nombre;
        provincia = x;
    }
    
    public void establecerCiudad(String x){
     ciudad = x;
    }   
    
    public void establecerProvincia(String x){
        provincia = x;
    }  
    
    public String obtenerCiudad(){
        return ciudad;
    }
    
    public String obtenerProvincia(){
        return provincia;
    }
}
