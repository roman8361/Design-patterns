package path05.homework05.entity;

import orm.api.IDbEntity;

import java.time.LocalDate;

/**
 * DbUserInfoEntity.
 *
 * @author Ilya_Sukhachev
 */
public class DbUserInfoEntity implements IDbEntity {

    private Long id;

    private String name;

    private LocalDate birthday;

    public DbUserInfoEntity(Long id, String name, LocalDate birthday) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

}
