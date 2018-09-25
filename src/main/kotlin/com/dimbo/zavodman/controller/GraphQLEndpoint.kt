package com.dimbo.zavodman.controller

import com.coxautodev.graphql.tools.SchemaParser
import com.dimbo.zavodman.graphql.Query
import com.dimbo.zavodman.persistence.UserRepository
import graphql.schema.GraphQLSchema
import graphql.servlet.SimpleGraphQLServlet
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.io.Serializable
import javax.servlet.annotation.WebServlet

@RestController
@RequestMapping("/graphql")
class GraphQLEndpoint : SimpleGraphQLServlet(buildSchema()), Serializable

private fun buildSchema(): GraphQLSchema {
    val userRepository = UserRepository()
    return SchemaParser.newParser()
            .file("schema.graphqls")
            .resolvers(Query(userRepository))
            .build()
            .makeExecutableSchema()
}

@GetMapping("/kek/{id}")
fun get(@PathVariable(name = "id") id: String): String {
    return "Kek endpoint $id"
}