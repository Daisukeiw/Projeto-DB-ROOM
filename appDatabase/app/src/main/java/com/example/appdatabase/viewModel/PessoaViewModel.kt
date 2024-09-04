package com.example.appdatabase.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.appdatabase.roomDB.Pessoa
import kotlinx.coroutines.launch

class PessoaViewModel(private val repository: Repository) : ViewModel() {
    fun upsertPessoa(pessoa: Pessoa){
        viewModelScope.launch {
            repository.upsertPessoa(pessoa)
        }
    }
    fun deletePessoa(pessoa: Pessoa){
        viewModelScope.launch {
            repository.deletePessoa(pessoa)
        }
    }
}