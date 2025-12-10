package dev.nathanyan.email.domain;

import dev.nathanyan.email.enums.EmailStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "TB_EMAIL")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmailModel implements Serializable {
  @Serial
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private UUID emailId;
  private String userId;
  private String emailTo;
  private String emailFrom;
  private String emailSubject;
  @Column(columnDefinition = "TEXT")
  private String body;
  private LocalDateTime sendDateEmail;
  private EmailStatus emailStatus;

}
