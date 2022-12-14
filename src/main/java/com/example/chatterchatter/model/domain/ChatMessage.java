package com.example.chatterchatter.model.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
@NoArgsConstructor
@AllArgsConstructor
public class ChatMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "SEQ_MESSAGE", sequenceName = "SEQ_MESSAGE", initialValue = 100)
    @Column(nullable = false, unique = true)
    private Long id;

    @ManyToOne
    @NotNull
    User sender;

    @Column(nullable = false)
    @NotBlank
    String content;

    @Column(nullable = false)
    @NotNull
    LocalDateTime time;

    @ManyToOne(fetch = FetchType.LAZY)
    @NotNull
    Subject subject;

    @PrePersist
    protected void onCreate() {
        time = LocalDateTime.now();
    }
}
