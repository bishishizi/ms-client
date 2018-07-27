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
        Thumbnails.of("D:\\image\\1p.jpg").size(1000, 650).outputQuality(1f).toFile("D:\\image\\21.jpg");
        Thumbnails.of("D:\\image\\2p.jpg").size(1000, 650).outputQuality(1f).toFile("D:\\image\\22.jpg");
        Thumbnails.of("D:\\image\\3p.jpg").size(1000, 650).outputQuality(1f).toFile("D:\\image\\23.jpg");
        Thumbnails.of("D:\\image\\4p.jpg").size(1000, 650).outputQuality(1f).toFile("D:\\image\\24.jpg");
        Thumbnails.of("D:\\image\\4p.jpg").size(1000, 650).outputQuality(1f).toFile("D:\\image\\25.jpg");
        Thumbnails.of("D:\\image\\6p.jpg").size(1000, 650).outputQuality(1f).toFile("D:\\image\\26.jpg");
    }
}
