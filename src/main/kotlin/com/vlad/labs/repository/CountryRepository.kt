package com.vlad.labs.repository

import com.vlad.labs.entity.CountryEntity
import org.springframework.data.repository.CrudRepository

interface CountryRepository: CrudRepository<CountryEntity, Int> {

    fun findByOrderByName(): List<CountryEntity>
}