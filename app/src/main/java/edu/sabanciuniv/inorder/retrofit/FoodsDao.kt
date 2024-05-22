package edu.sabanciuniv.inorder.retrofit

import edu.sabanciuniv.inorder.data.entity.FoodsResponse
import retrofit2.http.GET

interface FoodsDao {
    @GET("yemekler/tumYemekleriGetir.php")
    suspend fun getAllFoods(): FoodsResponse
}