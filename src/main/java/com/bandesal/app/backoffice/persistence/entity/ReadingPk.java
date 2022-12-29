package com.bandesal.app.backoffice.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class ReadingPk implements Serializable {

    private static final long serialVersionUID = -7174969833135441422L;
    @Column(name = "blog_id")
    private long blogId;
    @Column(name = "reader_id")
    private long readerId;

    public long getBlogId() {
        return blogId;
    }

    public void setBlogId(long blogId) {
        this.blogId = blogId;
    }

    public long getReaderId() {
        return readerId;
    }

    public void setReaderId(long readerId) {
        this.readerId = readerId;
    }
}
