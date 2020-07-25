## Maven

Estos proyectos _Maven_ se crearon utilizando el comandos desde la terminal, para el proyecto _bootcampgl_ se
utilizo los siguientes comando desde la terminal:  
```
mvn archetype:generate -DgroupId="com.globallogic.myapp" -DartifactId="bootcampgl" -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion="1.0" -DinteractiveMode=false
```

Luego se tenia que agregar las dependencias Log4j que para eso, se tenia que modificar el archivo pom.xml y agregar lo siguiente:
```
groupId: org.apache.logging.log4j artifactId: log4j-api version: 2.13.3
groupId: org.apache.logging.log4j artifactId: log4j-core version: 2.13.3
```

Luego se tenia que descargar las dependencias por medio de otro comando:
```
mvn dependency:resolve
```

Para el siguiente proyecto _Maven_ _bootcampgl2020_ se realizo practicamente el mismo procedimiento pero solamente se agregaron las siguientens 
dependencias: 
```
groupId: org.junit.jupiter artifactId: junit-jupiter-engine version: 5.1.0 scope: test
groupId: org.junit.platform artifactId: junit-platform-surefire-provider version: 1.0.0
groupId: org.slf4j artifactId: slf4j-simple version: 1.7.30
```
Luego se tenia que modificar el archivo pom.xml agregando la siguiente dependencia:
```
groupId: io.micrometer artifactId: micrometer-core version: 1.5.2
```
Por último se tenia que agregar a la anterior dependencia una exclusión
```
groupId: org.apache.tomcat.embed artifactId: tomcat-embed-core
```













