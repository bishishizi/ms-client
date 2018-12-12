package com.example.ms.client.mvc.service;

import net.coobird.thumbnailator.Thumbnails;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * @author wangwenchang
 * @date 2018/7/27 10:34
 */
@Service
public class ImageService {

    public static void main(String[] args) throws IOException {
        //icon
//        Thumbnails.of("D:\\image\\xx\\1.jpg").size(320, 480).outputQuality(1f).toFile("D:\\image\\1x.jpg");
        Thumbnails.of("D:\\image\\xx\\1.jpg").size(1000, 650).outputQuality(1f).toFile("D:\\image\\1x.jpg");
        Thumbnails.of("D:\\image\\xx\\2.jpg").size(1000, 650).outputQuality(1f).toFile("D:\\image\\2x.jpg");
        Thumbnails.of("D:\\image\\xx\\3.jpg").size(1000, 650).outputQuality(1f).toFile("D:\\image\\3x.jpg");
        Thumbnails.of("D:\\image\\xx\\4.jpg").size(1000, 650).outputQuality(1f).toFile("D:\\image\\4x.jpg");
        Thumbnails.of("D:\\image\\xx\\5.jpg").size(1000, 650).outputQuality(1f).toFile("D:\\image\\5x.jpg");
        Thumbnails.of("D:\\image\\xx\\6.jpg").size(1000, 650).outputQuality(1f).toFile("D:\\image\\6x.jpg");
        System.out.println("success!");
    }
}
