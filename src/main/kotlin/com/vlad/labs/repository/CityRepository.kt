package com.vlad.labs.repository

import com.vlad.labs.entity.CityEntity
import com.vlad.labs.entity.CountryEntity
import org.springframework.data.repository.CrudRepository

interface CityRepository:CrudRepository<CityEntity, Int> {

    fun deleteAllByCountry(country: CountryEntity)
}