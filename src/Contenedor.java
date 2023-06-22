import java.util.ArrayList;
import java.util.List;

public class Contenedor implements ContenedorImpl{

    private List<Usuario> usuarios;
    private List<Capacitacion> capacitaciones;

    public Contenedor() {
        this.usuarios = new ArrayList<>();
        this.capacitaciones = new ArrayList<>();
    }

    public Contenedor(ArrayList<Usuario> usuarios, ArrayList<Capacitacion> capacitaciones) {
        this.usuarios = usuarios;
        this.capacitaciones = capacitaciones;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public List<Capacitacion> getCapacitaciones() {
        return capacitaciones;
    }

    public void setCapacitaciones(List<Capacitacion> capacitaciones) {
        this.capacitaciones = capacitaciones;
    }

    @Override
    public boolean almacenarCliente(Cliente cliente) {
        this.getUsuarios().add(cliente);
        return true;
    }

    @Override
    public boolean almacenarProfesional(Profesional profesional) {
        this.getUsuarios().add(profesional);
        return true;
    }

    @Override
    public boolean almacenarAdministrativo(Administrativo administrativo) {
        this.getUsuarios().add(administrativo);
        return true;
    }

    @Override
    public boolean almacenarCapacitacion(Capacitacion capacitacion) {
        this.getCapacitaciones().add(capacitacion);
        return true;
    }

    @Override
    public boolean eliminarUsuario(String rut) {
        Usuario usuario = buscarUsuario(rut);
        if (usuario != null) {
            usuarios.remove(usuario);
            return true;
        }
        return false;
    }

    @Override
    public List<Usuario> listarUsuarios() {
        return this.getUsuarios();
    }

    public Usuario buscarUsuario(String rut) {
        for (Usuario usuario : usuarios) {
            if (usuario.getRut().equals(rut)) {
                return usuario;
            }
        }
        return null;
    }

    @Override
    public List<Usuario> listarUsuariosPorTipo(String tipo) {
        List<Usuario> clientes = new ArrayList<>();
        List<Usuario> profesionales = new ArrayList<>();
        List<Usuario> administrativos = new ArrayList<>();
        for (int i = 0; i < this.getUsuarios().size(); i++) {
            if (this.getUsuarios().get(i) instanceof Cliente){
                clientes.add(this.getUsuarios().get(i));
            }else if(this.getUsuarios().get(i) instanceof Profesional){
                profesionales.add(this.getUsuarios().get(i));
            }else{
                administrativos.add(this.getUsuarios().get(i));
            }
        }
        if (tipo.equals("Cliente")){
            return clientes;
        }else if (tipo.equals("Profesional")){
            return profesionales;
        }else if (tipo.equals("Administrativo")){
            return  administrativos;
        }else{
            return null;
        }
    }

    @Override
    public List<Capacitacion> listarCapacitaciones() {
        return this.getCapacitaciones();
    }
}
