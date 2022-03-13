package com.tsymq;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class app {
    public static void main(String[] args) {
        String re = "config.xml";
        Reader reader;
        try {
            reader = Resources.getResourceAsReader(re);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
