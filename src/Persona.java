public class Persona {
    String nombre;
    String primerApellido;
    String segundoApellido;

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", primerApellido='" + primerApellido + '\'' +
                ", segundoApellido='" + segundoApellido + '\'' +
                ", Ci='" + Ci + '\'' +
                ", celular=" + celular +
                ", direccion='" + direccion + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    String Ci;
    int celular;
    String direccion;
    String email;

    public String getNombre() {
        return nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public String getCi() {
        return Ci;
    }

    public int getCelular() {
        return celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEmail() {
        return email;
    }

    public Persona(String nombre, String primerApellido, String segundoApellido, String ci, int celular, String direccion, String email) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        Ci = ci;
        this.celular = celular;
        this.direccion = direccion;
        this.email = email;
    }
}
