package com.clearminds.lco.servicios;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import com.clearminds.lco.dtos.Estudiante;
import com.clearminds.lco.excepciones.BDDException;

@Path("/estudiantes")
public class RestEstudiantes {

	@Path("/insertar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void insertar(Estudiante estudiante){
		ServicioEstudiante se = new ServicioEstudiante();
		try {
			System.out.println(estudiante);
			se.insertarEstudiante(estudiante);
		} catch (BDDException e) {
			e.printStackTrace();
		}
	}
	
}
