package filopl.springsheltherapp.model;

import java.util.HashSet;
import java.util.Set;

public class Vet extends Person{

    private Set<Speciality> speciality = new HashSet<>();

    public Vet() {
        super();
    }

    public Vet(String firsName, String lastName) {
        super(firsName, lastName);
    }

    public Set<Speciality> getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Set<Speciality> speciality) {
        this.speciality = speciality;
    }
}
