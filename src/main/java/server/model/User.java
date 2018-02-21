package server.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user")
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_user")
    private Long id;

    @Column(name = "mail")
    @NotEmpty(message = "A client must have a mail")
    private String mail;

    @Column(name = "password")
    @NotEmpty(message = "A client must have a password")
    private String password;

    @Column(name = "firstname")
    @NotEmpty(message = "A client must have a firstname")
    private String firstname;

    @Column(name = "lastname")
    @NotEmpty(message = "A client must have a lastname")
    private String lastname;

}
