package path05.homework05.first;


import orm.api.IDbEntity;

/**
 * IFirstOrm.
 *
 * @author Ilya_Sukhachev
 */
public interface IFirstOrm<T extends IDbEntity> {

    void create(T entity);

    T read(Long id);

    void update(T entity);

    void delete(T entity);

}
