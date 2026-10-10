package com.example.guia1.viewmodel

import androidx.lifecycle.ViewModel
import com.example.guia1.model.UsuarioUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

class UsuarioViewModel : ViewModel() {

    //estado interno mutable
    private val _estado = MutableStateFlow(UsuarioUiState())

    //estado expuesto para la UI
    val estado: StateFlow<UsuarioUiState> = _estado

    //actualiza el campo nombre y limpia  su error
    fun onNombreChange(valor: String){
        _estado.update { it.copy(nombre = valor, errores = it.errores.copy(nombre = null)) }
    }

    //actualiza el campo correo
    fun onCorreoChange(valor: String){
        _estado.update { it.copy() }
    }
}