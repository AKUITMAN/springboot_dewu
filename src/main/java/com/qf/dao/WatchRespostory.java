package com.qf.dao;

import com.qf.pojo.User;
import com.qf.pojo.Watch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WatchRespostory extends JpaRepository<Watch,Integer> {
}
