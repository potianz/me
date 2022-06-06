package com.zyh.repositiony;

import com.zyh.entry.FoodEntry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaRepositiony  extends JpaRepository<FoodEntry,Long> {
}
