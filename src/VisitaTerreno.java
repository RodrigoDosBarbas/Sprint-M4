import java.util.ArrayList;
import java.util.Date;

public class VisitaTerreno {
    private int identificador;
    private String rut;
    private Date dia;
    private String hora;
    private String lugar;
    private String comentarios;

    private ArrayList<Revision> revisiones;

    public VisitaTerreno() {
    }

    public VisitaTerreno(int identificador, String rut, Date dia, String hora, String lugar, String comentarios, ArrayList<Revision> revisiones) {
        this.identificador = identificador;
        this.rut = rut;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.comentarios = comentarios;
        this.revisiones = revisiones;
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

    public Date getDia() {
        return dia;
    }

    public void setDia(Date dia) {
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

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public ArrayList<Revision> getRevisiones() {
        return revisiones;
    }

    public void setRevisiones(ArrayList<Revision> revisiones) {
        this.revisiones = revisiones;
    }

    @Override
    public String toString() {
        return "VisitaTerreno{" +
                "identificador=" + identificador +
                ", rut='" + rut + '\'' +
                ", dia=" + dia +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                ", comentarios='" + comentarios + '\'' +
                ", revisiones=" + revisiones +
                '}';
    }
}
