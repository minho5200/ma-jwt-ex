package com.ma.jwttest.repository;

import com.ma.jwttest.entity.Member;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

@Transactional
public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByAccount(String account);
}