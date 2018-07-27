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
        Thumbnails.of("D:\\image\\2.jpg").size(800, 470).outputQuality(1f).toFile("D:\\image\\compress.jpg");
    }
}
