package filopl.springsheltherapp.services;

import java.util.Set;

/**
 * Created by T.Filo Zegarlicki on 27.03.2022
 **/

public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}