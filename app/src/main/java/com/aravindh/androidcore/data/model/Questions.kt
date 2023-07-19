package com.aravindh.androidcore.data.model


import com.google.gson.annotations.SerializedName

data class Questions(
    @SerializedName("response_code")
    val responseCode: Int, // 0
    @SerializedName("results")
    val results: List<Result>
) {
    data class Result(
        @SerializedName("category")
        val category: String, // General Knowledge
        @SerializedName("correct_answer")
        val correctAnswer: String, // False
        @SerializedName("difficulty")
        val difficulty: String, // easy
        @SerializedName("incorrect_answers")
        val incorrectAnswers: List<String>,
        @SerializedName("question")
        val question: String, // Bulls are attracted to the color red.
        @SerializedName("type")
        val type: String // boolean
    )
}