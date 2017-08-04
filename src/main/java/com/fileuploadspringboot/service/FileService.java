package com.fileuploadspringboot.service;

import com.fileuploadspringboot.entity.FileMetaData;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by Chary Ragipani on 8/4/2017.
 */
public interface FileService {
    void saveFile(MultipartFile file, FileMetaData fileMetaData);
}
