package com.bandesal.app.backoffice.persistence.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "blogs")
public class ReadingEntity implements Serializable {
    private static final long serialVersionUID = -7174969833135441422L;
    @EmbeddedId
    private ReadingPk id;

    @MapsId("readerId")
    @ManyToOne
    @JoinColumn(name = "reader_id", insertable = false, updatable = false)
    private ReaderEntity reader;

    @MapsId("blogId")
    @ManyToOne
    @JoinColumn(name = "blog_id", insertable = false, updatable = false)
    private BlogEntity blog;

    @Embedded
    private Audit audit;

    public ReadingPk getId() {
        return id;
    }

    public void setId(ReadingPk id) {
        this.id = id;
    }

    public Audit getAudit() {
        return audit;
    }

    public void setAudit(Audit audit) {
        this.audit = audit;
    }

    public ReaderEntity getReader() {
        return reader;
    }

    public void setReader(ReaderEntity reader) {
        this.reader = reader;
    }

    public BlogEntity getBlog() {
        return blog;
    }

    public void setBlog(BlogEntity blog) {
        this.blog = blog;
    }
}
