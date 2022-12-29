package com.bandesal.app.backoffice.persistence.mapper;

import com.bandesal.app.backoffice.domain.Reader;
import com.bandesal.app.backoffice.persistence.entity.ReaderEntity;
import org.springframework.stereotype.Component;

@Component
public class ReaderMapper {

    Reader toDto(ReaderEntity entity){
        if(entity == null) return null;

        Reader dto = new Reader();
        dto.setId(entity.getId());
        dto.setCreatedAt(entity.getAudit().getCreatedAt());
        dto.setModifiedAt(entity.getAudit().getModifyedAt());
        dto.setName(entity.getName());
        return dto;
    }

    ReaderEntity toEntity(Reader dto){
        if(dto == null) return null;

        ReaderEntity entity = new ReaderEntity();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        return entity;
    }

}
