package com.ergea.valorantagentsapp.model

/**
 * @Author: ridhogymnastiar
 * Github: https://github.com/ridhogaa
 */

data class Agent(
    val id: Long,
    val image: Int,
    val name: String,
    val role: String,
    val desc: String,
    val skillQName: String,
    val skillQDesc: String,
    val skillEName: String,
    val skillEDesc: String,
    val skillCName: String,
    val skillCDesc: String,
    val skillXName: String,
    val skillXDesc: String,
    val isFavorite: Boolean = false
)
