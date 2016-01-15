/**
 * @date: 2014年8月6日
 * @copyright: copyright (c) 2014,etonenet.com All Rights Reserved.
 */
package com.swell.tutorial.druid.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.env.Environment;

/**
 * 
 * AppConfig
 *
 * @author JoeHe
 * @class com.et.config.AppConfig
 * @date 2014年8月7日 上午8:58:22
 * @since 1.0
 */
@Configuration

@Import(value = {JpaConfig.class})
public class AppConfig {

  @Autowired
  Environment env;


}
