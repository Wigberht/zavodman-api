package com.dimbo.zavodman.graphql

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import com.dimbo.zavodman.model.User
import com.dimbo.zavodman.persistence.UserRepository

class Query(private val userRepository: UserRepository) : GraphQLQueryResolver {
    fun users(): List<User> = userRepository.users()
}