package com.example.pokemonjetpackcompose.pokemondetail

import androidx.lifecycle.ViewModel
import com.example.pokemonjetpackcompose.data.remote.responses.Pokemon
import com.example.pokemonjetpackcompose.repository.PokemonRepository
import com.example.pokemonjetpackcompose.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepository
) : ViewModel() {
    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon> {
        return repository.getPokemonInfo(pokemonName)
    }
}