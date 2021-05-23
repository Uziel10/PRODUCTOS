package modulo.altas.de.productos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Consultas {

    public static PreparedStatement ps;
    public static ResultSet R;

    public static ConexionBD con = new ConexionBD();
    public static Connection conectar = con.conexion();

    public static String C, N, CO, T, F, H;
    public static float P, CA;

    public static void CONSULTAR() {
        try {
            String[] Titulos = {"CODIGO", "NOMBRE", "COLOR", "TAMAÑO", "PRECIO_UNIDAD", "CANTIDAD_STOCK", "FECHA_REGISTRO", "HORA_REGISTRO"};
            DefaultTableModel DATOS = new DefaultTableModel(null, Titulos);
            PRODUCTOS.uTABLA.setModel(DATOS);

            ps = conectar.prepareStatement("Select CODIGO, NOMBRE, COLOR, TAMAÑO, PRECIO_UNIDAD, CANTIDAD_STOCK, FECHA_REGISTRO, HORA_REGISTRO from productos");

            R = ps.executeQuery();
            ResultSetMetaData R2 = R.getMetaData();
            int COLUMNAS = R2.getColumnCount();

            while (R.next()) {
                Object[] FILAS = new Object[COLUMNAS];

                for (int i = 0; i < COLUMNAS; i++) {
                    FILAS[i] = R.getObject(i + 1);
                }
                DATOS.addRow(FILAS);
            }
        } catch (Exception e) {
            System.out.print("error AL Consultar");
        }

    }

    public static void AGREGAR(String C, String N, String CO, String T, float PU, float CA, String FR, String HR) {
        try {

            ps = conectar.prepareStatement("Insert Into productos(CODIGO, NOMBRE, COLOR, TAMAÑO, PRECIO_UNIDAD, CANTIDAD_STOCK, FECHA_REGISTRO, HORA_REGISTRO) values(?,?,?,?,?,?,?,?)");
            ps.setString(1, C);
            ps.setString(2, N);
            ps.setString(3, CO);
            ps.setString(4, T);
            ps.setFloat(5, PU);
            ps.setFloat(6, CA);
            ps.setString(7, FR);
            ps.setString(8, HR);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "DATO " + C + " AGREGADO EXITOSAMENTE!!");

        } catch (Exception e) {
            System.out.print("Error al Agregar");
        }

    }

    public static void ELIMINAR(String C) {
        try {

            ps = conectar.prepareStatement("Delete from productos where CODIGO='" + C + "'");
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "PRODUCTO " + C + " ELIMINADO");
        } catch (Exception e) {
            System.out.print("Error al Eliminar");
        }

    }

    public static void ACTUALIZAR(String C, String C1, String N, String CO, String T, float PU, float CA, String FR, String HR) {
        try {
            ps = conectar.prepareStatement("Update productos set CODIGO='" + C + "',NOMBRE='" + N + "',COLOR='" + CO + "',TAMAÑO='" + T + "',PRECIO_UNIDAD='" + PU + "',CANTIDAD_STOCK='" + CA + "',FECHA_REGISTRO='" + FR + "',HORA_REGISTRO='" + HR + "' where CODIGO='" + C1 + "'");
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "PRODUCTO " + C + " ACTUALIZADO");

        } catch (Exception e) {
            System.out.print("Error al Actualizar");
        }

    }

    public static void BUSCAR(String C) {

        try {

            String[] Titulos = {"CODIGO", "NOMBRE", "COLOR", "TAMAÑO", "PRECIO_UNIDAD", "CANTIDAD_STOCK", "FECHA_REGISTRO", "HORA_REGISTRO"};
            DefaultTableModel DATOS = new DefaultTableModel(null, Titulos);
            PRODUCTOS.uTABLA.setModel(DATOS);

            ps = conectar.prepareStatement("Select * from productos where CODIGO='" + C + "'");

            R = ps.executeQuery();
            ResultSetMetaData R2 = R.getMetaData();
            int COLUMNAS = R2.getColumnCount();

            R.next();
            PRODUCTOS.CODIGO.setText(R.getString(1));
            PRODUCTOS.NOMBRE.setText(R.getString(2));
            PRODUCTOS.COLOR.setSelectedItem(R.getString(3));
            PRODUCTOS.TAMAÑO.setSelectedItem(R.getString(4));
            PRODUCTOS.PRECIO.setText(R.getString(5));
            PRODUCTOS.CANTIDAD.setText(R.getString(6));
            PRODUCTOS.FECHA.setText(R.getString(7));
            PRODUCTOS.HORA.setText(R.getString(8));

            PRODUCTOS.BARRAS.setText(R.getString(1));
            PRODUCTOS.DESCRIPCION.setText(R.getString(2));

            Object[] FILAS = new Object[COLUMNAS];

            for (int i = 0; i < COLUMNAS; i++) {
                FILAS[i] = R.getObject(i + 1);
            }
            DATOS.addRow(FILAS);

        } catch (Exception e) {
            System.out.print("Error al Buscar");
        }

    }

}
