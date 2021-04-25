package com.mashreq.oa.utils;

public class StringUtils {
public static boolean isNullOrEmpty(String value)
{
	return "".equals(value);
}
public static boolean empty( final String s ) {
	  // Null-safe, short-circuit evaluation.
	  return s == null || s.trim().isEmpty();
	}
}
