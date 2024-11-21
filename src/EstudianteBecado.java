public class EstudianteBecado extends Estudiante {
    String typeBeca;
    public EstudianteBecado(String cedula, String nombre, String apellido, String tipoOfSangre, String fechaNacimiento, int codigo,String typeBeca) {
        super(cedula, nombre, apellido, tipoOfSangre, fechaNacimiento,codigo);
        this.typeBeca = typeBeca;
    }
    public String getTipoBeca() {
        return typeBeca;
    }
    public void setTipoBeca(String tipoBeca) {
        this.typeBeca = tipoBeca;
    }
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("    [ESTUDIANTE BECADO]  ");
        System.out.println("HIS GRANT IS: " + typeBeca);
    }
}
