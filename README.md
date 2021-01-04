# OSGiRay - Subsystem test app

## Overview

Documentation:

* https://docs.osgi.org/specification/osgi.cmpn/7.0.0/service.subsystem.html ( Subsystem Service Specification )
* https://liferay.dev/blogs/-/blogs/osgi-subsystems-and-why-you-want-them ( Good blog post and was also my starting point )
* http://aries.apache.org/modules/subsystems.html
* http://coderthoughts.blogspot.com/2013/04/osgi-subsystems.html

Example code repos:

* https://github.com/coderthoughts/subsystem-examples
* https://github.com/dnebing/subsystem-sample

## Prerequisites

### Install Liferay

Install Liferay 7.3.6 or DXP 7.3

Make sure that gogo shell is enabled, but adding 

```
module.framework.properties.osgi.console=0.0.0.0:11311
```

to `portal-ext.properties`.

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

Subsystem type : feature 

```
g! subsystem:install file:<this path here>/osgiray-modules/osgiray-feature-esa/target/org.osgiray.subsystems.feature-1.0.0.esa
```

Subsystem type: composite

```
g! subsystem:install file:<this path here>/osgiray-modules/osgiray-composite-esa/target/org.osgiray.subsystems.composite-1.0.0.esa
```

