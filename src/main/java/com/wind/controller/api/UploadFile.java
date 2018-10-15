package com.wind.controller.api;

import com.wind.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

/**
 * 文件上传
 */
@Controller
@RequestMapping("/file")
public class UploadFile {

    @RequestMapping("/init")
    @ResponseBody
    public User init() {
        return new User("uuu", "dd", "123", "kk");
    }

    private static final String UPLOAD_DIR = "./"; // 磁盘路径；当前为 tomcat/bin/
    private static final long MAX_FILE_SISE = 1000000;

    @RequestMapping("/upload")
    @ResponseBody
    public String uploadFile(@RequestParam("file") MultipartFile file) {
        if(!file.isEmpty()) {
            //获取文件类型
            String contentType = file.getContentType();
            if(!contentType.equals("")) {
                //可以对文件类型进行检查
            }
            //获取input域的name属性
            String name = file.getName();
            //获取文件名，带扩展名
            String originFileName = file.getOriginalFilename();
            //获取文件扩展名
            String extension = originFileName.substring(originFileName.lastIndexOf("."));
            System.out.println(extension);
            //获取文件大小，单位字节
            long site = file.getSize();
            if(site > MAX_FILE_SISE) {
                //可以对文件大小进行检查
            }
            //构造文件上传后的文件绝对路径，这里取系统时间戳＋文件名作为文件名
            //不推荐这么写，这里只是举例子，这么写会有并发问题
            //应该采用一定的算法生成独一无二的的文件名
            String fileName = UPLOAD_DIR + String.valueOf(System.currentTimeMillis()) + extension;
            try {
                file.transferTo(new File(fileName));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else {
            return "error";
        }

        return "success";
    }
}
