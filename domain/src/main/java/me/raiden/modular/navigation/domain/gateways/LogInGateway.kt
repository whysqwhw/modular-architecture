package me.raiden.modular.navigation.domain.gateways

interface LogInGateway {
    fun logIn(email: String, password: String)
}