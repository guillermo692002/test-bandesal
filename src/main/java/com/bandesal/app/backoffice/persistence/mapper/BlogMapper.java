package com.bandesal.app.backoffice.persistence.mapper;

import com.bandesal.app.backoffice.domain.Blog;
import com.bandesal.app.backoffice.persistence.entity.Audit;
import com.bandesal.app.backoffice.persistence.entity.BlogEntity;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

@Component
public class BlogMapper {

    public BlogEntity toEntity(Blog dto){
        if(dto == null) return null;

        BlogEntity entity = new BlogEntity();
        entity.setId(dto.getId());
        entity.setDescription(dto.getDescription());
        entity.setTitle(dto.getTitle());
        return entity;
    }

    Blog toDto(BlogEntity entity){
        if(entity == null) return null;

        Blog dto = new Blog();
        dto.setId(entity.getId());
        dto.setDescription(entity.getDescription());
        dto.setTitle(entity.getTitle());
        dto.setCreatedAt(entity.getAudit().getCreatedAt());
        dto.setModifiedAt(entity.getAudit().getModifyedAt());
        return dto;
    }
}
