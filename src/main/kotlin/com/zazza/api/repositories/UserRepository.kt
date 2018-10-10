package com.zazza.api.repositories

import com.zazza.api.models.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User,Long>