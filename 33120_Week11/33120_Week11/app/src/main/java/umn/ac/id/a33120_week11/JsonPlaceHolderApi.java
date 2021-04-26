package umn.ac.id.a33120_week11;

import java.util.List;

import retrofit2.Call;

import retrofit2.http.GET;

public interface JsonPlaceHolderApi
{

    @GET("posts")
    Call<List<Post>> getPosts();
}