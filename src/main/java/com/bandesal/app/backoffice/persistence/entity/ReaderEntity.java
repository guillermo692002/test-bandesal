package com.bandesal.app.backoffice.persistence.entity;

import com.bandesal.app.backoffice.persistence.util.GenericStatus;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "readers")
public class ReaderEntity implements Serializable {
    private static final long serialVersionUID = -7174969833135441422L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Embedded
    private Audit audit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Audit getAudit() {
        return audit;
    }

    public void setAudit(Audit audit) {
        this.audit = audit;
    }
}
