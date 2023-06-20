import java.util.Date;

public class Revision {
    private int identificador;
    private int identificadorVisitaTerreno;
    private String nombre;
    private String detalle;
    private int estado;

    public Revision() {
    }

    public Revision(int identificador, int identificadorVisitaTerreno, String nombre, String detalle, int estado) {
        this.identificador = identificador;
        this.identificadorVisitaTerreno = identificadorVisitaTerreno;
        this.nombre = nombre;
        this.detalle = detalle;
        this.estado = estado;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public int getIdentificadorVisitaTerreno() {
        return identificadorVisitaTerreno;
    }

    public void setIdentificadorVisitaTerreno(int identificadorVisitaTerreno) {
        this.identificadorVisitaTerreno = identificadorVisitaTerreno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Revision{" +
                "identificador=" + identificador +
                ", identificadorVisitaTerreno=" + identificadorVisitaTerreno +
                ", nombre='" + nombre + '\'' +
                ", detalle='" + detalle + '\'' +
                ", estado=" + estado +
                '}';
    }
}
