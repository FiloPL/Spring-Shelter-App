package filopl.springsheltherapp.services.map;

import filopl.springsheltherapp.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findByID(ID id) {
        return map.get(id);
    }

    T save(T object) {
        if (object != null) {
            if (object.getId() == null) {
                object.setId(getNextID());
            }
            map.put(object.getId(), object);
        } else {
            throw new RuntimeException("Object cannot be null");
        }

        return object;
    }

    void deleteByID(ID id){
        map.remove(id);
    }

    void delete(T object) {
        map.entrySet().removeIf(idtEntry -> idtEntry.getValue().equals(object));
    }

    private Long getNextID(){
        Long nexID = null;
        try{
            nexID = Collections.max(map.keySet() )+ 1;
        } catch (NoSuchElementException exception) {
            nexID = 1L;
        }
        return nexID;
    }
}
