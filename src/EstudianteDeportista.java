public class EstudianteDeportista extends Estudiante {
    String deporte;
    String equipo;
    String estado;

    public EstudianteDeportista(String cedula, String nombre, String apellido, String tipoOfSangre, String fechaNacimiento, int codigo,String deporte, String equipo, String estado) {
        super(cedula, nombre, apellido, tipoOfSangre, fechaNacimiento, codigo);
        this.deporte = deporte;
        this.equipo = equipo;
        this.estado = estado;
    }
    public String getDeporte() {
        return deporte;
    }
    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }
    public String getEquipo() {
        return equipo;
    }
    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    // METODO IMPRIMIR
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("[DEPORTE]: "+this.getDeporte());
        System.out.println("[EQUIPO]: "+this.getEquipo());
        System.out.println("[ESTADO]: "+this.getEstado());
    }

}
