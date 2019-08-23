package com.repository;

import com.pojo.TbProblem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TbProblemRepository extends JpaRepository<TbProblem,Long> ,JpaSpecificationExecutor<TbProblem> {
}
