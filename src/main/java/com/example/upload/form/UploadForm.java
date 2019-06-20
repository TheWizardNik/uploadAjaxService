package com.example.upload.form;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.web.multipart.MultipartFile;

@Data
public class UploadForm {

    private String description;
    private MultipartFile[] files;

}
