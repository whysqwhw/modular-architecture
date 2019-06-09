package me.vponamorenko.modular.navigation.routers

import me.vponamorenko.modular.navigation.controller.NavigationController
import me.vponamorenko.modular.navigation.question.R
import me.vponomarenko.modular.navigation.question.QuestionNavigation

internal class QuestionNavigationImpl(
    private val navigationController: NavigationController
) : QuestionNavigation {
    override fun openWrongAnswer() {
        navigationController.navigate(R.id.action_questionFragment_to_wrongAnswerFragment)
    }

    override fun openRightAnswer() {
        navigationController.navigate(R.id.action_questionFragment_to_rightAnswerFragment)
    }
}