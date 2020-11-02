package path05.homework05.entity;


import path05.homework05.api.IDbEntity;

public interface AbstractOrm <T extends IDbEntity> {

    void create(T entity);

    T read(Class<T> clazz, Long id);

    void update(T entity);

    void delete(T entity);

}
