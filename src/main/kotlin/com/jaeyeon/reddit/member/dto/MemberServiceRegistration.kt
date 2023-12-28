package com.jaeyeon.reddit.member.dto

import com.jaeyeon.reddit.member.domain.entity.Member
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size
import org.springframework.security.crypto.password.PasswordEncoder

class MemberServiceRegistration(
    @field:NotBlank(message = "사용자 이름은 필수입니다.")
    @field:Size(min = 3, max = 50, message = "사용자 이름은 3자에서 50자 사이어야 합니다.")
    val userName: String,

    @field:NotBlank(message = "이메일은 필수입니다.")
    @field:Email(message = "잘못된 이메일 형식입니다.")
    @field:Size(max = 100, message = "이메일은 100자를 초과할 수 없습니다.")
    val email: String,

    @field:NotBlank(message = "비밀번호는 필수 입니다.")
    @field:Size(min = 6, message = "비밀번호는 최소 6자 이상이어야 합니다.")
    val password: String,
)

fun MemberServiceRegistration.toEntity(encoder: PasswordEncoder) = Member(
    userName = userName,
    email = email,
    password = encoder.encode(password),
)
