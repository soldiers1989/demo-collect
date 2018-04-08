package com.maimieng.mapper;

import com.maimieng.model.FileRel;
import java.util.List;

public interface FileRelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FileRel record);

    FileRel selectByPrimaryKey(Integer id);

    List<FileRel> selectAll();

    int updateByPrimaryKey(FileRel record);
}