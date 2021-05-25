package com.solucoes.brabo.citiesapi.countries;

import com.solucoes.brabo.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
