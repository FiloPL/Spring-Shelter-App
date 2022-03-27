package filopl.springsheltherapp.bootstrap;

import filopl.springsheltherapp.model.*;
import filopl.springsheltherapp.services.OwnerService;
import filopl.springsheltherapp.services.PetTypeService;
import filopl.springsheltherapp.services.SpecialtyService;
import filopl.springsheltherapp.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialtyService specialtyService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialtyService specialtyService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialtyService = specialtyService;
    }

    @Override
    public void run(String... args) throws Exception {
        int count = petTypeService.findAll().size();
        if (count == 0) {
            loadData();
        }

        loadData();
    }

    private void loadData() {
        Speciality radiology = new Speciality();
        radiology.setDescription("Radiology");
        Speciality savedRadiology = specialtyService.save(radiology);

        Speciality surgery = new Speciality();
        surgery.setDescription("Surgery");
        Speciality savedSurgery = specialtyService.save(surgery);

        Speciality denistry = new Speciality();
        denistry.setDescription("Denistry");
        Speciality savedDenistry = specialtyService.save(denistry);


        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Micheal");
        owner1.setLastName("Weston");
        owner1.setAddress("DLugosza 22");
        owner1.setCity("Poznan");
        owner1.setTelephone("666555444");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        owner2.setAddress("Dabrowskiego 222");
        owner2.setCity("Kalisz");
        owner2.setTelephone("111999444");

        ownerService.save(owner2);
        System.out.println("Load Owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Madzi");
        vet2.setLastName("Dzik");

        vetService.save(vet2);
        System.out.println("load Vets....");

        PetType dog = new PetType();
        dog.setName("dog");

        PetType saveDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("cat");

        PetType saveCatPetType = petTypeService.save(cat);

        Pet forest = new Pet();

        forest.setPetType(saveDogPetType);
        forest.setOwner(owner1);
        forest.setBrithDate(LocalDate.now());
        forest.setName("Forest");

        owner1.getPets().add(forest);

        Pet bellus = new Pet();
        bellus.setPetType(saveCatPetType);
        bellus.setOwner(owner2);
        bellus.setBrithDate(LocalDate.now());
        bellus.setName("Nella");

        owner2.getPets().add(bellus);

        System.out.println("Load Animals...");
    }
}
