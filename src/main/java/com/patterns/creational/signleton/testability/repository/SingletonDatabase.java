package com.patterns.creational.signleton.testability.repository;

import com.google.common.collect.Iterables;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

public class SingletonDatabase {

    private Dictionary<String, Integer> capitals = new Hashtable<>();
    private static int instancesCount = 0;
    private static final SingletonDatabase INSTANCE =
            new SingletonDatabase();

    public static SingletonDatabase getInstance()
    {
        return INSTANCE;
    }

    public int getPopulation(String name)
    {
        return capitals.get(name.trim());
    }

    private static int getCount() { return instancesCount; }

    private SingletonDatabase()
    {
        instancesCount++;
        System.out.println("Initializing database ...");

        try {
            File f = new File(
                    SingletonDatabase.class.getProtectionDomain()
                            .getCodeSource().getLocation().getPath()
            );

            Path fullPath = Paths.get(f.getPath(), "Capitals.txt");
            List<String> lines = Files.readAllLines(fullPath);
            Iterables.partition(lines, 2)
                    .forEach(kv -> capitals.put(
                            kv.get(0).trim(),
                            Integer.parseInt(kv.get(1))
                    ));
        }
        catch (Exception e) {
            e.printStackTrace();
        }



    }

}
