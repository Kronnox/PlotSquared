package com.intellectualcrafters.plot.config;

import java.io.File;

public class Storage extends Config {

    public static String PREFIX = "";

    public static void save(File file) {
        save(file, Storage.class);
    }

    public static void load(File file) {
        load(file, Storage.class);
    }

    @Comment("MySQL section")
    public static final class MySQL {
        @Comment("Should MySQL be used?")
        public static boolean USE = false;
        public static String HOST = "localhost";
        public static String PORT = "3306";
        public static String USER = "root";
        public static String PASSWORD = "password";
        public static String DATABASE = "plot_db";
    }

    @Comment("SQLite section")
    public static final class SQLite {
        @Comment("Should SQLite be used?")
        public static boolean USE = true;
        @Comment("The file to use")
        public static String DB = "storage";
    }

}
