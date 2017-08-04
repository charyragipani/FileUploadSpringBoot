package com.fileuploadspringboot.controller;

import com.fileuploadspringboot.entity.FileMetaData;
import com.fileuploadspringboot.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

/**
 * Created by Chary Ragipani on 8/4/2017.
 */
@RestController
public class FileController {

    @Autowired
    FileService fileService;

    @RequestMapping(value = "/upload", produces = "application/json")
    public FileMetaData uploadFile(@RequestParam MultipartFile file, @RequestParam String userId){
        FileMetaData fileMetaData = new FileMetaData();
        fileMetaData.setUploadTime(new Date());
        fileMetaData.setUserId(userId);
        fileMetaData.setFileName(file.getOriginalFilename());
        fileService.saveFile(file, fileMetaData);
        return fileMetaData;
    }
}
