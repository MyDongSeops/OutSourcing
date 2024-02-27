package com.sparta.outsourcing.repository;

import com.sparta.outsourcing.entity.Menu;
import com.sparta.outsourcing.entity.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MenuRepository extends JpaRepository<Menu, Long> {
    List<Menu> findAllByOwner(Owner owner);
}
