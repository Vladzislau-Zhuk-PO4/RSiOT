package com.vlad.labs

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringKtApplication

fun main(args: Array<String>) {
	runApplication<SpringKtApplication>(*args)
}
