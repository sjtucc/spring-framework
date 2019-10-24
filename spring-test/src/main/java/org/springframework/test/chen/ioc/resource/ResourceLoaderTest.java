package org.springframework.test.chen.ioc.resource;

import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

/**
 * @Description:
 * @author chenchen
 * @date 2019/10/15 10:28
 */
public class ResourceLoaderTest {

	public static void main(String[] args) {
		ResourceLoader resourceLoader = new DefaultResourceLoader();

		Resource fileResource1 = resourceLoader.getResource("D:/Users/chenming673/Documents/spark.txt");
		System.out.println("fileResource1 is FileSystemResource:" + (fileResource1 instanceof FileSystemResource));

	}
}
