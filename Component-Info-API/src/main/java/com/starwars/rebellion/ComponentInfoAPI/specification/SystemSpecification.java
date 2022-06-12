package com.starwars.rebellion.ComponentInfoAPI.specification;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.System;
import com.starwars.rebellion.ComponentInfoAPI.dao.request.SystemRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Component
@Slf4j
public class SystemSpecification {

    public Specification<System> getSystem(SystemRequest systemRequest) {
        return (root, query, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<>();

            if (systemRequest.getId() != null && systemRequest.getId() > 0) {
                predicates.add(criteriaBuilder.equal(root.get("id"),
                        systemRequest.getId()));
            }

            if (systemRequest.getName() != null && !Objects.equals(systemRequest.getName(), "")) {
                predicates.add(criteriaBuilder.equal(root.get("name"),
                        systemRequest.getName()));
            }

            return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
        };
    }
}
