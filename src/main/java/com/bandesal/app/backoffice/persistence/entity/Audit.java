package com.bandesal.app.backoffice.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.io.Serializable;
import java.util.Date;

@Embeddable
public class Audit implements Serializable {
    private static final long serialVersionUID = -7174969833135441422L;
    @CreatedDate
    @Column(name = "created_at", insertable = true, updatable = false)
    private Date createdAt;

    @LastModifiedDate
    @Column(name = "modifyed_at", insertable = false, updatable = true)
    private Date modifyedAt;

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getModifyedAt() {
        return modifyedAt;
    }

    public void setModifyedAt(Date modifyedAt) {
        this.modifyedAt = modifyedAt;
    }
}
