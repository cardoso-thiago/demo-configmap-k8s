package br.com.cardoso.configmap.controller

import org.springframework.core.env.Environment
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class ConfigController(private val environment: Environment) {

    @GetMapping("/config/{key}")
    fun getConfig(@PathVariable key: String) = environment.getProperty(key)
}