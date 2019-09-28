package com.uniandes.lps.grafo.negocio;

import java.util.List;

import com.uniandes.lps.grafo.dominio.Nodo;

public interface Grafo {
	
	void addNodo(String nombre);
	
	void addArco(String origen, String destino) throws Exception;
	
	List<Nodo> buscarRuta(String origen, String destino) throws Exception;	
}
