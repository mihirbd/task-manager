package com.pixel.taskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.*;
@Repository
public interface SpringRepository extends JpaRepository <Spring, Long> {
}
