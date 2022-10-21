public class Estudiante extends Usuario{
    String codigo;

    public Estudiante(String nombre, String primerApellido, String segundoApellido, String ci, int celular, String direccion, String email, String usuario, String contraceña, String codigo) {
        super(nombre, primerApellido, segundoApellido, ci, celular, direccion, email, usuario, contraceña);
        this.codigo = codigo;
    }

    public Estudiante(String ivan, String fermin, String encinas, String s, String johan_goete, String arom, String s1, String comtraceña) {
        super(ivan, fermin, encinas, s, johan_goete, arom, s1, comtraceña);
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "codigo='" + codigo + '\'' +
                ", usuario='" + usuario + '\'' +
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

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public Estudiante(String codigo) {
        this.codigo = codigo;
    }
}
