package com.zazza.api.controllers

import com.zazza.api.models.User
import com.zazza.api.services.UserService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/user")
class UserController(private val userService: UserService){

    @GetMapping("/{id}")
    suspend fun getUser(@PathVariable id: Long) = userService.getUser(id)

    @GetMapping
    suspend fun getAllUsers() = userService.getAllUsers()

    @PostMapping
    @PutMapping
    suspend fun saveUser(@RequestBody user: User) = userService.saveUser(user)
}