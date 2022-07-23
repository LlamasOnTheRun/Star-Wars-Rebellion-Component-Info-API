package com.starwars.rebellion.ComponentInfoAPI.specification;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.Leader;
import com.starwars.rebellion.ComponentInfoAPI.dao.entities.MissionCard;
import com.starwars.rebellion.ComponentInfoAPI.dao.request.LeaderRequest;
import com.starwars.rebellion.ComponentInfoAPI.dao.request.MissionCardRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import javax.persistence.criteria.Join;
import javax.persistence.criteria.ListJoin;
import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Component
public class MissionCardSpecification {

    @Autowired
    private LeaderSpecification leaderSpecification;

    public Specification<MissionCard> getAllMissionCards() {
        return (root, query, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<>();

            predicates.add(criteriaBuilder.equal(root.get("isProjectCard"), false));

            return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
        };
    }

    public Specification<MissionCard> getMissionCards(MissionCardRequest missionCardRequest) {
        return (root, query, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<>();

            if (missionCardRequest.getId() != null && missionCardRequest.getId() > 0) {
                predicates.add(criteriaBuilder.equal(root.get("id"), missionCardRequest.getId()));
            }

            if (missionCardRequest.getTitle() != null && !Objects.equals(missionCardRequest.getTitle(), "")) {
                String[] splitTitle = missionCardRequest.getTitle().split("[\s]+");
                Arrays.stream(splitTitle).forEach(word -> predicates.add(criteriaBuilder.like(root.get("cardText").get("title"),
                        "%" + word + "%")));
            }
/*
            if (missionCardRequest.getLeaderBonus() != null){
                predicates.add(criteriaBuilder.equal(root.get("leaderBonus"), missionCardRequest.getLeaderBonus()));
            }
*/
            if (missionCardRequest.getLeaderRequest() != null) {
                LeaderRequest leaderRequest = missionCardRequest.getLeaderRequest();
                Join<MissionCard, Leader> leaderJoin = root.join("leaderBonus");
                if (leaderRequest.getId() != null && leaderRequest.getId() > 0) {
                    predicates.add(criteriaBuilder.equal(leaderJoin.get("id"),
                            leaderRequest.getId()));
                }

                if (leaderRequest.getFaction() != null) {
                    predicates.add(criteriaBuilder.equal(leaderJoin.get("faction"),
                            leaderRequest.getFaction()));
                }

                if (leaderRequest.getName() != null && !Objects.equals(leaderRequest.getName(), "")) {
                    String[] splitTitle = leaderRequest.getName().split("[\n\r\s]+");
                    Arrays.stream(splitTitle).forEach(word -> predicates.add(criteriaBuilder.like(leaderJoin.get("name"),
                            "%"+word+"%")));
                }

                if (leaderRequest.getStartingLeader() != null) {
                    predicates.add(criteriaBuilder.equal(leaderJoin.get("isStartingLeader"),
                            leaderRequest.getStartingLeader()));
                }
                /*Join<MissionCard, Leader> leaderJoin = root.join("leaderBonus");
                Specification<Leader> localLeaderSpecification = leaderSpecification.getLeaders(missionCardRequest.getLeaderRequest());
                leaderJoin.on(localLeaderSpecification.toPredicate(leaderJoin., query, criteriaBuilder));
                //Specification<Leader> localLeaderSpecification = leaderSpecification.getLeaders(missionCardRequest.getLeaderRequest());*/
            }

            if (missionCardRequest.getMinSkillNumRequired() != null && missionCardRequest.getMinSkillNumRequired() > 0) {
                predicates.add(criteriaBuilder.equal(root.get("minSkillNumRequired"),
                        missionCardRequest.getMinSkillNumRequired()));
            }

            if (missionCardRequest.getFaction() != null) {
                predicates.add(criteriaBuilder.equal(root.get("faction"), missionCardRequest.getFaction()));
            }

            if (missionCardRequest.getSkillType() != null) {
                predicates.add(criteriaBuilder.equal(root.get("skillType"), missionCardRequest.getSkillType()));
            }

            predicates.add(criteriaBuilder.equal(root.get("isProjectCard"), false));

            if (missionCardRequest.getIsStartingCard() != null) {
                predicates.add(criteriaBuilder.equal(root.get("isStartingCard"), missionCardRequest.getIsStartingCard()));
            }

            if (missionCardRequest.getTotalInDeck() != null && missionCardRequest.getTotalInDeck() > 0) {
                predicates.add(criteriaBuilder.equal(root.get("totalInDeck"), missionCardRequest.getTotalInDeck()));
            }
            return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
        };
    }
}
