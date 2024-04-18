package com.softtek.repo;

import com.softtek.modelo.Tarea;
import org.springframework.stereotype.Repository;

@Repository
public class TareaRepo implements ITareaRepo{
    public Tarea obtenerTarea() {
        return new Tarea(100,"Crear proyecto");
    }

    @Override
    public Tarea crearTarea(Tarea t) {
        t.setIdTarea(1);
        return t;
    }

    @Override
    public void eliminarTarea(int id) {

    }
}
