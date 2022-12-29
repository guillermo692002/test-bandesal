package com.bandesal.app.backoffice.persistence.crud;

import com.bandesal.app.backoffice.persistence.entity.ReaderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReaderCrud extends JpaRepository<ReaderEntity, Long> {
}
