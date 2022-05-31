package com.starwars.rebellion.ComponentInfoAPI.specification;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.Ring;
import com.starwars.rebellion.ComponentInfoAPI.dao.request.RingRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Component
public class RingSpecification {

    public Specification<Ring> getRings(RingRequest ringRequest){
        return(root, query, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<>();

            if(ringRequest.getId() != null && ringRequest.getId() > 0){
                predicates.add(criteriaBuilder.equal(root.get("id"), ringRequest.getId()));
            }
            if(ringRequest.getTitle() != null && !Objects.equals(ringRequest.getTitle(), "")){
                String[] splitTitle = ringRequest.getTitle().split("[\s]+");
                Arrays.stream(splitTitle).forEach(word -> predicates.add(criteriaBuilder.like(root.get("title"),
                        "%"+word+"%")));
            }

            return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
        };
    }
}
