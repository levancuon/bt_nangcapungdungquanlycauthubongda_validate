package org.example.bt_nangcapungdungquanlycauthubongda_validate.service;


import org.example.bt_nangcapungdungquanlycauthubongda_validate.model.Club;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IClubService  {
    Iterable<Club> findAll();
}
