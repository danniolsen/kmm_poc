package com.example.poc_testing

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform