/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clientes;

import java.util.ArrayList;

/**
 *
 * @author Pablo Rod
 */
public class ListaClientes {
    private ArrayList<Cliente> listaClientes = new ArrayList<>();

    public void agregarCliente(String codigo, String nombre, String id, String fechaNacimiento, String telefono, String correo, String direccion) {
        Cliente nuevoCliente = new Cliente(id, nombre, fechaNacimiento, telefono, correo, direccion);

        if (listaClientes.contains(nuevoCliente)) {
            System.out.println("El cliente ya existe en la lista");
        } else {
            listaClientes.add(nuevoCliente);
            System.out.println("Cliente agregado exitosamente");
        }
    }

    public void mostrarClientes() {
        for (Cliente cliente : listaClientes) {
            System.out.println(cliente);
        }
    }

    public void eliminarCliente(String id, String nombre) {
        Cliente clienteDel = new Cliente(id, nombre, "", "", "", "");
        if (listaClientes.contains(clienteDel)) {
            listaClientes.remove(clienteDel);
            System.out.println("Cliente eliminado exitosamente");
        } else {
            System.out.println("No se encontró el cliente con el ID indicado");
        }
    }

    public void actualizarCliente(String id, String nombre, String fechaNacimiento, String telefono, String correo, String direccion,
            String nuevoId, String nuevoNombre, String nuevaFechaNacimiento, String nuevoTelefono, String nuevoCorreo, String nuevaDireccion) {

        Cliente clienteUpd = new Cliente(id, nombre, "", "", "", "");
        if (listaClientes.contains(clienteUpd)) {
            listaClientes.remove(clienteUpd);
            Cliente clienteAdd = new Cliente(nuevoId, nuevoNombre, nuevaFechaNacimiento, nuevoTelefono, nuevoCorreo, nuevaDireccion);
            listaClientes.add(clienteAdd);
            System.out.println("Cliente actualizado exitosamente");
        } else {
            System.out.println("No se encontró el cliente con el ID indicado");}
}
}

