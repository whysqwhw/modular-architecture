package me.vponamorenko.modular.navigation.routers

import me.vponamorenko.modular.navigation.controller.NavigationController
import me.vponamorenko.modular.navigation.arguments.questionfragment.QuestionFragmentArguments
import me.vponamorenko.modular.navigation.question.R
import me.vponomarenko.modular.navigation.questions.QuestionsNavigation

internal class QuestionsNavigationImpl(
    private val navigationController: NavigationController,
    private val bundlesScreens: QuestionFragmentArguments
) : QuestionsNavigation {

    override fun openQuestion(questionId: Int) {
        val questionData = bundlesScreens.setQuestionId(questionId)
        navigationController.navigate(R.id.action_questionsFragment_to_questionFragment, questionData)
    }
}