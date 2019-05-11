package cn.ynni.exam.utils;

import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

public class MysqlConnection {
    public final static MysqlConnection dbm = new MysqlConnection();
    static InputStream inputStream = null;
    static Properties properties = null;
    Connection connection = null;

//    static {
//        try {
//
//        }
//    }
}
