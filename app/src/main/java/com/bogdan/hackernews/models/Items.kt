package com.bogdan.hackernews.models

data class Items(
    var id: String,
    var delete: Boolean,
    var type: String,
    var author: String,
    var timestamp: String,
    var text: String,
    var dead: Boolean,
    var parent: String,
    var poll: String,
    var kids: String,
    var url: String,
    var score: String,
    var title: String,
    var parts: String,
    var descendants: String
)