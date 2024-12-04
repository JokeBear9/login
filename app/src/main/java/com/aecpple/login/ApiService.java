package com.aecpple.login;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiService {
    @POST("/addUSER")
    Call<ResponseBody> addUser(@Body User user);
}
