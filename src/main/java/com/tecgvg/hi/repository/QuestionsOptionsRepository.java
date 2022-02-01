package com.tecgvg.hi.repository;

import com.tecgvg.hi.domain.QuestionsOptions;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the QuestionsOptions entity.
 */
@SuppressWarnings("unused")
@Repository
public interface QuestionsOptionsRepository extends JpaRepository<QuestionsOptions, Long>, JpaSpecificationExecutor<QuestionsOptions> {}
