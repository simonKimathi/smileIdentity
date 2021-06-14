package selfie.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Random;

public class StringUtil {
    public static String toString(Object o) {
        return String.valueOf(o);
    }

    public static String toJsonString(Object o) {
        try {
            return new ObjectMapper().writeValueAsString(o);
        } catch (JsonProcessingException e) {
            return null;
        }
    }

    public static double toDouble(String s) {
        try {
            return Double.parseDouble(s);
        } catch (Exception ignored) {
        }
        return 0.0;
    }

    public static Class<?> map(String s, Class<?> c) {
        try {
            return (Class<?>) new ObjectMapper().readValue(s, c);
        } catch (IOException ignored) {
        }
        return null;
    }

    public static String generateRandomPassword(int len) {
        String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%&";
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++)
            sb.append(chars.charAt(rnd.nextInt(chars.length())));
        return sb.toString();
    }

    public static Object defaultValue(Object s) {
        return s != null ? s : "";
    }

    public static Object defaultValue(Object s, Object defaultV) {
        return s != null ? s : defaultV;
    }
}
