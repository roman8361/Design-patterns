package path05.homework05.second;


import path05.homework05.entity.DbUserEntity;
import path05.homework05.entity.DbUserInfoEntity;

import java.util.Set;

/**
 * ISecondOrmContext.
 *
 * @author Ilya_Sukhachev
 */
public interface ISecondOrmContext {

    Set<DbUserEntity> getUsers();

    Set<DbUserInfoEntity> getUserInfos();

}
