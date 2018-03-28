package com.example.lieberson.projetogsw.model.service;

import com.example.lieberson.projetogsw.BuildConfig;
import com.example.lieberson.projetogsw.model.Repository;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface Api {
    @GET("/repositories")
    @Headers({"Accept:application/vnd.github.v3+json",
            "Authorization:" + BuildConfig.TOKEN_1 + BuildConfig.TOKEN_2})
    Call<List<Repository>> getRepositories();
}
