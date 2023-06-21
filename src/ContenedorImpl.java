import java.util.List;

public interface ContenedorImpl {
    public boolean almacenarCliente(Cliente cliente);
    public boolean almacenarProfesional(Profesional profesional);
    public boolean almacenarAdministrativo(Administrativo administrativo);
    public boolean almacenarCapacitacion(Capacitacion capacitacion);
    public boolean eliminarUsuario(String rut);
    public List<Usuario> listarUsuarios();
    public List<Usuario> listarUsuariosPorTipo(String tipo);
    public List<Capacitacion> listarCapacitaciones();
}
