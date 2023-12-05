/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prestamos;

/**
 *
 * @author Isaac Sibaja
 */
import Categorias.Categoria;
import Clientes.Cliente;
import Peliculas.Pelicula;
import Peliculas.listPelicula;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class listPrestamo {

    private Queue<Prestamo> queuePrestamo = new LinkedList<>();

    public void agregarPrestamo(String numero, String estado, String fecha, String cliente, String pelicula) {
        Prestamo nuevoPrestamo = new Prestamo(numero, estado, fecha, cliente, pelicula);
        Pelicula peli = new Pelicula(pelicula, "");
//        if (peli.getCodigo().contains(pelicula)){
        if (queuePrestamo.contains(nuevoPrestamo)) {
            System.out.println("El préstamo con el número " + numero + " ya existe en la lista");
//        }
        } else {
            queuePrestamo.add(nuevoPrestamo);
            System.out.println("Préstamo agregado exitosamente");
        }
    }

    public void mostrarPrestamos() {
        for (Prestamo prestamo : queuePrestamo) {
            System.out.println(prestamo);
        }
    }

    public void eliminarPrestamo(String numero, String estado, String fecha, String cliente, String pelicula) {
        Prestamo prestamoDel = new Prestamo(numero, estado, fecha, cliente, pelicula);
        if (queuePrestamo.contains(prestamoDel)) {
            queuePrestamo.remove(prestamoDel);
            System.out.println("Préstamo eliminado exitosamente");
        } else {
            System.out.println("No se encontró el préstamo con el número jindicado");
        }
    }

    public void actualizarPrestamo(String numero, String estado, String fecha, String cliente, String pelicula,
            String nuevoNumero, String nuevoEstado, String nuevaFecha, String nuevoCliente, String nuevaPelicula) {

        Prestamo prestamoUpd = new Prestamo(numero, estado, fecha, cliente, pelicula);
        if (queuePrestamo.contains(prestamoUpd)) {
            queuePrestamo.remove(prestamoUpd);
            Prestamo prestamoAdd = new Prestamo(nuevoNumero, nuevoEstado, nuevaFecha, nuevoCliente, nuevaPelicula);
            queuePrestamo.add(prestamoAdd);
            System.out.println("Préstamo actualizado exitosamente");
        } else {
            System.out.println("No se encontró el préstamo con el número hindicado");
        }
    }
}
