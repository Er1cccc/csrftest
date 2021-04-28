package com.zfirm.csrftest.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author zy
 * @email zy@gmail.com
 * @date 2021-04-22 23:22:54
 */
@Data
@TableName("csrf_user")
public class UserEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Integer id;
	/**
	 * 
	 */
	private String username;
	/**
	 * 
	 */
	private String password;
	/**
	 * 
	 */
	private String ip;
	/**
	 * 
	 */
	private Date createTime;
	/**
	 * 
	 */
	private Date editTime;

	private Integer point;

}
