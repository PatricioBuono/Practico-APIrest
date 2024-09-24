package org.example.persona.services;

import java.sql.ClientInfoStatus;
import java.util.List;

public interface BaseService<E> {
    // trae una lista de todas las personas/entidades que se encuentran en nuestra base de datos
    public List<E> findAll() throws Exception;
    // trae una persona/entidad de acuerdo a su nº de id
    public E findById(Long id) throws Exception;
    // crea una nueva entidad, por eso le pasamos como parametro una entidad al repositorio
    public E save(E entity) throws Exception;
    // para actualizar
    public E update(Long id, E entity) throws Exception;
    // se encarga de eliminar un registro de la base de datos
    public boolean delete(Long id) throws Exception;
}
