package com.fileuploadspringboot.entity;

import java.util.Date;
import javax.persistence.*;

/**
 * Created by Chary Ragipani on 8/4/2017.
 */
@Entity
@Table(name="file")
public class FileMetaData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "userId")
    private String userId;

    @Column(name = "fileName")
    private String fileName;

    @Column(name = "uploadTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date uploadTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

}
