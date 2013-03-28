package edu.ntu.arbor.sbchao.androidlogger.scheme;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.DaoConfig;
import de.greenrobot.dao.Property;

import edu.ntu.arbor.sbchao.androidlogger.scheme.MobileLog;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table MOBILE_LOG.
*/
public class MobileLogDao extends AbstractDao<MobileLog, Long> {

    public static final String TABLENAME = "MOBILE_LOG";

    /**
     * Properties of entity MobileLog.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property DeviceId = new Property(1, String.class, "deviceId", false, "DEVICE_ID");
        public final static Property Time = new Property(2, java.util.Date.class, "time", false, "TIME");
        public final static Property DayOfWeek = new Property(3, int.class, "dayOfWeek", false, "DAY_OF_WEEK");
        public final static Property HourOfDay = new Property(4, int.class, "hourOfDay", false, "HOUR_OF_DAY");
        public final static Property RecordFreq = new Property(5, int.class, "recordFreq", false, "RECORD_FREQ");
        public final static Property BatStatus = new Property(6, int.class, "batStatus", false, "BAT_STATUS");
        public final static Property BatPct = new Property(7, double.class, "batPct", false, "BAT_PCT");
        public final static Property GpsStatus = new Property(8, int.class, "gpsStatus", false, "GPS_STATUS");
        public final static Property NetworkStatus = new Property(9, int.class, "networkStatus", false, "NETWORK_STATUS");
        public final static Property WifiState = new Property(10, String.class, "wifiState", false, "WIFI_STATE");
        public final static Property MobileState = new Property(11, String.class, "mobileState", false, "MOBILE_STATE");
        public final static Property ProcessCurrentPackage = new Property(12, String.class, "processCurrentPackage", false, "PROCESS_CURRENT_PACKAGE");
        public final static Property IsLowMemory = new Property(13, boolean.class, "isLowMemory", false, "IS_LOW_MEMORY");
        public final static Property IsUsing = new Property(14, boolean.class, "isUsing", false, "IS_USING");
        public final static Property LocAcc = new Property(15, Double.class, "locAcc", false, "LOC_ACC");
        public final static Property Lat = new Property(16, Double.class, "lat", false, "LAT");
        public final static Property Lon = new Property(17, Double.class, "lon", false, "LON");
        public final static Property LocProvider = new Property(18, String.class, "locProvider", false, "LOC_PROVIDER");
        public final static Property Speed = new Property(19, Double.class, "speed", false, "SPEED");
    };


    public MobileLogDao(DaoConfig config) {
        super(config);
    }
    
    public MobileLogDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'MOBILE_LOG' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'DEVICE_ID' TEXT NOT NULL ," + // 1: deviceId
                "'TIME' INTEGER NOT NULL ," + // 2: time
                "'DAY_OF_WEEK' INTEGER NOT NULL ," + // 3: dayOfWeek
                "'HOUR_OF_DAY' INTEGER NOT NULL ," + // 4: hourOfDay
                "'RECORD_FREQ' INTEGER NOT NULL ," + // 5: recordFreq
                "'BAT_STATUS' INTEGER NOT NULL ," + // 6: batStatus
                "'BAT_PCT' REAL NOT NULL ," + // 7: batPct
                "'GPS_STATUS' INTEGER NOT NULL ," + // 8: gpsStatus
                "'NETWORK_STATUS' INTEGER NOT NULL ," + // 9: networkStatus
                "'WIFI_STATE' TEXT NOT NULL ," + // 10: wifiState
                "'MOBILE_STATE' TEXT NOT NULL ," + // 11: mobileState
                "'PROCESS_CURRENT_PACKAGE' TEXT NOT NULL ," + // 12: processCurrentPackage
                "'IS_LOW_MEMORY' INTEGER NOT NULL ," + // 13: isLowMemory
                "'IS_USING' INTEGER NOT NULL ," + // 14: isUsing
                "'LOC_ACC' REAL," + // 15: locAcc
                "'LAT' REAL," + // 16: lat
                "'LON' REAL," + // 17: lon
                "'LOC_PROVIDER' TEXT," + // 18: locProvider
                "'SPEED' REAL);"); // 19: speed
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'MOBILE_LOG'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, MobileLog entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getDeviceId());
        stmt.bindLong(3, entity.getTime().getTime());
        stmt.bindLong(4, entity.getDayOfWeek());
        stmt.bindLong(5, entity.getHourOfDay());
        stmt.bindLong(6, entity.getRecordFreq());
        stmt.bindLong(7, entity.getBatStatus());
        stmt.bindDouble(8, entity.getBatPct());
        stmt.bindLong(9, entity.getGpsStatus());
        stmt.bindLong(10, entity.getNetworkStatus());
        stmt.bindString(11, entity.getWifiState());
        stmt.bindString(12, entity.getMobileState());
        stmt.bindString(13, entity.getProcessCurrentPackage());
        stmt.bindLong(14, entity.getIsLowMemory() ? 1l: 0l);
        stmt.bindLong(15, entity.getIsUsing() ? 1l: 0l);
 
        Double locAcc = entity.getLocAcc();
        if (locAcc != null) {
            stmt.bindDouble(16, locAcc);
        }
 
        Double lat = entity.getLat();
        if (lat != null) {
            stmt.bindDouble(17, lat);
        }
 
        Double lon = entity.getLon();
        if (lon != null) {
            stmt.bindDouble(18, lon);
        }
 
        String locProvider = entity.getLocProvider();
        if (locProvider != null) {
            stmt.bindString(19, locProvider);
        }
 
        Double speed = entity.getSpeed();
        if (speed != null) {
            stmt.bindDouble(20, speed);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public MobileLog readEntity(Cursor cursor, int offset) {
        MobileLog entity = new MobileLog( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getString(offset + 1), // deviceId
            new java.util.Date(cursor.getLong(offset + 2)), // time
            cursor.getInt(offset + 3), // dayOfWeek
            cursor.getInt(offset + 4), // hourOfDay
            cursor.getInt(offset + 5), // recordFreq
            cursor.getInt(offset + 6), // batStatus
            cursor.getDouble(offset + 7), // batPct
            cursor.getInt(offset + 8), // gpsStatus
            cursor.getInt(offset + 9), // networkStatus
            cursor.getString(offset + 10), // wifiState
            cursor.getString(offset + 11), // mobileState
            cursor.getString(offset + 12), // processCurrentPackage
            cursor.getShort(offset + 13) != 0, // isLowMemory
            cursor.getShort(offset + 14) != 0, // isUsing
            cursor.isNull(offset + 15) ? null : cursor.getDouble(offset + 15), // locAcc
            cursor.isNull(offset + 16) ? null : cursor.getDouble(offset + 16), // lat
            cursor.isNull(offset + 17) ? null : cursor.getDouble(offset + 17), // lon
            cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18), // locProvider
            cursor.isNull(offset + 19) ? null : cursor.getDouble(offset + 19) // speed
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, MobileLog entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setDeviceId(cursor.getString(offset + 1));
        entity.setTime(new java.util.Date(cursor.getLong(offset + 2)));
        entity.setDayOfWeek(cursor.getInt(offset + 3));
        entity.setHourOfDay(cursor.getInt(offset + 4));
        entity.setRecordFreq(cursor.getInt(offset + 5));
        entity.setBatStatus(cursor.getInt(offset + 6));
        entity.setBatPct(cursor.getDouble(offset + 7));
        entity.setGpsStatus(cursor.getInt(offset + 8));
        entity.setNetworkStatus(cursor.getInt(offset + 9));
        entity.setWifiState(cursor.getString(offset + 10));
        entity.setMobileState(cursor.getString(offset + 11));
        entity.setProcessCurrentPackage(cursor.getString(offset + 12));
        entity.setIsLowMemory(cursor.getShort(offset + 13) != 0);
        entity.setIsUsing(cursor.getShort(offset + 14) != 0);
        entity.setLocAcc(cursor.isNull(offset + 15) ? null : cursor.getDouble(offset + 15));
        entity.setLat(cursor.isNull(offset + 16) ? null : cursor.getDouble(offset + 16));
        entity.setLon(cursor.isNull(offset + 17) ? null : cursor.getDouble(offset + 17));
        entity.setLocProvider(cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18));
        entity.setSpeed(cursor.isNull(offset + 19) ? null : cursor.getDouble(offset + 19));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(MobileLog entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(MobileLog entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
