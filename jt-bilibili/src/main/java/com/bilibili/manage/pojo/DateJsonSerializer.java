package com.bilibili.manage.pojo;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class DateJsonSerializer extends JsonSerializer<Date>{
	/**
	 * 日期格式转换
	 */
	@Override
	public void serialize(Date value, 
			JsonGenerator gen, 
			SerializerProvider serializers)
			throws IOException, JsonProcessingException {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
		String dateStr = sdf.format(value);
		gen.writeString(dateStr);
	}
	
}
