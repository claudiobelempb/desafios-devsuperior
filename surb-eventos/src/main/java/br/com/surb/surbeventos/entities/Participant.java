package br.com.surb.surbeventos.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "tb_participant")
public class Participant implements Serializable {

    @Serial
    private static final long serialVersionUID = 5112971261233577259L;

    private Long participantId;
    private String name;
    @Column(unique = true)
    private String email;

    public Participant() {
    }

    public Participant(Long participantId, String name, String email) {
        this.participantId = participantId;
        this.name = name;
        this.email = email;
    }

    public Long getParticipantId() {
        return participantId;
    }

    public void setParticipantId(Long participantId) {
        this.participantId = participantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Participant that = (Participant) object;
        return Objects.equals(participantId, that.participantId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(participantId);
    }
}
