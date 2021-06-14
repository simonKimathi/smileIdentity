
package selfie.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import selfie.util.Ignore;

import javax.persistence.*;
import java.util.Set;


@Table
@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class SmileIdentityResponseDTO {

    @Id
    @Ignore
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column
    private String code;


    @OneToMany(mappedBy = "history", fetch = FetchType.EAGER,
            cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<History> history;

    @Embedded
    @JsonProperty("image_links")
    private ImageLinks imageLinks;

    @Column
    @JsonProperty("job_complete")
    private Boolean jobComplete;

    @Column
    @JsonProperty("job_success")
    private Boolean jobSuccess;

    @Embedded
    private Result result;

    @Column
    private String signature;
    @Column
    private String timestamp;

}
