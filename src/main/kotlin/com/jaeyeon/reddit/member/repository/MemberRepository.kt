package com.jaeyeon.reddit.member.repository

import com.jaeyeon.reddit.member.domain.entity.Member
import org.springframework.data.jpa.repository.JpaRepository

interface MemberRepository : JpaRepository<Member, Long>
