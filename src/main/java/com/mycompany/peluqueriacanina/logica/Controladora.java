package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void guardar(String nombreMasco, String raza, String color, String observaciones, EstadoOpcional alergico, EstadoOpcional atenEsp, String nombreDuenio, String celDuenio) {
        Duenio duenio = new Duenio();
        duenio.setNombre(nombreDuenio);
        duenio.setCelDuenio(celDuenio);
        
        Mascota masco = new Mascota();
        masco.setNombre(nombreMasco);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setAlergico(alergico);
        masco.setAtencionEspecial(atenEsp);
        masco.setObservaciones(observaciones);
        masco.setDuenio(duenio);
        
        controlPersis.guardar(duenio, masco);
    }

    public List<Mascota> traerMascotas() {
        return controlPersis.traerMascotas();
    }

    public void borrarMascota(int numCliente) {
        controlPersis.borrarMascota(numCliente);
    }

    public Mascota traerMascota(int numCliente) {
        return controlPersis.traerMascota(numCliente);
    }

    public void modificarMascota(Mascota mascota, String nombreMasco, String raza, String color, String observaciones, EstadoOpcional alergico, EstadoOpcional atenEsp, String nombreDuenio, String celDuenio) {
        mascota.setNombre(nombreMasco);
        mascota.setRaza(raza);
        mascota.setColor(color);
        mascota.setObservaciones(observaciones);
        mascota.setAlergico(alergico);
        mascota.setAtencionEspecial(atenEsp);
        
        controlPersis.modificarMascota(mascota);
        
        Duenio duenio = this.buscarDuenio(mascota.getDuenio().getId());
        duenio.setNombre(nombreDuenio);
        duenio.setCelDuenio(celDuenio);
        this.modificarDuenio(duenio);
    }

    private Duenio buscarDuenio(int id) {
        return controlPersis.traerDuenio(id);
    }

    private void modificarDuenio(Duenio duenio) {
        controlPersis.modificarDuenio(duenio);
    }
}
