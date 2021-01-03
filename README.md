# OSGiRay - Subsystem test app

## Overview

To read:

* https://liferay.dev/blogs/-/blogs/osgi-subsystems-and-why-you-want-them ( good blog post)

Code repos:

* https://github.com/coderthoughts/subsystem-examples
* 

## Prerequisites

### Install Liferay

Install Liferay 7.3.6 or DXP 7.3

### Deploy additional artifacts

Deploy following artifacts to your DXP

| Group ID                   | Artifact ID                             | Version                  | Link                                                         |
| -------------------------- | --------------------------------------- | ------------------------ | ------------------------------------------------------------ |
| org.apache.aries.subsystem | org.apache.aries.subsystem.api          | 2.0.10                   | ` wget https://repo1.maven.org/maven2/org/apache/aries/subsystem/org.apache.aries.subsystem.api/2.0.10/org.apache.aries.subsystem.api-2.0.10.jar ` |
| org.apache.aries.subsystem | org.apache.aries.subsystem.core         | 2.0.10                   | `wget https://repo1.maven.org/maven2/org/apache/aries/subsystem/org.apache.aries.subsystem.core/2.0.10/org.apache.aries.subsystem.core-2.0.10.jar` |
| org.apache.aries           | org.apache.aries.util                   | 1.1.3                    | `wget https://repo1.maven.org/maven2/org/apache/aries/org.apache.aries.util/1.1.3/org.apache.aries.util-1.1.3.jar` |
| org.apache.felix           | org.apache.felix.coordinator            | 1.0.0                    | `wget http://repo1.maven.org/maven2/org/apache/felix/org.apache.felix.coordinator/1.0.0/org.apache.felix.coordinator-1.0.0.jar` |
| org.eclipse.equinox        | org.eclipse.equinox.region              | 1.2.101.v20150831-1342   | `wget [http://repo1.maven.org/maven2/org/eclipse/equinox /org.eclipse.equinox.region/1.2.101.v20150831-1342/org.eclipse.equinox.region-1.2.101.v20150831-1342.jar` |
| org.slf4j                  | slf4j-api                               | 1.7.30                   | `wget <https://repo1.maven.org/maven2/org/slf4j/slf4j-api/1.7.30/slf4j-api-1.7.30.jar>` |
| org.apache.aries.subsystem | org.apache.aries.subsystem.gogo-command | 1.0.0                    | `wget [https://repo1.maven.org/maven2/org/apache/aries/subsystem /org.apache.aries.subsystem.gogo-command/1.0.0/org.apache.aries.subsystem.gogo-command-1.0.0.jar` |
| com.liferay                | org.apache.felix.fileinstall            | 3.6.4.LIFERAY-PATCHED-24 | wget `https://repo1.maven.org/maven2/com/liferay/org.apache.felix.fileinstall/3.6.4.LIFERAY-PATCHED-24/org.apache.felix.fileinstall-3.6.4.LIFERAY-PATCHED-24.jar` |

Build:

https://github.com/sammso/slf4j-liferay

and deploy it also

## Build

```
mvn clean package
```



## Deploy 

Goto gogo shell:

Deploy esa:

Subsystem type : application 

```
subsystem:install file://<your osgiray-subsystem location>/osgiray-application-esa/target/org.osgiray.subsystems.application-1.0.0.esa
```