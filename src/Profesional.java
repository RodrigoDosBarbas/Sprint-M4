import java.util.Date;

public class Profesional extends Usuario{
    private String titulo;
    private Date fechaIngreso;

    public Profesional() {
    }

    public Profesional(String nombre, Date fechaNacimiento, String rut, String titulo, Date fechaIngreso) {
        super(nombre, fechaNacimiento, rut);
        this.titulo = titulo;
        this.fechaIngreso = fechaIngreso;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        return "Profesional{" +
                "titulo='" + titulo + '\'' +
                ", Nombre=" + this.getNombre() +
                ", Rut=" + this.getRut() +
                ", edad=" + this.mostrarEdad() +
                ", fechaIngreso=" + fechaIngreso +
                '}';
    }

    @Override
    public String analizarUsuario() {
        return "Nombre: " + this.getNombre() + ", Rut: "+ this.getRut() + ", título: " + this.getTitulo() + ", fecha de ingreso: " + this.getFechaIngreso();
    }
}
