public class Funcionalidad {
    String nombre;

    @Override
    public String toString() {
        return "Funcionalidad{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public Funcionalidad(String nombre) {
        this.nombre = nombre;
    }
}
