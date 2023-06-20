import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Contenedor contenedor = new Contenedor();

        Usuario u = new Usuario("prueba",new Date(),"1299485");
        Profesional p = new Profesional("profesional", new Date(),"9234839","mgkdflsgjs",new Date());
        contenedor.almacenarUsuario(u);
        contenedor.almacenarProfesional(p);

        for (int i = 0; i < contenedor.listarUsuariosPorTipo("Cliente").size(); i++) {
            System.out.println(contenedor.listarUsuariosPorTipo("Cliente").get(i).getNombre());
        }
    }
}