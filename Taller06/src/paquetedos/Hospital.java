package paquetedos;


public class Hospital {
    
    private String nombreHospital;
    private String direccion;
    private CiudadHospital ciudHospital;
    private int numEspecialidades;
    private Medico[] lMedicos;
    private Enfermero[] lEnfermeros;
    private double sueldoTotal;
    
    public Hospital(String nom, String d, CiudadHospital ciud, Medico[] lMed, Enfermero[] lEnf, int numE) {
        nombreHospital = nom;
        direccion = d;
        ciudHospital = ciud;
        numEspecialidades = numE;
        lMedicos = lMed;
        lEnfermeros = lEnf;
    }
    
    public void establecerNombreHospital (String n){
        nombreHospital = n;
    }

    public void establecerCiudadHospital(CiudadHospital c) {
        ciudHospital = c;
    }

    public CiudadHospital obtenerCiudadHospital() {
        return ciudHospital;
    }
    
    public void establecerMedicos(Medico[] c) {
        lMedicos = c;
    }

    public Medico[] obtenerMedicos() {
        return lMedicos;
    }
    
    public void establecerEnfermeros(Enfermero[] c) {
        lEnfermeros = c;
    }

    public Enfermero[] obtenerEnfermeros() {
        return lEnfermeros;
    }

    public void establecerEspecialidades(int n) {
        numEspecialidades = n;
    }

    public void establecerConjuntoMedicos(Medico[] c) {
        lMedicos = c;
    }
    
    public void calcularSueldoTotal(){
       sueldoTotal=4;
    }

    public void establecerDireccion(String x){
       direccion = x;
    }


    public String obtenerNombreHospital(){
       return nombreHospital;
    }
    
    public int obtenerNumeroEspecialidades(){
        return numEspecialidades;
    }
    
    public double obtenerSueldoTotal(){
        return sueldoTotal;
    }
    
    public String obtenerDireccion(){
        return direccion;
    }

    public void calcularSueldos(Medico[] a, Enfermero[] b) {
        double s1 = 0;
        double s2 = 0;
        for (int i=0;i < a.length;i++) {
            s1 += a[i].obtenerSalarioMensualM();
        }
        for (int i=0;i < b.length;i++) {
            s2 += b[i].obtenerSalarioMensualEnf();
        }
        sueldoTotal = s1+s2;
    }
    
    public String toString(){
        String cadena = String.format("HOSPITAL %S\nDirección: %s\n"
                + "Ciudad: %s\nProvincia: %s\nNúmero de especialidades: %d\n",
                obtenerNombreHospital(),obtenerDireccion(),obtenerCiudadHospital().obtenerCiudad(),
                obtenerCiudadHospital().obtenerProvincia(),obtenerNumeroEspecialidades());
        
        cadena = String.format("%sListado de médicos\n",cadena);
        
        for (int i = 0; i < obtenerMedicos().length; i++) {
            cadena = String.format("%s- %s - sueldo: %.0f - %s\n",
                    cadena, 
                    obtenerMedicos()[i].obtenerNombreDoctor(),
                    obtenerMedicos()[i].obtenerSalarioMensualM(),
                    obtenerMedicos()[i].obtenerEspecialidad());
        }
        
        cadena = String.format("%s\nListado de enfermeros(as)\n",cadena);
        
        for (int i = 0; i < obtenerEnfermeros().length; i++) {
            cadena = String.format("%s- %s - sueldo: %.0f - %s\n", 
                    cadena, 
                    obtenerEnfermeros()[i].obtenerNombreEnfermero(),      
                    obtenerEnfermeros()[i].obtenerSalarioMensualEnf(),
                    obtenerEnfermeros()[i].obtenerTipo());
        }
        
        cadena = String.format("%s\nTotal de sueldos a pagar por mes: %.2f",
                cadena, obtenerSueldoTotal());
        return cadena;
    }
}
