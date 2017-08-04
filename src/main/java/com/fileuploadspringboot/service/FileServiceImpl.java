package com.fileuploadspringboot.service;

import com.fileuploadspringboot.entity.FileMetaData;
import com.fileuploadspringboot.repository.FileRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Chary Ragipani on 8/4/2017.
 */
@Service
public class FileServiceImpl implements FileService {

    private final Path uploadDir = Paths.get("uploads");

    @Autowired
    private FileRepo fileRepo;

    @Override
    public void saveFile(MultipartFile file, FileMetaData fileMetaData){
        fileRepo.save(fileMetaData);
        try {
            Files.copy(file.getInputStream(), this.uploadDir.resolve(file.getOriginalFilename()));
        } catch (Exception e){
            throw new RuntimeException("failed to upload");
        }
    }
}
