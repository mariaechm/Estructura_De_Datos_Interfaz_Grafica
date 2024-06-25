public class Vertice {
    // Atributos de la clase Vertice
    private String nombre;

    // Constructor de la clase Vertice
    public Vertice(String nombre) {
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

    // Método toString para representar el Vertice como cadena
    @Override
    public String toString() {
        return "Vertice{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}