package backend.configuration;

import backend.entity.Person;
import backend.repository.PersonRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;

@Controller
@Profile("!test")
public class MakeTestData implements ApplicationRunner {

    PersonRepository memberRepository;

    public MakeTestData(PersonRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public void makeMembers(){
        Person m1 = memberRepository.save(new Person("amanda@amanda.dk", "Amanda", "Amandasen", "70121416"));
        Person m2 = memberRepository.save(new Person("casper@casper.co.uk", "Casper", "Caspersen", "88888888"));

        System.out.println("--------------Testdata kørt--------------");
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        makeMembers();

    }
}

