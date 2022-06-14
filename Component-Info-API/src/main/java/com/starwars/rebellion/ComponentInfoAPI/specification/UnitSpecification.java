package com.starwars.rebellion.ComponentInfoAPI.specification;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.Unit;
import com.starwars.rebellion.ComponentInfoAPI.dao.request.UnitRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Component
public class UnitSpecification {

    public Specification<Unit> getUnits(UnitRequest unitRequest){
        return((root, query, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<>();

            if(unitRequest.getId() != null && unitRequest.getId() > 0){
                predicates.add(criteriaBuilder.equal(root.get("id"), unitRequest.getId()));
            }

            if(unitRequest.getTitle() != null && !Objects.equals(unitRequest.getTitle(), "")){
                String[] splitTitle = unitRequest.getTitle().split("[\s]+");
                Arrays.stream(splitTitle).forEach(word -> predicates.add(criteriaBuilder.like(root.get("title"),
                        "%"+word+"%")));
            }

            if(unitRequest.getFaction() != null){
                predicates.add(criteriaBuilder.equal(root.get("faction"), unitRequest.getFaction()));
            }

            if(unitRequest.getUnitType() != null){
                predicates.add(criteriaBuilder.equal(root.get("unitType"), unitRequest.getUnitType()));
            }

            if(unitRequest.getProductionType() != null){
                predicates.add(criteriaBuilder.equal(root.get("productionType"), unitRequest.getProductionType()));
            }

            if(unitRequest.getBlackDie() != null){
                predicates.add(criteriaBuilder.equal(root.get("blackDie"), unitRequest.getBlackDie()));
            }

            if(unitRequest.getRedDie() != null){
                predicates.add(criteriaBuilder.equal(root.get("redDie"), unitRequest.getRedDie()));
            }

            if(unitRequest.getHealth() != null){
                predicates.add(criteriaBuilder.equal(root.get("health"), unitRequest.getHealth()));
            }

            if(unitRequest.getHealthColor() != null){
                predicates.add(criteriaBuilder.equal(root.get("healthColor"), unitRequest.getHealthColor()));
            }

            if(unitRequest.getShipCarryingCapacity() != null){
                predicates.add(criteriaBuilder.equal(root.get("shipCarryingCapacity"),
                        unitRequest.getShipCarryingCapacity()));
            }

            if(unitRequest.getInvincible() != null){
                predicates.add(criteriaBuilder.equal(root.get("invincible"), unitRequest.getInvincible()));
            }

            if(unitRequest.getNeedsTransport() != null){
                predicates.add(criteriaBuilder.equal(root.get("needsTransport"), unitRequest.getNeedsTransport()));
            }

            if(unitRequest.getStructure() != null){
                predicates.add(criteriaBuilder.equal(root.get("structure"), unitRequest.getStructure()));
            }

            if(unitRequest.getTotalInGame() != null && unitRequest.getTotalInGame() > 0){
                predicates.add(criteriaBuilder.equal(root.get("totalInGame"), unitRequest.getTotalInGame()));
            }

            return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
        });
    }
}
