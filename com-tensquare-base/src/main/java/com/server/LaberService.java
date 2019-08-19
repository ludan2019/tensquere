package com.server;

import com.pojo.Laber;
import com.repository.LaberRepository;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class LaberService {
    @Autowired
    private LaberRepository laberRepository;

    public List<Laber> findAll(){
        return laberRepository.findAll();
    }

    public Laber finaById(Long id){
        return laberRepository.findById(id).get();
    }

    public void saveLaber(Laber laber){
        laberRepository.save(laber);
    }

    public void updateLaber(Laber laber){
        laberRepository.save(laber);
    }

    public void deleteById(Long id){
        laberRepository.deleteById(id);
    }

    public List<Laber> findSearch(Map searchMap){

        Specification<Laber> spec =(Root<Laber> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) ->{

            List<Predicate> list = new ArrayList<>();
            if(StringUtils.isNotEmpty((String)searchMap.get("labername"))){
                list.add(criteriaBuilder.like(root.get("labername").as(String.class),"%"+searchMap.get("labername")+"%"));
            }
            if(StringUtils.isNotEmpty((String)searchMap.get("state"))){
                list.add(criteriaBuilder.equal(root.get("state").as(String.class),searchMap.get("state")));
            }
            return criteriaBuilder.and(list.toArray(new Predicate[list.size()]));
        };
        return laberRepository.findAll(spec);
    }
}
