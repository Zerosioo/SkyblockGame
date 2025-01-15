package me.zero.skyblock.util;

import me.zero.skyblock.commands.abstraction.SkyBlockCommand;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Modifier;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public class ReflectionsReplacement {

    /**
     * Finds all classes in the specified package that extend SkyBlockCommand.
     *
     * @param packageName the package to scan.
     * @return a list of SkyBlockCommand classes.
     */
    public static List<Class<? extends SkyBlockCommand>> getSubTypesOf(String packageName) {
        List<Class<? extends SkyBlockCommand>> commandClasses = new ArrayList<>();
        JarFile jar = null;

        try {
            // Locate the jar file by checking all loaded URLs
            URL jarUrl = null;
            URLClassLoader classLoader = (URLClassLoader) ReflectionsReplacement.class.getClassLoader();
            for (URL url : classLoader.getURLs()) {
                if (url.getPath().endsWith(".jar")) {
                    jarUrl = url;
                    break;
                }
            }

            if (jarUrl == null || jarUrl.getPath() == null) {
                throw new IOException("Failed to locate jar file for scanning classes.");
            }

            File jarFile = new File(jarUrl.getPath());
            if (!jarFile.isFile()) {
                throw new IOException("Jar file not found: " + jarFile.getPath());
            }

            jar = new JarFile(jarFile);
            Enumeration<JarEntry> entries = jar.entries();

            while (entries.hasMoreElements()) {
                JarEntry entry = entries.nextElement();
                String name = entry.getName();

                if (name.endsWith(".class") && name.startsWith(packageName.replace('.', '/'))) {
                    String className = name.replace('/', '.').replace(".class", "");

                    try {
                        // Load the class
                        Class<?> clazz = Class.forName(className);

                        // Check if the class extends SkyBlockCommand
                        if (SkyBlockCommand.class.isAssignableFrom(clazz)
                                && !clazz.isInterface()
                                && !Modifier.isAbstract(clazz.getModifiers())) {

                            @SuppressWarnings("unchecked")
                            Class<? extends SkyBlockCommand> commandClass = (Class<? extends SkyBlockCommand>) clazz;
                            commandClasses.add(commandClass);
                        }
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (jar != null) {
                try {
                    jar.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return commandClasses;
    }
}
