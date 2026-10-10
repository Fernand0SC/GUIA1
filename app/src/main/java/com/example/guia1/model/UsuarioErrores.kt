package com.example.guia1.model

//modelo principal que representa el estado del formulario del usuario
data class UsuarioErrores (
    val nombre: String? = null,
    val correo: String? = null,
    val clave: String? = null,
    val direccion: String? = null
)
