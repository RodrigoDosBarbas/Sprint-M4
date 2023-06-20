import java.util.Date;

public class Usuario implements Asesoria{
    private String nombre;
    private Date fechaNacimiento;
    private String rut;

    public Usuario() {
    }

    public Usuario(String nombre, Date fechaNacimiento, String rut) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", rut='" + rut + '\'' +
                '}';
    }

    public String mostrarEdad(){
        Date fechaActual = new Date();
        int dias=(int) ((fechaActual.getTime()-this.getFechaNacimiento().getTime())/86400000);
        int edad = dias/365;
        return "el usuario tiene "+ edad+" años";
    }

    @Override
    public String analizarUsuario() {
        return "Nombre: " + this.getNombre() + ", Rut: "+ this.getRut();
    }
}
