package org.example.bt_nangcapungdungquanlycauthubongda_validate.service;




import org.example.bt_nangcapungdungquanlycauthubongda_validate.model.Player;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Optional;

public interface IPlayerService {
    Page<Player> findAll(int page, int size, String sort, String name, LocalDate dobMin, LocalDate dobMax);

    Optional<Player> findById(Long id);

    void save(Player player);
    void remove(Long id);

    Page<Player> findAllByNameContaining(String search,Pageable pageable);

    Page<Player> findAllAndSort(String sort);
    Page<Player> getPlayer(int page, int size, String name, LocalDate dobMin, LocalDate dobMax);
}
