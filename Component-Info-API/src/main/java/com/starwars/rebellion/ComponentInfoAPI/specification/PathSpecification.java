package com.starwars.rebellion.ComponentInfoAPI.specification;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.lang.Nullable;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;

/**
 * Design taken from:
 * https://stackoverflow.com/questions/56887166/merge-specifications-of-different-types-in-criteria-query-specifications
 *
 *
 * @param <T>
 */
@FunctionalInterface
public interface PathSpecification<T> {

    default Specification<T> atRoot() {
        return this::toPredicate;
    }

    default <S> Specification<S> atPath(final String pathAttribute) {
        // you'll need a couple more methods like this one for all flavors of attribute types in order to make it fully workable
        return (root, query, cb) -> toPredicate(root.join(pathAttribute), query, cb);
    }

    @Nullable
    Predicate toPredicate(Path<T> path, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder);
}