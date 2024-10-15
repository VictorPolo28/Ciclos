package com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listaCompras = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
            int opcion;

        while (true) {
            
            System.out.println("\nOpciones");
            System.out.println("1. Agregar articulo");
            System.out.println("2. Eleminar articulo");
            System.out.println("3. Mostrar lista");
            System.out.println("4. Finalizar compra");
            System.out.println("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 1) {
                System.out.print("Ingrese el nombre del artículo: ");
                String articulo = scanner.nextLine();
                listaCompras.add(articulo);
            }
            else if (opcion == 2 ) {
                System.out.println("Ingrese el nombre del articulo a eliminar: ");
                String articuloEliminar = scanner.nextLine();
                for (int i = 0; i< listaCompras.size(); i++) {
                   if ( listaCompras.get(i).equals(articuloEliminar)) {
                    listaCompras.remove(i);
                    System.out.println("Articulo eliminado");
                    continue;
                   }
                    
                }
                System.out.println("Articulo no encontrado. ");
            }   
            else if (opcion == 3) {
                System.out.println("lista de compras: ");
                for (int i = 0; i<listaCompras.size(); i++ ) {
                    System.out.println(listaCompras.get(i));
                    
                }
            }
            else if (opcion == 4) {
                System.out.println("Gracias por su compra!");
                break;
                
            }

        }


    }
}