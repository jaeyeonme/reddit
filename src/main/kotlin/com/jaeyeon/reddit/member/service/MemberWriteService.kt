package com.jaeyeon.reddit.member.service

import com.jaeyeon.reddit.member.dto.MemberServiceRegistration
import com.jaeyeon.reddit.member.dto.toEntity
import com.jaeyeon.reddit.member.repository.MemberRepository
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class MemberWriteService(
    private val memberRepository: MemberRepository,
    private val passwordEncoder: PasswordEncoder,
) {

    fun createMember(request: MemberServiceRegistration): Long {
        return memberRepository.save(request.toEntity(passwordEncoder)).id
    }
}
