package com.fileuploadspringboot.repository;

import com.fileuploadspringboot.entity.FileMetaData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Chary Ragipani on 8/4/2017.
 */
@Repository
public interface FileRepo extends CrudRepository<FileMetaData,Long> {
}
