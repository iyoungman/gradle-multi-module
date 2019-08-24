package com.youngman.repository;

import com.youngman.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by YoungMan on 2019-08-23.
 */

public interface MemberRepository extends JpaRepository<Member, Long> {
}
