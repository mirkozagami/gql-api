package com.zazza.api.services

import com.zazza.api.models.User
import com.zazza.api.repositories.UserRepository
import org.springframework.data.domain.Example
import org.springframework.stereotype.Service

@Service
class UserService(private val userRepository: UserRepository){

    suspend fun saveUser(user: User) :User = userRepository.save(user)

    suspend fun getUser(id: Long) :User = userRepository.getOne(id)

    suspend fun getAllUsers() :List<User> = userRepository.findAll()

    suspend fun findUsers(specification: Example<User>) :List<User> = userRepository.findAll(specification)
}