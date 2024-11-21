public class Estudiante extends Persona {
    int codigo;
    public Estudiante(String cedula, String nombre, String apellido, String tipoOfSangre, String fechaNacimiento, int codigo) {
        super(cedula, nombre, apellido, tipoOfSangre, fechaNacimiento);
        this.codigo = codigo;
    }

    private int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("[UNIQUE CODE]: "+getCodigo());
    }
}