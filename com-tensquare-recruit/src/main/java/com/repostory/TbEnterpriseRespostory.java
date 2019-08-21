package com.repostory;

import com.pojo.TbEnterprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TbEnterpriseRespostory extends JpaRepository<TbEnterprise,Integer>,JpaSpecificationExecutor<TbEnterprise> {
}
