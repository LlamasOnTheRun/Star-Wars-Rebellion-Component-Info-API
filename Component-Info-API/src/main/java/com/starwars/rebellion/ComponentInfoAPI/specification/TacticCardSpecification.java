package com.starwars.rebellion.ComponentInfoAPI.specification;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.TacticCard;
import com.starwars.rebellion.ComponentInfoAPI.dao.request.TacticCardRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Component
public class TacticCardSpecification {
    public Specification<TacticCard> getTacticCards(TacticCardRequest tacticCardRequest){
        return((root, query, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<>();

            if(tacticCardRequest.getId() != null && tacticCardRequest.getId() > 0){
                predicates.add(criteriaBuilder.equal(root.get("id"), tacticCardRequest.getId()));
            }

            if(tacticCardRequest.getTacticType() != null){
                predicates.add(criteriaBuilder.equal(root.get("tacticType"), tacticCardRequest.getTacticType()));
            }

            if(tacticCardRequest.getTitle() != null && !Objects.equals(tacticCardRequest.getTitle(), "")){
                String[] splitTitle = tacticCardRequest.getTitle().split("[\n\r\s]+");
                Arrays.stream(splitTitle).forEach(word -> predicates.add(criteriaBuilder.like(root.get("cardText").get("title"),
                        "%"+word+"%")));
            }

            return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
        });
    }
}
