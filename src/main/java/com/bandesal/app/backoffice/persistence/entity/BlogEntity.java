package com.bandesal.app.backoffice.persistence.entity;

import com.bandesal.app.backoffice.persistence.util.GenericStatus;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "blogs")
public class BlogEntity implements Serializable {
    private static final long serialVersionUID = -7174969833135441422L;
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
//    @Embedded
    @Transient
    private Audit audit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Audit getAudit() {
        return audit;
    }

    public void setAudit(Audit audit) {
        this.audit = audit;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
