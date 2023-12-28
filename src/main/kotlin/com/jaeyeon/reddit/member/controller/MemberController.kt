package com.jaeyeon.reddit.member.controller

import com.jaeyeon.reddit.member.dto.MemberControllerRegistration
import com.jaeyeon.reddit.member.dto.toDto
import com.jaeyeon.reddit.member.service.MemberWriteService
import jakarta.validation.Valid
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class MemberController(
    private val memberWriteService: MemberWriteService,
) {

    @PostMapping("/members/sign-up")
    fun signUp(@RequestBody @Valid memberRequest: MemberControllerRegistration): Long {
        return memberWriteService.createMember(memberRequest.toDto())
    }
}
