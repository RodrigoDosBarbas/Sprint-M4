public class Capacitacion {
    private int identificador;
    private String rut;
    private String dia;
    private String hora;
    private String lugar;
    private int duracion;
    private int cantidadAsistentes;

    public Capacitacion() {
    }

    public Capacitacion(int identificador, String rut, String dia, String hora, String lugar, int duracion, int cantidadAsistentes) {
        this.identificador = identificador;
        this.rut = rut;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.cantidadAsistentes = cantidadAsistentes;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getCantidadAsistentes() {
        return cantidadAsistentes;
    }

    public void setCantidadAsistentes(int cantidadAsistentes) {
        this.cantidadAsistentes = cantidadAsistentes;
    }

    @Override
    public String toString() {
        return "Capacitacion{" +
                "identificador=" + identificador +
                ", rut='" + rut + '\'' +
                ", dia='" + dia + '\'' +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                ", duracion=" + duracion +
                ", cantidadAsistentes=" + cantidadAsistentes +
                '}';
    }

    public String mostrarDetalle(){
        return  "La capacitación será en " + this.getLugar() + " a las " + this.getHora() + " del día " + this.getDia() + " y durará " + this.getDuracion() + " minutos.";

    }
}
