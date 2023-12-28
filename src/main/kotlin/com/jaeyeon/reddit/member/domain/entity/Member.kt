package com.jaeyeon.reddit.member.domain.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class Member(
    userName: String,
    email: String,
    password: String,
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0L

    @Column(name = "name", nullable = false, length = 50)
    var userName: String = userName
        private set

    @Column(name = "email", nullable = false, unique = true, length = 100)
    var email: String = email
        private set

    @Column(name = "password", nullable = false, length = 255)
    var password: String = password
        private set

}
