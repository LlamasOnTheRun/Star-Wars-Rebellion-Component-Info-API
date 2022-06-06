package com.starwars.rebellion.ComponentInfoAPI.specification;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.Region;
import com.starwars.rebellion.ComponentInfoAPI.dao.request.RegionRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;

@Component
@Slf4j
public class RegionSpecification {

    public Specification<Region> getRegion(RegionRequest regionRequest) {
        return (root, query, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<>();

            if (regionRequest.getId() > 0) {
                predicates.add(criteriaBuilder.equal(root.get("id"),
                        regionRequest.getId()));
            }

            return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
        };
    }
}
