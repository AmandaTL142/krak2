package backend.dto;

import backend.entity.Hobby;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HobbyResponse {
    String name;

    String link;
    String category;
    String inOut;

    public HobbyResponse(Hobby hobby) {
        this.name = hobby.getName();
        this.link = hobby.getLink();
        this.category = hobby.getCategory();
        this.inOut = hobby.getInOut();
    }


}
