package com.vlad.labs.service

import com.vlad.labs.model.CountryDto

interface CountryService {

    fun getAll(): List<CountryDto>

    fun findById(id: Int): CountryDto

    fun create(dto: CountryDto): Int

    fun update(id: Int, dto: CountryDto)

    fun delete(id: Int)
}