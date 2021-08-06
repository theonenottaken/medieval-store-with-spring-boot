package com.cshere.medievalstore.data;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cshere.medievalstore.model.SimpleItem;

public interface ItemRepository extends JpaRepository<Long, SimpleItem> {
}
