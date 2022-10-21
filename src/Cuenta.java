public class Cuenta {
    Usuario usuario;
    Rol rol;
    boolean estado;

    @Override
    public String toString() {
        return "Cuenta{" +
                "usuario=" + usuario +
                ", rol=" + rol +
                ", estado=" + estado +
                '}';
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Rol getRol() {
        return rol;
    }

    public boolean isEstado() {
        return estado;
    }

    public Cuenta(Usuario usuario, Rol rol, boolean estado) {
        this.usuario = usuario;
        this.rol = rol;
        this.estado = estado;
    }
}
