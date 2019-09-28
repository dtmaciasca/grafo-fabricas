package com.uniandes.lps.grafo.fabrica;

import java.io.FileReader;
import java.util.Properties;

import com.uniandes.lps.grafo.negocio.Grafo;
import com.uniandes.lps.grafo.negocio.GrafoConBFS;
import com.uniandes.lps.grafo.negocio.GrafoConDFS;

public class FabricaGrafo {

	public static String getOpcionConfigurada() {
		// define un valor por defecto
		String opcionConfigurada = "grafoConDFS";

		try {
			// lee el archivo de configuración
			Properties opciones = new Properties();
			opciones.load(new FileReader("config-if.properties"));

			// revisa las opciones configuradas
			if (opciones.getProperty("grafoConDFS", "false").equals("true")) {
				opcionConfigurada = "grafoConDFS";
			}

			if (opciones.getProperty("grafoConBFS", "false").equals("true")) {
				opcionConfigurada = "grafoConBFS";
			}

		} catch (Exception e) {
			// ignora cualquier error leyendo el archivo
		}

		return opcionConfigurada;
	}

	public static Grafo obtenerGrafo() {

		// obtiene la opción configurada
		String opcion = FabricaGrafo.getOpcionConfigurada();

		// crea el objeto de acuerdo a la opción configurada
		Grafo grafo = null;
		switch (opcion) {

		case "grafoConBFS":
			grafo = new GrafoConBFS();
			break;

		case "grafoConDFS":
			grafo = new GrafoConDFS();
			break;
		}

		return grafo;
	}

}
