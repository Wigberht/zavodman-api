package com.dimbo.zavodman.persistence

import com.dimbo.zavodman.model.User
import org.springframework.stereotype.Repository

@Repository
//interface UserRepository : PagingAndSortingRepository<User, String>
class UserRepository {
    private val users: List<User> = listOf(
            User("1", "Dimbo", "C", "mail@epam.com"),
            User("2", "Maria", "L", "test@epam.com")
    )

    fun users(): List<User> {
        return users
    }

}