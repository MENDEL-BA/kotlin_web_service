package com.webservice.webserv

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WebservApplication

fun main(args: Array<String>) {
	runApplication<WebservApplication>(*args)
}
