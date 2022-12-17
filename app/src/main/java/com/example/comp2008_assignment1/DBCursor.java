package com.example.comp2008_assignment1;
import android.database.Cursor;
import android.database.CursorWrapper;

public class DBCursor extends CursorWrapper
{
    public DBCursor(Cursor cursor)
    {
        super(cursor);
    }
}
