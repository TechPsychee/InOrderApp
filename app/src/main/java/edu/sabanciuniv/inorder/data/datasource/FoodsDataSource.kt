package edu.sabanciuniv.inorder.data.datasource

import android.util.Log
import edu.sabanciuniv.inorder.data.entity.Foods
import edu.sabanciuniv.inorder.retrofit.FoodsDao


import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class FoodsDataSource(var foodsDao: FoodsDao) {

    suspend fun loadFoods(): List<Foods> = withContext(Dispatchers.IO) {
        return@withContext foodsDao.getAllFoods().foods
    }

}