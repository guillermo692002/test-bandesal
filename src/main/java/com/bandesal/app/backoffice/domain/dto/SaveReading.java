package com.bandesal.app.backoffice.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class SaveReading implements Serializable {
    @JsonProperty(value = "blog_id")
    private Long blogId;
    @JsonProperty(value = "reader_id")
    private Long readerId;

}
