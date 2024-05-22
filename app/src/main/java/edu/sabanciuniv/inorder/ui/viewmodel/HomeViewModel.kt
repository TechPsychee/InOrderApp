package edu.sabanciuniv.inorder.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import edu.sabanciuniv.inorder.data.entity.Foods
import edu.sabanciuniv.inorder.data.repo.FoodsRepository
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val foodsRepository: FoodsRepository
) : ViewModel() {

    private val _foodsList = MutableLiveData<List<Foods>>()
    val foodsList: LiveData<List<Foods>> = _foodsList

    fun loadFoods() {
        viewModelScope.launch {
            _foodsList.value = foodsRepository.getAllYemekler()
        }
    }

    fun search(query: String) {
        viewModelScope.launch {
            _foodsList.value = foodsRepository.searchYemekler(query)
        }
    }
}
