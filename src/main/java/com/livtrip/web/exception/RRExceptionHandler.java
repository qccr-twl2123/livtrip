package com.livtrip.web.exception;

import com.livtrip.web.model.Result;
import com.livtrip.web.model.Results;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 异常处理器
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2016年10月27日 下午10:16:19
 */
@RestControllerAdvice
public class RRExceptionHandler {
	private Logger logger = LoggerFactory.getLogger(getClass());

	/**
	 * 自定义异常
	 */
	@ExceptionHandler(RRException.class)
	public Result handleRRException(RRException e){
		return Results.newFailedResult(e.getMessage());
	}

	@ExceptionHandler(DuplicateKeyException.class)
	public Result handleDuplicateKeyException(DuplicateKeyException e){
		return Results.newFailedResult("数据库中已存在该记录");
	}


	@ExceptionHandler(Exception.class)
	public Result handleException(Exception e){
		return Results.newFailedResult(e.getMessage());
	}
}
