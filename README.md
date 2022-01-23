# Longan Forge Development Environment
[![Java](https://img.shields.io/badge/Java-1.8-informational)](http://openjdk.java.net/)
[![Discord](https://img.shields.io/discord/796913369177260052)](https://discord.gg/FmVPsapuEk)
## 一、前言

基于Gradle 7.0，LonganForgeGradle-1.2，开发的LonganForge，使用了Aliyun的Maven储存库对比原来的ForgeMaven

longan-forge-gradle： [LonganForgeGradle by beanflame](https://github.com/longan-studio/longan-forge-gradle).

国内访问速度大幅提升，Gradle7.0更加简单轻便，支持更多拓展
**支持使用Kotlin,Scala等JVM语言开发Mod**

**注意：**

1. **建议Longan-Forge自带的OpenJDK**
2. **Longan-Forge自带的OpenJDK版本为"OpenJDK8U_8u292-x86_Windows_HotSpot"**
3. **电脑内存配置建议大于4G以便于反编译MineCraft本体**
4. **千万不要在非官方的网站下载Longan-Forge，非官方的Longan-Forge可能被篡改**
5. **有任何构建、部署问题或项目bug请发issue或者加QQ群。**
6. **如果要对本项目进行商业化，请在Readme上方部Powered by指向本仓库地址，顺便点上star收藏本项目对开发者的支持，谢谢。**

## 二、部署

LonganForge已自带JDK的可以执行以下命令快速部署

**注意：**

**1. 正式部署请自行修改配置，不要使用build.gradle中默认配置的值，例如version、group、archivesBaseName的值**

**2. 如果已经为了测试而使用默认配置启动来部署，建议删掉用户名/.gradle文件夹，重新执行以下部署流程**

```shell
gradle build #等待出现 Build Succeed的字样出现
```

根据网速情况，大约五到十分钟即可安装完毕，全程无需人工干预。

```shell
gradle runClient # 运行MineCraft Client
```

## 三、更新

请在在Longan-Forge的官网得到Longan-Forge的更新，文件将以压缩包的形式上传，同时也会上传哈希值等以校验文件是否被篡改。

## 四、上线日记

| 时间       | 内容                                                         | 更新者   |
| ---------- |------------------------------------------------------------ | -------- |
| 2021-8-11 | 添加镜像站、支持改写镜像站                                                    | BeanFlame |
