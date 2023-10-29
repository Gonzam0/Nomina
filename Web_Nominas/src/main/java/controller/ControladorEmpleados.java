package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmpleadoDao;
import laboral.DatosNoCorrectosException;
import model.Empleado;
import model.Nomina;

/**
 * Servlet implementation class ControlladorEmpleados
 */
@WebServlet("/ControladorEmpleados")
public class ControladorEmpleados extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public ControladorEmpleados() {
        super();
    }

    /**
     * Maneja las solicitudes GET para mostrar empleados o nóminas.
     *
     * @param request  La solicitud HTTP recibida.
     * @param response La respuesta HTTP que se enviará al cliente.
     * @throws ServletException Si se produce un error en el servlet.
     * @throws IOException      Si se produce un error de E/S.
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String opcion = request.getParameter("opcion");

        if (opcion.equals("mostrarEmp")) {
            // Llama al método para mostrar todos empleado
            EmpleadoDao empleadoDAO = new EmpleadoDao();
            List<Empleado> empleados = new ArrayList<>();
            try {
                empleados = empleadoDAO.obtenerEmpleados();

                request.setAttribute("empleados", empleados);
                RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/mostrarEmp.jsp");
                requestDispatcher.forward(request, response);

            } catch (SQLException | DatosNoCorrectosException e) {
                e.printStackTrace();
            }
            System.out.println("Usted a presionado la opcion mostrar empleado");

        } else if (opcion.equals("editarEmp")) {
            // Llama al método para editar un empleado
            EmpleadoDao empleadoDAO = new EmpleadoDao();
            List<Empleado> empleados = new ArrayList<>();
            try {
                empleados = empleadoDAO.obtenerEmpleados();

                request.setAttribute("empleados", empleados);
                RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/editarEmp.jsp");
                requestDispatcher.forward(request, response);
                System.out.println(empleados);

            } catch (SQLException | DatosNoCorrectosException e) {
                e.printStackTrace();
            }
            System.out.println("Usted a presionado la opcion mostrar empleado");
            System.out.println("Usted a presionado la opcion editar empleado");

        } else if (opcion.equals("mostrarNom")) {

            try {
                // Llama al método para obtener el sueldo del empleado
                String dni = request.getParameter("dni");
                EmpleadoDao empDAO = new EmpleadoDao();
                Nomina empleado = empDAO.obtenerSueldo(dni);

                if (empleado != null) {
                    List<Nomina> empleados = new ArrayList<>();
                    empleados.add(empleado);

                    request.setAttribute("empleados", empleados);
                } else {
                    request.setAttribute("empleados", new ArrayList<Empleado>());
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            request.getRequestDispatcher("/views/mostrarNom.jsp").forward(request, response);
            System.out.println("Usted a presionado la opcion mostrar nómina");
        }
    }

    /**
     * Maneja las solicitudes POST para mostrar nóminas.
     *
     * @param request  La solicitud HTTP recibida.
     * @param response La respuesta HTTP que se enviará al cliente.
     * @throws ServletException Si se produce un error en el servlet.
     * @throws IOException      Si se produce un error de E/S.
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String opcion = request.getParameter("opcion");

        if (opcion.equals("mostrarNom")) {
            // Llama al método para obtener el sueldo del empleado del dni
            String dni = request.getParameter("dni");
            EmpleadoDao empDAO = new EmpleadoDao();
            Nomina empleado = new Nomina();

            try {
                empleado = empDAO.obtenerSueldo(dni);
            } catch (Exception e) {
                e.printStackTrace();
            }

            List<Nomina> empleados = new ArrayList<Nomina>();
            empleados.add(empleado);

            request.setAttribute("empleados", empleados);
            request.getRequestDispatcher("/views/mostrarNom.jsp").forward(request, response);
        }
    }
}