package br.com.cardoso.configmap

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoConfigmapK8sApplication

fun main(args: Array<String>) {
	runApplication<DemoConfigmapK8sApplication>(*args)
}
