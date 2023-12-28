package com.jaeyeon.reddit.member.dto

data class MemberControllerRegistration(
    val userName: String,
    val email: String,
    val password: String,
)

fun MemberControllerRegistration.toDto() = MemberServiceRegistration(
    userName = userName,
    email = email,
    password = password,
)
