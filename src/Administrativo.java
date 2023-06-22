import java.util.Date;

public class Administrativo extends Usuario{
    private String area;
    private String experiencia;

    public Administrativo() {
    }

    public Administrativo(String nombre, Date fechaNacimiento, String rut, String area, String experiencia) {
        super(nombre, fechaNacimiento, rut);
        this.area = area;
        this.experiencia = experiencia;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }


    @Override
    public String toString() {
        return "Administrativo{" +
                "area='" + area + '\'' +
                ", experiencia='" + experiencia + '\'' +
                "} " + super.toString();
    }

    @Override
    public String analizarUsuario() {
        return "Nombre: " + this.getNombre() + ", Rut: "+ this.getRut() + ", área: " + this.getArea() + ", experiencia previa: " + this.getExperiencia();
    }
}
