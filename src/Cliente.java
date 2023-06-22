import java.util.ArrayList;
import java.util.Date;

public class Cliente extends Usuario{
    private String apellidos;
    private int telefono;
    private String AFP;
    private int salud;
    private String direccion;
    private String comuna;
    private ArrayList<Capacitacion> capacitaciones;
    private ArrayList<Accidente> accidentes;
    private ArrayList<VisitaTerreno> visitas;

    public Cliente() {
    }

    public Cliente(String nombre, Date fechaNacimiento, String rut, String apellidos, int telefono, String AFP, int salud, String direccion, String comuna) {
        super(nombre, fechaNacimiento, rut);
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.AFP = AFP;
        this.salud = salud;
        this.direccion = direccion;
        this.comuna = comuna;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getAFP() {
        return AFP;
    }

    public void setAFP(String AFP) {
        this.AFP = AFP;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public ArrayList<Capacitacion> getCapacitaciones() {
        return capacitaciones;
    }

    public void setCapacitaciones(ArrayList<Capacitacion> capacitaciones) {
        this.capacitaciones = capacitaciones;
    }

    public ArrayList<Accidente> getAccidentes() {
        return accidentes;
    }

    public void setAccidentes(ArrayList<Accidente> accidentes) {
        this.accidentes = accidentes;
    }

    public ArrayList<VisitaTerreno> getVisitas() {
        return visitas;
    }

    public void setVisitas(ArrayList<VisitaTerreno> visitas) {
        this.visitas = visitas;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + this.getNombre() + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", RUT='" + this.getRut() + '\'' +
                ", Edad='" + this.mostrarEdad() + '\'' +
                ", telefono=" + telefono +
                ", AFP='" + AFP + '\'' +
                ", salud=" + salud +
                ", direccion='" + direccion + '\'' +
                ", comuna='" + comuna + '\'' +
                '}';
    }

    public String obtenerNombre(){
        return "Nombres: " + this.getNombre() + ", Apellidos: " + this.getApellidos();
    }

    public int obtenerSistemaSalud(){
        return this.getSalud();
    }

    @Override
    public String analizarUsuario() {
        return "Nombre: " + this.getNombre() + ", rut: " + this.getRut() + ", dirección: " + this.getDireccion() + ", comuna: " + this.getComuna();
    }
}

