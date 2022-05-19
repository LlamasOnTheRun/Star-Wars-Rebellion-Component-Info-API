package com.starwars.rebellion.ComponentInfoAPI.specification;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.Leader;
import com.starwars.rebellion.ComponentInfoAPI.dao.request.LeaderRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Component
@Slf4j
public class LeaderSpecification {

    public Specification<Leader> getLeaders(LeaderRequest leaderRequest) {
        return (root, query, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<>();

            /*if (actionCardRequest.getId() > 0) {
                predicates.add(criteriaBuilder.equal(root.get("id"),
                        actionCardRequest.getId()));
            }

            if (actionCardRequest.getFaction() != null) {
                predicates.add(criteriaBuilder.equal(root.get("faction"),
                        actionCardRequest.getFaction()));
            }*/

            if (leaderRequest.getName() != null && !Objects.equals(leaderRequest.getName(), "")) {
                String[] splitTitle = leaderRequest.getName().split("[\n\r\s]+");
                Arrays.stream(splitTitle).forEach(word -> predicates.add(criteriaBuilder.like(root.get("name"),
                        "%"+word+"%")));
            }

            /*if (actionCardRequest.getStartingCard() != null) {
                predicates.add(criteriaBuilder.equal(root.get("isStartingCard"),
                        actionCardRequest.getStartingCard()));
            }*/

            return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
        };
    }
}
