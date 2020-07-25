### Maven

Estos proyectos _Maven_ se crearon utilizando el siguiente comando desde la terminal:  
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
