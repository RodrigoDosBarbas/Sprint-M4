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
            data = sn.nextLine();
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
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy", Locale.ROOT);//formateo de fecha

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
                        String nombre = validData("^[a-zA-Z0-9 ]{10,50}$","Ingrese nombre: ","Nombre inválido intente nuevamente (Debe ser entre 10 y 50 caracteres).");
                        String fechaNac = validData("^(0[1-9]|1\\d|2\\d|3[01])/(0[1-9]|1[0-2])/(\\d{4})$","Ingrese fecha de nacimiento: ", "Debe ingresar una fecha válida según formato DD/MM/AAAA");
                        Date fechaNacFormat = formatter.parse(fechaNac);
                        String rut = validData("^(?:(?:[0-9]{1,2}(?:\\.[0-9]{3}){0,2})|[0-9]{1,7})$","Ingrese RUT: ", "Rut inválido, intente nuevamente, debe ingresar el rut con puntos y sin dígito verificador.");
                        String apellido = validData("^[a-zA-Z0-9 ]{5,30}$","Ingrese apellidos: ","Apellido inválido intente nuevamente (Debe ser entre 5 y 30 caracteres).");
                        String telefono = validData("^[0-9]+$","Ingrese teléfono: ","Teléfono no válido, intente nuevamente.");
                        String afp = validData("^[a-zA-Z0-9 ]{4,30}$","Ingrese AFP: ","AFP inválida intente nuevamente (Debe ser entre 4 y 30 caracteres).");
                        String salud = validData("^[1-2]$","Ingrese sistema de salud (1.- Fonasa, 2.- Isapre): ","Sistema de salud no válido, intente nuevamente.");
                        String direccion = validData("^[a-zA-Z0-9#-() ]{1,70}$","Ingrese dirección: ","Dirección inválida intente nuevamente (Debe tener máximo 70 caracteres).");
                        String comuna = validData("^[a-zA-Z0-9 ]{1,50}$","Ingrese comuna: ","Comuna inválida intente nuevamente (Debe tener máximo 50 caracteres).");
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
                        System.out.println("Has seleccionado la opcion 3");
                        break;
                    case 5:
                        System.out.println("Has seleccionado la opcion 3");
                        break;
                    case 6:
                        System.out.println("Listado de usuarios: ");
                        for (int i = 0; i < contenedor.listarUsuarios().size(); i++) {
                            System.out.println(contenedor.listarUsuarios().get(i));
                        }
                        break;
                    case 7:
                        Boolean repeat = true;
                        do {
                            System.out.println("Que tipo de usuario desea listar:");
                            System.out.println("1.- Administrativo");
                            System.out.println("2.- Cliente");
                            System.out.println("3.- Profesional");
                            String tipo = sn.next();
                            if (tipo.equals("1")){
                                for (int i = 0; i < contenedor.listarUsuariosPorTipo("Administrativo").size(); i++) {
                                    System.out.println(contenedor.listarUsuariosPorTipo("Administrativo").get(i));
                                }
                                repeat = false;
                            }else if(tipo.equals("2")){
                                for (int i = 0; i < contenedor.listarUsuariosPorTipo("Cliente").size(); i++) {
                                    System.out.println(contenedor.listarUsuariosPorTipo("Cliente").get(i));
                                }
                                repeat = false;
                            }else if(tipo.equals("3")){
                                for (int i = 0; i < contenedor.listarUsuariosPorTipo("Profesional").size(); i++) {
                                    System.out.println(contenedor.listarUsuariosPorTipo("Profesional").get(i));
                                }
                                repeat = false;
                            }else{
                                System.out.println("Debe ingresar un numero de 1 a 3");
                                repeat = true;
                            }
                        }while (repeat);
                        break;
                    case 8:
                        for (int i = 0; i < contenedor.listarCapacitaciones().size(); i++) {
                            System.out.println(contenedor.listarCapacitaciones().get(i));
                        }
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