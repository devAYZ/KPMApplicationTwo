package com.devayz.kpmapplicationtwo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform