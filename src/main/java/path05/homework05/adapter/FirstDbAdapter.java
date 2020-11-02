package path05.homework05.adapter;

import orm.api.IDbEntity;
import orm.entity.AbstractOrm;
import orm.first.IFirstOrm;


public class FirstDbAdapter <T extends IDbEntity> implements AbstractOrm<T> {

    private final IFirstOrm<T> firstOrm;

    public FirstDbAdapter(IFirstOrm<T> firstOrm) {
        this.firstOrm = firstOrm;
    }

    @Override
    public void create(T entity) {
        firstOrm.create(entity);
    }

    @Override
    public T read(Class<T> clazz, Long id) {
        return firstOrm.read((long) id);
    }

    @Override
    public void update(T entity) {
        firstOrm.update(entity);
    }

    @Override
    public void delete(T entity) {
        firstOrm.delete(entity);
    }

}
