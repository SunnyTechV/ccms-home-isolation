package com.tecgvg.hi.repository;

import com.tecgvg.hi.domain.HomeIsolations;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the HomeIsolations entity.
 */
@SuppressWarnings("unused")
@Repository
public interface HomeIsolationsRepository extends JpaRepository<HomeIsolations, Long>, JpaSpecificationExecutor<HomeIsolations> {}
