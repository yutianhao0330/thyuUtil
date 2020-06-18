package com.thyu.common.utils;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 *
 * @ClassName: DateUtil
 * @Description: 处理文件上传的工具类
 * @author thyu
 * @date 2020年6月18日
 *
 */
public class UploadUtil {
    public static String upload(MultipartFile myfile) throws  IOException{
        String fileName =  "";
        if(null!=myfile && !myfile.isEmpty()){
            String oldName = myfile.getOriginalFilename();
            fileName = UUID.randomUUID().toString()+oldName.substring(oldName.lastIndexOf("."));
            File file = new File("E:/upload/boot",fileName);
            if(!file.getParentFile().exists()){
                file.mkdirs();
            }
            myfile.transferTo(file);
        }
        return fileName;
    }

    public static List<String> upload(MultipartFile[] myfiles) throws  IOException{
        List<String> fileNames = new ArrayList<>();
        for(int i=0;i<myfiles.length;i++){
            String fileName = upload(myfiles[i]);
            fileNames.add(fileName);
        }
        return fileNames;
    }
}
