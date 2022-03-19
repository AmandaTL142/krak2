package backend.entity;

import backend.dto.HobbyRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
//@AllArgsConstructor
@NoArgsConstructor

public class Hobby {
    @Id
    String name;

    String link;
    String inOut;

    @OneToMany(mappedBy = "hobbyWithInfo")
    private Set<HobbyInfo> hobbies = new HashSet<>();

    public Hobby(HobbyRequest body){
        this.name = body.getName();
        this.link = body.getLink();
        this.inOut = body.getInOut();
    }

    public Hobby(String name, String link, String inOut) {
        this.name = name;
        this.link = link;
        this.inOut = inOut;
    }

}
