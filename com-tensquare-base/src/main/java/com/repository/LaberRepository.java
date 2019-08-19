package com.repository;

import com.pojo.Laber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface LaberRepository extends JpaRepository<Laber,Long>,JpaSpecificationExecutor<Laber> {
}
