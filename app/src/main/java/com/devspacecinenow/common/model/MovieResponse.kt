package com.devspacecinenow.common.model

import com.devspacecinenow.common.model.MovieDto

data class MovieResponse (
    val results: List<MovieDto>
)