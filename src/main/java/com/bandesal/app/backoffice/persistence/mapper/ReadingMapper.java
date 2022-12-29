package com.bandesal.app.backoffice.persistence.mapper;

import com.bandesal.app.backoffice.domain.Reading;
import com.bandesal.app.backoffice.persistence.entity.ReadingEntity;
import org.springframework.stereotype.Component;

@Component
public class ReadingMapper {

    private final ReaderMapper readerMapper;
    private final BlogMapper blogMapper;

    public ReadingMapper(ReaderMapper readerMapper, BlogMapper blogMapper) {
        this.readerMapper = readerMapper;
        this.blogMapper = blogMapper;
    }

    Reading toDto(ReadingEntity entity){
        if(entity == null) return null;

        Reading dto = new Reading();
        dto.setBlog(blogMapper.toDto(entity.getBlog()));
        dto.setReader(readerMapper.toDto(entity.getReader()));
        dto.setCreatedAt(entity.getAudit().getCreatedAt());
        dto.setModifiedAt(entity.getAudit().getModifyedAt());
        return dto;
    }

    ReadingEntity toEntity(Reading dto){
        if(dto == null) return null;
        ReadingEntity entity = new ReadingEntity();
        entity.setBlog(blogMapper.toEntity(dto.getBlog()));
        entity.setReader(readerMapper.toEntity(dto.getReader()));
        return entity;
    }

}
