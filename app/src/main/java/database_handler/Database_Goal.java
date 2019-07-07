package database_handler;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Suman Singh on 29-08-2016.
 */
public class Database_Goal extends SQLiteOpenHelper {

    // All Static variables
    // Database Version
    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "myGoal";

    // Contacts table name
    private static final String TABLE_CONTACTS = "Goals";

    // Contacts Table Columns names
    private static final String KEY_ID = "goalid";
    private static final String KEY_NAME = "goalname";

    public Database_Goal(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    // Creating Tables
    @Override
    public void onCreate(SQLiteDatabase db) {

        String Goal_setup = "CREATE TABLE Goal_Name(KEY_ID INTEGER PRIMARY KEY,Goal_NAME TEXT)";
        db.execSQL(Goal_setup);

        String Goal_Detail = "CREATE TABLE Goal_Detail " +
                "(OtherKEY_ID INTEGER PRIMARY KEY, Date INTEGER PRIMARY KEY, Target INTEGER PRIMARY KEY, " +
                "Actual INTEGER PRIMARY KEY, Result INTEGER PRIMARY KEY)";

        String MY_QUERY = "SELECT * FROM Goal_Name a INNER JOIN Goal_Detail b ON a.KEY_ID=b.OtherKEY_ID WHERE b.Goal_NAME=?";

//        db.rawQuery(MY_QUERY, new String[]{String.valueOf(propertyId)});
    }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_CONTACTS);

        // Create tables again
        onCreate(db);
    }
}
