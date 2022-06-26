package com.starwars.rebellion.ComponentInfoAPI.specification;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.ObjectiveCard;
import com.starwars.rebellion.ComponentInfoAPI.dao.request.ObjectiveCardRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;

@Component
@Slf4j
public class ObjectiveCardSpecification {

    public Specification<ObjectiveCard> getObjectiveCard(ObjectiveCardRequest objectiveCardRequest) {
        return (root, query, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<>();

            if (objectiveCardRequest.getId() != null && objectiveCardRequest.getId() > 0) {
                predicates.add(criteriaBuilder.equal(root.get("id"),
                        objectiveCardRequest.getId()));
            }

            return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
        };
    }
}
