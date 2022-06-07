package com.starwars.rebellion.ComponentInfoAPI.specification;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.Region;
import com.starwars.rebellion.ComponentInfoAPI.dao.request.RegionRequest;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.text.WordUtils;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import javax.persistence.criteria.Join;
import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Component
@Slf4j
public class RegionSpecification {

    public Specification<Region> getRegion(RegionRequest regionRequest) {
        return (root, query, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<>();

            if (regionRequest.getId() != null && regionRequest.getId() > 0) {
                predicates.add(criteriaBuilder.equal(root.get("id"),
                        regionRequest.getId()));
            }

            if (regionRequest.getContainsSystem() != null
                    && !Objects.equals(regionRequest.getContainsSystem(), "")) {
                Join<Object, Object> join = root.join("systems");
                String modifiedSystemName = WordUtils.capitalizeFully(regionRequest.getContainsSystem());
                predicates.add(criteriaBuilder.equal(join.get("name"),
                        modifiedSystemName));
            }

            return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
        };
    }
}
