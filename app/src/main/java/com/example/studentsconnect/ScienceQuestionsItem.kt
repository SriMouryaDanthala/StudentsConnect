package com.example.studentsconnect

import org.json.JSONArray

data class ScienceQuestionsItem(
    val category: String,
    val correctAnswer: String,
    val difficulty: String,
    val id: String,
    val incorrectAnswers: JSONArray,
    val question: String,
    val regions: JSONArray,
    val tags: JSONArray,
    val type: String
)