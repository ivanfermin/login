public class  Usuario extends Persona {
    String usuario;
    String contraceña;

    @Override
    public String toString() {
        return "Usuario{" +
                "usuario='" + usuario + '\'' +
                ", contraceña='" + contraceña + '\'' +
                ", nombre='" + nombre + '\'' +
                ", primerApellido='" + primerApellido + '\'' +
                ", segundoApellido='" + segundoApellido + '\'' +
                ", Ci='" + Ci + '\'' +
                ", celular=" + celular +
                ", direccion='" + direccion + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContraceña(String contraceña) {
        this.contraceña = contraceña;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContraceña() {
        return contraceña;
    }

    public Usuario(String nombre, String primerApellido, String segundoApellido, String ci, int celular, String direccion, String email, String usuario, String contraceña) {
        super(nombre, primerApellido, segundoApellido, ci, celular, direccion, email);
        this.usuario = usuario;
        this.contraceña = contraceña;
    }
}

