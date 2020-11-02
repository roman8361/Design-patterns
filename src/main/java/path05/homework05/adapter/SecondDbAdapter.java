package path05.homework05.adapter;

import orm.api.IDbEntity;
import orm.entity.AbstractOrm;
import orm.entity.DbUserEntity;
import orm.entity.DbUserInfoEntity;
import orm.second.ISecondOrm;

public class SecondDbAdapter <T extends IDbEntity> implements AbstractOrm<T> {

    private ISecondOrm secondOrm;

    public SecondDbAdapter(ISecondOrm secondOrm) {
        this.secondOrm = secondOrm;
    }

    @Override
    public void create(T entity) {
        if (entity instanceof DbUserEntity) {
            secondOrm.getContext().getUsers().add((DbUserEntity) entity);
        }
        if (entity instanceof DbUserInfoEntity) {
            secondOrm.getContext().getUserInfos().add(((DbUserInfoEntity) entity));
        }
    }

    @Override
    public T read(Class<T> clazz, Long id) {
        if (DbUserEntity.class.equals(clazz)) {
            return (T) secondOrm.getContext().getUsers().stream()
                    .filter(user -> user.getId().equals(id))
                    .findFirst().orElse(null);
        }
        if (DbUserInfoEntity.class.equals(clazz)) {
            return (T) secondOrm.getContext().getUserInfos().stream()
                    .filter(userInfo -> userInfo.getId().equals(id))
                    .findFirst().orElse(null);
        }
        return null;
    }

    @Override
    public void update(T entity) {
        if (entity instanceof DbUserEntity) {
            delete(entity);
            create(entity);
        }
        if (entity instanceof DbUserInfoEntity) {
            delete(entity);
            create(entity);
        }
    }

    @Override
    public void delete(T entity) {
        if (entity instanceof DbUserEntity) {
            secondOrm.getContext().getUsers().remove(entity);
        }
        if (entity instanceof DbUserInfoEntity) {
            secondOrm.getContext().getUserInfos().remove(entity);
        }
    }

}
