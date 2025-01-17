package pl.pop.interview.master.practitioner;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Getter
@Setter
public class PractitionerDTO {
    private Long id;

    public Long getId() {
        return id;
    }
}
