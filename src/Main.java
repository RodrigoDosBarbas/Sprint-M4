import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static String validData(String pattern, String ask, String repeat){
        String data;
        Scanner sn = new Scanner(System.in);
        while (true){
            System.out.print(ask);
            data = sn.next();
            if (data.matches(pattern)){
                return data;
            }
            System.out.println(repeat);
        }
    }
    public static void main(String[] args) throws ParseException {
        Contenedor contenedor = new Contenedor();

        Profesional p = new Profesional("profesional", new Date(),"9234839","mgkdflsgjs",new Date());
        contenedor.almacenarProfesional(p);


        for (int i = 0; i < contenedor.listarUsuariosPorTipo("Cliente").size(); i++) {
            System.out.println(contenedor.listarUsuariosPorTipo("Cliente").get(i).getNombre());
        }

        //Menú
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
        SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy", Locale.ROOT);//formateo de fecha

        while(!salir){
            System.out.println("Seleccione la opción:");
            System.out.println("1. Almacenar cliente.");
            System.out.println("2. Almacenar Profesional.");
            System.out.println("3. Almacenar Administrativo");
            System.out.println("4. Almacenar Capacitación.");
            System.out.println("5. Eliminar Usuario.");
            System.out.println("6. Listar Usuarios.");
            System.out.println("7. Listar Usuarios Por Tipo.");
            System.out.println("8. Listar Capacitaciones.");
            System.out.println("9. Salir");

            try {

                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        String nombre = validData("^[a-zA-Z0-9]{10,50}$","Ingrese nombre: ","Nombre inválido intente nuevamente (Debe ser entre 10 y 50 caracteres).");
                        String fechaNac = validData("^(0[1-9]|1\\d|2\\d|3[01])/(0[1-9]|1[0-2])/(\\d{4})$","Ingrese fecha de nacimiento: ", "Debe ingresar una fecha válida según formato DD/MM/AAAA");
                        Date fechaNacFormat = formatter.parse(fechaNac);
                        String rut = validData("^(?:(?:[0-9]{1,2}(?:\\.[0-9]{3}){0,2})|[0-9]{1,7})$","Ingrese RUT: ", "Rut inválido, intente nuevamente, debe ingresar el rut con puntos y sin dígito verificador.");
                        String apellido = validData("^[a-zA-Z0-9]{5,30}$","Ingrese apellidos: ","Apellido inválido intente nuevamente (Debe ser entre 5 y 30 caracteres).");
                        String telefono = validData("^[0-9]+$","Ingrese teléfono: ","Teléfono no válido, intente nuevamente.");
                        String afp = validData("^[a-zA-Z0-9]{4,30}$","Ingrese AFP: ","AFP inválida intente nuevamente (Debe ser entre 4 y 30 caracteres).");
                        String salud = validData("^[1-2]$","Ingrese sistema de salud (1.- Fonasa, 2.- Isapre): ","Sistema de salud no válido, intente nuevamente.");
                        String direccion = validData("^[a-zA-Z0-9]{1,70}$","Ingrese dirección: ","Dirección inválida intente nuevamente (Debe tener máximo 70 caracteres).");
                        String comuna = validData("^[a-zA-Z0-9]{1,50}$","Ingrese comuna: ","Comuna inválida intente nuevamente (Debe tener máximo 50 caracteres).");
                        Cliente cliente = new Cliente(nombre,fechaNacFormat,rut,apellido,Integer.parseInt(telefono),afp,Integer.parseInt(salud),direccion,comuna);
                        contenedor.almacenarCliente(cliente);
                        System.out.println("Cliente almacenado con éxito.");
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion 3");
                        break;
                    case 4:
                        String identificador = validData("^[0-9]+$","Ingrese el número identificador: ","número identificador inválido (Debe ser entre 3 y 50 caracteres).");
                        String rutUsuario = validData("^(?:(?:[0-9]{1,2}(?:\\.[0-9]{3}){0,2})|[0-9]{1,7})$","Ingrese el RUT del usuario: ", "RUT inválido, intente nuevamente (debe ingresar el RUT con puntos y sin dígito verificador).");
                        Usuario usuarioEncontrado = contenedor.buscarUsuario(rutUsuario);
                        if (usuarioEncontrado != null) {
                            String dia = validData("^[a-zA-Z0-9]{1,50}$","Ingrese el día de la capacitación: ","Día inválido. Debe tener entre 3 y 50 caracteres alfanuméricos.");
                            String hora = validData("^[a-zA-Z0-9]{1,50}$","Ingrese la hora de la capacitación: ","Hora inválida. Debe tener entre 3 y 50 caracteres alfanuméricos.");
                            String lugar = validData("^[a-zA-Z0-9]{3,70}$","Ingrese el lugar de la capacitación: ","Lugar inválido. Debe tener entre 3 y 50 caracteres alfanuméricos.");
                            String duracion = validData("^[0-9]+$","Ingrese la duración de la capacitación: ","Duración inválida. Debe tener entre 3 y 10 caracteres numéricos.");
                            String cant_asist = validData("^[0-9]+$","Ingrese la cantidad de asistentes: ","Cantidad de asistentes inválida. Debe tener entre 3 y 50 caracteres numéricos.");
                            Capacitacion capacitacion = new Capacitacion(Integer.parseInt(identificador),String.valueOf(usuarioEncontrado), dia,hora, lugar, Integer.parseInt(duracion), Integer.parseInt(cant_asist));
                            contenedor.almacenarCapacitacion(capacitacion);

                            System.out.println("Capacitación almacenada con éxito.");
                        } else {
                            System.out.println("El usuario con el RUT proporcionado no existe.");
                        }
                        break;
                    case 5:
                        String rutEliminar = validData("^(?:(?:[0-9]{1,2}(?:\\.[0-9]{3}){0,2})|[0-9]{1,7})$","Ingrese el RUT del usuario: ", "RUT inválido, intente nuevamente (debe ingresar el RUT con puntos y sin dígito verificador).");
                        boolean eliminado = contenedor.eliminarUsuario(rutEliminar);
                        if (eliminado) {
                            System.out.println("Usuario eliminado exitosamente.");
                        } else {
                            System.out.println("No se encontró ningún usuario con el RUT ingresado.");
                        }
                        break;
                    case 6:
                        System.out.println("Listado de usuarios: ");
                        for (int i = 0; i < contenedor.listarUsuarios().size(); i++) {
                            System.out.println(contenedor.listarUsuarios().get(i));
                        }
                        break;
                    case 7:
                        System.out.println("Has seleccionado la opcion 3");
                        break;
                    case 8:
                        System.out.println("Has seleccionado la opcion 3");
                        break;
                    case 9:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
    }
}