package com.livtrip.web.util;



/**
 * 常用基本数据状态定义
 * 
 */
public class UtilConstant {
	
	public static final Byte JK_CERTFICATION_TYPE=4;
	
	public static final String SALARY_SCOPE="salary_scope";
	
	public static final String VALIDATE="1";
	
	public static final String INVALID="0";
	
	public static final String LOAN_LIMIT="loan_limit";
	
	public static final String LOAN_TERM_="loan_term";
	
	public static final String LOAN_INTEREST="loan_interest";
	
	public static final String LOAN_PRODUCT_SORT="loan_product_sort";
	
	//app端我的借款相关展示状态
	//失效申请 重新申请
	public static final Byte APP_LOAN_SHOW_STATUS_0=0;
	//失效申请  审批未通过
	public static final Byte APP_LOAN_SHOW_STATUS_1=1;
	//失效申请  查看详情
	public static final Byte APP_LOAN_SHOW_STATUS_2=2;
	//有效申请 申请放款
	public static final Byte APP_LOAN_SHOW_STATUS_3=3;
	//有效申请 审批中
	public static final Byte APP_LOAN_SHOW_STATUS_4=4;
	//我的借款  未结清 已逾期
	public static final Byte APP_LOAN_SHOW_STATUS_5=5;
	//我的借款  未结清 正常还款
	public static final Byte APP_LOAN_SHOW_STATUS_6=6;
	//我的借款  已结清 已结清
	public static final Byte APP_LOAN_SHOW_STATUS_7=7;
	//我的借款  未结清 募集中
	public static final Byte APP_LOAN_SHOW_STATUS_8=8;
	
	
	
	//借款申请状态 0:未完成 1:审核中 2:审核成功 3:审核失败
	public static final Byte LOAN_APPLY_STATUS_0=0;
	public static final Byte LOAN_APPLY_STATUS_1=1;
	public static final Byte LOAN_APPLY_STATUS_2=2;
	public static final Byte LOAN_APPLY_STATUS_3=3;
	
	//额度状态：1:募集中 2:正常还款中 3:已逾期 4:已结束
	public static final Byte LOAN_LIMIT_STATUS_1=1;
	public static final Byte LOAN_LIMIT_STATUS_2=2;
	public static final Byte LOAN_LIMIT_STATUS_3=3;
	public static final Byte LOAN_LIMIT_STATUS_4=4;
	
	//个人信息主页面各项信息状态
	public static final String PERSON_INFO_STATUS_0="已填写";
	public static final String PERSON_INFO_STATUS_1="未填写";
	
	//个人信息主页面各项认证信息信息状态
	public static final String AUTHENTICATION_STATUS_KEY="authentication_status";
	//未认证
	public static final Byte  AUTHENTICATION_STATUS_0=0;
	//认证中
	public static final Byte  AUTHENTICATION_STATUS_1=1;
	//认证成功
	public static final Byte  AUTHENTICATION_STATUS_2=2;
	//认证失败
	public static final Byte  AUTHENTICATION_STATUS_3=3;
	
	public static final String REPAY_DELAY_STATUS_KEY="repay_delay_status";
	
	public static final String CARD_BIND_BANK="card_bind_bank";
	
	public static final String CARD_TYPE="card_type";
	
	public static final String BANK_BANNER="bank_banner";
	
	public static final String REPAY_TYPE="repay_type";
	
	//身份认证方式 0：人脸识别 1：银行绑卡
	public static final Byte IDENTITY_AUTH_TYPE_0=0;
	public static final Byte IDENTITY_AUTH_TYPE_1=1;
	
	//借款流程人脸识别提交时状态
	//非流程实名认证成功流程实名认证也成功
	public static final Byte FACE_AUTH_RESULT_STATUS_0=0;
	//非流程实名认证成功流程实名认证不成功
	public static final Byte FACE_AUTH_RESULT_STATUS_1=1;
	//非流程实名认证不成功（即走的银行卡实名认证）流程认证成功
	public static final Byte FACE_AUTH_RESULT_STATUS_2=2;
	//非流程实名认证不成功（即走的银行卡实名认证）流程认证不成功
	public static final Byte FACE_AUTH_RESULT_STATUS_3=3;
	
	//产品合同编号配置key
	public static final String PRODUCT_CONTRACT_KEY="product_contract";
	
	public static final String DATE_UNIT_KEY="date_unit";
	
	public static final String IDENTITY_TYPE_1="IDENTITY_CARD";
	
	public static final String LOAN_LIMIT_STATUS_KEY="loan_limit_status";
	
	public static final String LOAN_PRODUCT_TYPE_KEY="product_type_key";
	
	public static final String IDENTITY_TYPE_KEY="identity_type_key";
	
	
	public static final String LOAN_PRODUCTCODE_C9="C9";
	
	public static final String LOAN_PRODUCTCODE_MD="MD";
	
	public static final String C9_OPEN_CITY="杭州市";
	
	public static final Byte SUCCESS=0;
	
	public static final String CONTRACT_LOOK_TPLNO="CT009,CT011,CT012";
	
}