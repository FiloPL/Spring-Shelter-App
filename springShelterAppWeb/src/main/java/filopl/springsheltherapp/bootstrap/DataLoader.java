package filopl.springsheltherapp.bootstrap;

import filopl.springsheltherapp.model.Owner;
import filopl.springsheltherapp.model.Vet;
import filopl.springsheltherapp.services.OwnerService;
import filopl.springsheltherapp.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;


    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirsName("Micheal");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirsName("Fiona");
        owner2.setLastName("Glenanne");

        ownerService.save(owner2);
        System.out.println("Load Owners...");

        Vet vet1 = new Vet();
        vet1.setFirsName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirsName("Madzi");
        vet2.setLastName("Dzik");

        vetService.save(vet2);
        System.out.println("load Vets....");


    }
}
