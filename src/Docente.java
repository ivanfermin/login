public class Docente  extends Usuario{
    int sueldo;

    public Docente(String s) {
        super();
    }

    public Docente(String s, String sander) {
        super();
    }

    public Docente(String ivaan, String fersmin, String encsinas, String s, String johadn_goete, String araom, String s1, String comtracleña) {
        super();
    }

    @Override
    public String toString() {
        return "Docente{" +
                "sueldo=" + sueldo +
                '}';
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getSueldo() {
        return sueldo;
    }

    public Docente(int sueldo) {
        this.sueldo = sueldo;
    }
}
