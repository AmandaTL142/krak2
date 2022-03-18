package backend.api;

import backend.dto.PersonRequest;
import backend.dto.PersonResponse;
import backend.service.PersonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController


@RequestMapping("api/krak")
public class PersonController {
    PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping("/{id}")
    public PersonResponse addPerson(@RequestBody PersonRequest body) throws Exception {
        return personService.addPerson(body);
    }

    @PutMapping("/{id}")
    public PersonResponse updatePerson(@RequestBody PersonRequest body, @PathVariable String id){
        return personService.updatePerson(body,id);
    }


    @GetMapping
    public List<PersonResponse> getPersons (){
        return personService.getPersons();
    }

    @DeleteMapping("/{email}")
    public void deleteMember(@PathVariable String email) {
        personService.deletePerson(email);
    }

}

