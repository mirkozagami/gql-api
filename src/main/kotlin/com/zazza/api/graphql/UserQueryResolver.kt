package com.zazza.api.graphql

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import com.zazza.api.models.User
import com.zazza.api.services.UserService
import kotlinx.coroutines.experimental.runBlocking
import org.springframework.stereotype.Component

@Component
class UserQueryResolver(private val userService: UserService) : GraphQLQueryResolver{
    fun user(id: Long) :User = runBlocking { userService.getUser(id)}
}