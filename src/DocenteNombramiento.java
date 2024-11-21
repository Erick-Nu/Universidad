public class DocenteNombramiento extends Docente{
    String typeNombramiento;

    public DocenteNombramiento(String cedula, String nombre, String apellido, String tipoOfSangre, String fechaNacimiento, int codigo, String typeNombramiento) {
        super(cedula, nombre, apellido, tipoOfSangre, fechaNacimiento,codigo);
        this.typeNombramiento = typeNombramiento;
    }
    public String getTipoNombramiento() {
        return typeNombramiento;
    }
    public void setTipoNombramineto(String tipoNombramiento) {
        this.typeNombramiento = typeNombramiento;
    }
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("    [TIPO DE CONTRATO]  ");
        System.out.println("HIS GRANT IS: " + typeNombramiento);
    }
}
