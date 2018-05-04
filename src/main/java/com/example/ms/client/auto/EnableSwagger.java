package com.example.ms.client.auto;

import com.example.ms.client.config.SwaggerConfig;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author wangwenchang
 * @date 2018/5/3 15:33
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({SwaggerConfig.class})
public @interface EnableSwagger {
}
