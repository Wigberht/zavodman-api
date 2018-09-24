package com.dimbo.zavodman

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ZavodmanApplication

fun main(args: Array<String>) {
    runApplication<ZavodmanApplication>(*args)
}
