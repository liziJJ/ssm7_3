# Java Client

[![build](https://github.com/kubernetes-client/java/workflows/build/badge.svg)](https://github.com/kubernetes-client/java/actions/workflows/maven.yml)
[![Maven Central](https://img.shields.io/maven-central/v/io.kubernetes/client-java.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22io.kubernetes%22%20AND%20a:%22client-java%22)
![Sonatype Nexus (Snapshots)](https://img.shields.io/nexus/s/io.kubernetes/client-java?label=Maven%20Snapshot&server=https%3A%2F%2Foss.sonatype.org)

Java client


# Book &nbsp;
> [!IMPORTANT]
> Project is in init state, and only suitable for use by developers
>

## Cow 🐮

This wise cow is contemplating its fortune from a fortune cookie, suggesting it might find success in unusual challenges, even playfully suggesting taking on a four-year-old."
```text
______________________________________
/ You will be a winner today. Pick a    \
| fight with a four-year-old.           |
|                                      |
\ -- Fortune Cookie                     /
 --------------------------------------
        \   ^__^
         \  (oo)\_______
            (__)\       )\/\
                ||----w |
                ||     ||
```
## Tree File 文件目录
```text
├── ssm7_3-main 2
│   ├── pom.xml
│   ├── src
│   │   ├── main
│   │   │   ├── java
│   │   │   │   └── com
│   │   │   │       └── ljj
│   │   │   │           ├── config
│   │   │   │           │   ├── JdbcConfig.java
│   │   │   │           │   ├── MybatisConfig.java
│   │   │   │           │   ├── ServletConfig.java
│   │   │   │           │   ├── SpringConfig.java
│   │   │   │           │   ├── SpringMvcConfig.java
│   │   │   │           │   └── SpringMvcSupport.java
│   │   │   │           ├── controller
│   │   │   │           │   ├── BookController.java
│   │   │   │           │   ├── Code.java
│   │   │   │           │   ├── ProjectExceptionAdvice.java
│   │   │   │           │   ├── Result.java
│   │   │   │           │   └── interceptor
│   │   │   │           │       ├── ProjectInterceptor.java
│   │   │   │           │       └── ProjectInterceptor2.java
│   │   │   │           ├── dao
│   │   │   │           │   └── BookDao.java
│   │   │   │           ├── domain
│   │   │   │           │   └── Book.java
│   │   │   │           ├── exception
│   │   │   │           │   ├── BusinessException.java
│   │   │   │           │   └── SystemException.java
│   │   │   │           └── service
│   │   │   │               ├── BookService.java
│   │   │   │               └── impl
│   │   │   │                   └── BookServiceImpl.java
│   │   │   ├── resources
│   │   │   │   └── jdbc.properties
│   │   │   └── webapp
│   │   │       ├── WEB-INF
│   │   │       │   └── web.xml
│   │   │       ├── css
│   │   │       │   └── style.css
│   │   │       ├── index.jsp
│   │   │       ├── js
│   │   │       │   ├── axios-0.18.0.js
│   │   │       │   ├── index.js
│   │   │       │   ├── jquery.min.js
│   │   │       │   └── vue.js
│   │   │       ├── pages
│   │   │       │   └── books.html
│   │   │       └── plugins
│   │   │           ├── elementui
│   │   │           │   ├── fonts
│   │   │           │   │   └── element-icons.woff
│   │   │           │   ├── index.css
│   │   │           │   └── index.js
│   │   │           └── font-awesome
│   │   │               ├── css
│   │   │               │   ├── font-awesome.css
│   │   │               │   └── font-awesome.min.css
│   │   │               └── fonts
│   │   │                   ├── FontAwesome.otf
│   │   │                   ├── fontawesome-webfont.eot
│   │   │                   ├── fontawesome-webfont.svg
│   │   │                   ├── fontawesome-webfont.ttf
│   │   │                   ├── fontawesome-webfont.woff
│   │   │                   └── fontawesome-webfont.woff2
│   │   └── test
│   │       └── java
│   │           └── com
│   │               └── ljj
│   │                   └── service
│   │                       └── BookServiceTest.java
│   └── target
│       ├── classes
│       │   └── jdbc.properties
│       ├── generated-sources
│       │   └── annotations
│       └── maven-status
│           └── maven-compiler-plugin
│               └── compile
│                   └── default-compile
│                       ├── createdFiles.lst
│                       └── inputFiles.lst
└── untitled.iml
```
