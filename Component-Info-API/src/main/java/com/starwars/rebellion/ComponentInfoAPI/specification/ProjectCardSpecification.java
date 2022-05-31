package com.starwars.rebellion.ComponentInfoAPI.specification;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.ProjectCard;
import com.starwars.rebellion.ComponentInfoAPI.dao.request.ProjectCardRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Component
public class ProjectCardSpecification {

    public Specification<ProjectCard> getProjectCards(ProjectCardRequest projectCardRequest){
        return(root, query, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<>();

            if(projectCardRequest.getId() != null && projectCardRequest.getId() > 0){
                predicates.add(criteriaBuilder.equal(root.get("id"), projectCardRequest.getId()));
            }

            if (projectCardRequest.getTitle() != null && !Objects.equals(projectCardRequest.getTitle(), "")) {
                String[] splitTitle = projectCardRequest.getTitle().split("[\s]+");
                Arrays.stream(splitTitle).forEach(word -> predicates.add(criteriaBuilder.like(root.get("cardText").get("title"),
                        "%"+word+"%")));
            }

            predicates.add(criteriaBuilder.equal(root.get("isProjectCard"), true));

            if(projectCardRequest.getTotalInDeck() != null && projectCardRequest.getTotalInDeck() > 0){
                predicates.add(criteriaBuilder.equal(root.get("totalInDeck"), projectCardRequest.getTotalInDeck()));
            }

            return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
        };
    }
}
