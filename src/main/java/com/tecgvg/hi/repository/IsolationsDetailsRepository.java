package com.tecgvg.hi.repository;

import com.tecgvg.hi.domain.IsolationsDetails;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the IsolationsDetails entity.
 */
@SuppressWarnings("unused")
@Repository
public interface IsolationsDetailsRepository extends JpaRepository<IsolationsDetails, Long>, JpaSpecificationExecutor<IsolationsDetails> {}
