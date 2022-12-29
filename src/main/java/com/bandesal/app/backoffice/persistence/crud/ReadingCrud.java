package com.bandesal.app.backoffice.persistence.crud;

import com.bandesal.app.backoffice.persistence.entity.ReadingEntity;
import com.bandesal.app.backoffice.persistence.entity.ReadingPk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReadingCrud extends JpaRepository<ReadingEntity, ReadingPk> {
}
