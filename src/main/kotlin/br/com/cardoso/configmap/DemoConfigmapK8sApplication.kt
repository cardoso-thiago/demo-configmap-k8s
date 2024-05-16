package br.com.cardoso.configmap

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.event.ApplicationReadyEvent
import org.springframework.boot.runApplication
import org.springframework.context.event.EventListener
import org.springframework.core.env.Environment
import org.springframework.stereotype.Component

@SpringBootApplication
class DemoConfigmapK8sApplication

fun main(args: Array<String>) {
    runApplication<DemoConfigmapK8sApplication>(*args)
}

@Component
class EnvironmentPrinter(private val environment: Environment) {

	@EventListener(ApplicationReadyEvent::class)
	fun onApplicationReady() {
		println("config.test: ${environment.getProperty("config.test")}")
		println("config.test2: ${environment.getProperty("config.test2")}")
		println("config.test3: ${environment.getProperty("config.test3")}")
	}
}