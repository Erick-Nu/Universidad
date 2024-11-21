public class DocenteContrato extends Docente {
    String typeContrato;
    public DocenteContrato(String cedula, String nombre, String apellido, String tipoOfSangre, String fechaNacimiento, int codigo,String typeContrato) {
        super(cedula, nombre, apellido, tipoOfSangre, fechaNacimiento,codigo);
        this.typeContrato = typeContrato;
    }
    public String getTipoContrato() {
        return typeContrato;
    }
    public void setTipoContrato(String tipoContrato) {
        this.typeContrato = typeContrato;
    }
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("    [TIPO DE CONTRATO]  ");
        System.out.println("HIS GRANT IS: " + typeContrato);
    }
}
