package com.rdeconti.listadecontatos.singleton

import com.rdeconti.listadecontatos.feature.listacontatos.model.ContatosVO

object ContatoSingleton {
    var lista: MutableList<ContatosVO> = mutableListOf()
}