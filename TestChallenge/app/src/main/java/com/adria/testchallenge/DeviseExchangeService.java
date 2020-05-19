package com.adria.testchallenge;

import retrofit2.Call;
import retrofit2.http.GET;

public interface DeviseExchangeService {

    @GET("latest")
    Call<DeviseExchange> loadDeviseExchange();

}
