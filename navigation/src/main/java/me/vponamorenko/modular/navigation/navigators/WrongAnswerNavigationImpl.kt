package me.vponamorenko.modular.navigation.navigators

import me.vponamorenko.modular.navigation.router.Router
import me.raiden.modular.navigation.result.wrong.WrongAnswerNavigation

internal class WrongAnswerNavigationImpl(private val navigationController: Router) : WrongAnswerNavigation {

    override fun tryAgain() {
        navigationController.goBack()
    }
}