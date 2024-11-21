public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("1754303699", "Erick", "Nuñez", "O+", "03-06-2024");
        System.out.println("-------------------------------------------------------------------------------------");
        persona1.imprimir();
        Estudiante estudiante1 = new Estudiante("1754303699", "Erick", "Nuñez", "O+", "03-06-2024", 20242656);
        System.out.println("--------------------------------------------------------------------------------------");
        estudiante1.imprimir();
        System.out.println("--------------------------------------------------------------------------------------");
        EstudianteBecado becado1 = new EstudianteBecado("1754303699", "Erick", "Nuñez", "O+", "03-06-2024", 20242656, "Completa");
        becado1.imprimir();
    }
}