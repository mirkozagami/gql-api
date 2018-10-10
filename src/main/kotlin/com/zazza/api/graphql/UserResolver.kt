package com.zazza.api.graphql

import com.coxautodev.graphql.tools.GraphQLResolver
import com.zazza.api.models.User
import org.springframework.stereotype.Component

@Component
class UserResolver() : GraphQLResolver<User>