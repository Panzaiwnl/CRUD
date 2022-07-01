package one.digitalinnovation.personapi.dto.request;

import lombok.*;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {

    private Long id;

    @NonNull
    private String firstName;

    @NonNull
    private String lastName;

    @NonNull
    private String cpf;

    private String birthDate;

    @NonNull
    private List<PhoneDTO> phones;
}
