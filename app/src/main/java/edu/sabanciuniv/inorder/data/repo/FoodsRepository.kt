package edu.sabanciuniv.inorder.data.repo

import edu.sabanciuniv.inorder.data.entity.Foods
import edu.sabanciuniv.inorder.retrofit.FoodsDao
import javax.inject.Inject

class FoodsRepository @Inject constructor(
    private val foodsDao: FoodsDao

) {
    suspend fun getAllYemekler() = emptyList<Foods>()
    suspend fun searchYemekler(query: String) = emptyList<Foods>()
}
