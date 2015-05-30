package com.cyanca.todolist.db;

import android.provider.BaseColumns;

public class TaskContract {
    public static final String DB_NAME = "com.cyanca.todolist.db.task";
    public static final int DB_VERSION = 1;
    public static final String TABLE = "task";

    public class Columns {
        public static final String TASK = "task";
        public static final String _ID = BaseColumns._ID;
    }
}