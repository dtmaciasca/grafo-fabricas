package com.uniandes.lps.grafo.fabrica;

import java.util.List;

import com.uniandes.lps.grafo.dominio.Nodo;
import com.uniandes.lps.grafo.negocio.Grafo;

public class Main {

	public static void main(String[] args) {
		try {
			Grafo g = FabricaGrafo.obtenerGrafo();
			g.addNodo("A");
			g.addNodo("B");
			g.addNodo("C");
			g.addNodo("D");
			g.addNodo("E");
			
			g.addArco("A", "B");
			g.addArco("B", "C");
			g.addArco("C", "D");
			g.addArco("E", "D");
			g.addArco("A", "C");

			List<Nodo> camino = g.buscarRuta("A", "E");
			
			if (camino == null) {
				System.out.println("Camino A -> C no encontrado");
			} else {
				System.out.println("Camino A -> C encontrado");
				for (Nodo nodo: camino) {
					System.out.println(nodo.getNombre());
				}				
			}
			System.out.println();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
