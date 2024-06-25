public class Arista {
    // Atributos de la clase Arista
    private String nombre;

    // Constructor de la clase Arista
    public Arista(String nombre) {
        this.nombre = nombre;
    }

    // Método getter para el atributo nombre
    public String getNombre() {
        return nombre;
    }

    // Método setter para el atributo nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método toString para representar la Arista como cadena
    @Override
    public String toString() {
        return "Arista{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
