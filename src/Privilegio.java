public class Privilegio {
    Funcionalidad funcionalidad;
    Rol rol;

    @Override
    public String toString() {
        return "Privilegio{" +
                "funcionalidad=" + funcionalidad +
                ", rol=" + rol +
                '}';
    }

    public void setFuncionalidad(Funcionalidad funcionalidad) {
        this.funcionalidad = funcionalidad;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Funcionalidad getFuncionalidad() {
        return funcionalidad;
    }

    public Rol getRol() {
        return rol;
    }

    public Privilegio(Funcionalidad funcionalidad, Rol rol) {
        this.funcionalidad = funcionalidad;
        this.rol = rol;
    }
}
