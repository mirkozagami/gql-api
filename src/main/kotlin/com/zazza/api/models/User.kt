package com.zazza.api.models

import javax.persistence.*

@Entity
data class User(@Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long,
                var username: String,
                var digestedPassword:String)