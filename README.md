# Allay Groovy Plugin Template
Welcome to ues groovy to write Allay Plugin

## Prerequidites

- Java 21 higher.
- Allay installed.

## Getting Started

1. **Clone this Repository**

```bash
git clone https://github.com/NewmoomCat/allay-groovy-plugin-template
```

2. **Navigate to the Cloned Directory**

```bash
cd allay-groovy-plugin-template
```

3. **Change Plugin Information**

- Rename package name from `org.allaymc.groovyplugintemplate` to `your.group.name.and.pluginname`
- Edit [build.gradle](build.gradle.kts) and [settings.gradle](settings.gradle)
- Update API version in [build.gradle](build.gradle) to the latest version (see TODO).
  You can find the latest version here: https://central.sonatype.com/artifact/org.allaymc.allay/api
- Edit [plugin.json](src/main/resources/plugin.json)
- Reload gradle

4. **Build and Run Your Plugin**

```bash
gradlew shadowJar
```

This command will produce a `.jar` file in the `build/libs` directory.
Copy the `.jar` file to the `plugins` directory of your allay server.
Start the allay server and check the logs to ensure your plugin loads and operates
as expected.

5. **Test Your Plugin in Gradle**

```bash
gradlew runServer
```

This command will start an allay server with your plugin loaded.
Then close allay server by clicking `X` in the dashboard window.

## Documentation

For a deeper dive into the Allay API and its functionalities, please refer to our [documentation](https://docs.allaymc.org) (WIP).

6. **Precautions**

Groovy is compatible with Java syntax, but there are some differences.
So pay attention to grammar when writing.
