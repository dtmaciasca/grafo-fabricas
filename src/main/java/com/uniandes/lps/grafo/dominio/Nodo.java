package com.uniandes.lps.grafo.dominio;

import java.util.ArrayList;
import java.util.List;

public class Nodo {

	private String nombre;
	private List<Arco>	arcos = new ArrayList<>();
	
	public Nodo() { }
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Arco> getArcos() {
		return arcos;
	}

	public void setArcos(List<Arco> arcos) {
		this.arcos = arcos;
	}
	
	public void agregarArco(Arco arco) {
		arcos.add(arco);
	}
	
	public List<Nodo> getNodosAdyacentesDFS() {
		List<Nodo> nodos = new ArrayList<>();
		
		// por cada arco donde el nodo es origen
		for (Arco arco : arcos) {
			// si el arco no es reflexivo
			if (arco.getDestino() != this)
				// agrega el nodo destino a la lista 
				// de nodos adyacentes
				nodos.add(arco.getDestino());
		}
		
		// retorna la lista de nodos adyacentes
		return nodos;
	}
	
	public List<Nodo> getNodosAdyacentesBFS() {
		List<Nodo> nodos = new ArrayList<>();
		for (Arco arco : arcos) {
			nodos.add(arco.getDestino());
		}
		return nodos;
	}
}
