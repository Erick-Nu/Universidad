public class Persona {
    String cedula;
    String nombre;
    String apellido;
    String tipoOfSangre;
    String fechaNacimiento;

    public Persona(String cedula, String nombre, String apellido, String tipoOfSangre, String fechaNacimiento) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoOfSangre = tipoOfSangre;
        this.fechaNacimiento = fechaNacimiento;
    }

    private String getCedula() {
        return cedula;
    }

    private  String getNombre() {
        return nombre;
    }

    private  String getApellido() {
        return apellido;
    }

    private String getTipoOfSangre() {
        return tipoOfSangre;
    }

    private String getFechaNacimiento() {
        return fechaNacimiento;
    }
    // Imprimir
    public void imprimir() {
        System.out.println("[DATOS ESTUDIANTE]");
        System.out.println("Cedula: " + getCedula());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Tipo de Sangre: " + getTipoOfSangre());
        System.out.println("Fecha Nacimiento: " + getFechaNacimiento());
    }
}
