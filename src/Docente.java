public class Docente extends Persona {
    int codigo;
    public Docente(String cedula, String nombre, String apellido, String tipoOfSangre, String fechaNacimiento, int codigo) {
        super(cedula, nombre, apellido, tipoOfSangre, fechaNacimiento);
        this.codigo = codigo;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    // Metodo
    @Override
    public void imprimir(){
        System.out.println("    [DATOS DOCENTE]   ");
        super.imprimir();
        System.out.println("[UNIQUE CODE]: ");
    }
}

