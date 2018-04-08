package com.maimieng.mapper;

import com.maimieng.model.Favorited;
import java.util.List;

public interface FavoritedMapper {
    int insert(Favorited record);

    List<Favorited> selectAll();
}