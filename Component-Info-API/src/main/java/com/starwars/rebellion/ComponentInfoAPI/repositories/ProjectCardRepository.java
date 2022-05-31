package com.starwars.rebellion.ComponentInfoAPI.repositories;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.ProjectCard;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface ProjectCardRepository extends JpaRepository<ProjectCard, Integer>, JpaSpecificationExecutor<ProjectCard> {
    List<ProjectCard> findAll(Specification<ProjectCard> projectCardSpecification);
}
