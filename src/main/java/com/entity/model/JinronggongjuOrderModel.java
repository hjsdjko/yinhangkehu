package com.entity.model;

import com.entity.JinronggongjuOrderEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 借款
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JinronggongjuOrderModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 订单编号
     */
    private String jinronggongjuOrderUuidNumber;


    /**
     * 金融工具
     */
    private Integer jinronggongjuId;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 银行卡
     */
    private Integer yinhangkaId;


    /**
     * 借款金额
     */
    private Double jinronggongjuOrderJiekuanjine;


    /**
     * 还款金额
     */
    private Double jinronggongjuOrderHuankuanjine;


    /**
     * 最晚还款日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date zuiwanhuankuanTime;


    /**
     * 订单类型
     */
    private Integer jinronggongjuOrderTypes;


    /**
     * 支付类型
     */
    private Integer jinronggongjuOrderPaymentTypes;


    /**
     * 审核状态
     */
    private Integer jinronggongjuOrderYesnoTypes;


    /**
     * 审核意见
     */
    private String jinronggongjuOrderYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date jinronggongjuOrderShenheTime;


    /**
     * 订单创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show3 listShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：订单编号
	 */
    public String getJinronggongjuOrderUuidNumber() {
        return jinronggongjuOrderUuidNumber;
    }


    /**
	 * 设置：订单编号
	 */
    public void setJinronggongjuOrderUuidNumber(String jinronggongjuOrderUuidNumber) {
        this.jinronggongjuOrderUuidNumber = jinronggongjuOrderUuidNumber;
    }
    /**
	 * 获取：金融工具
	 */
    public Integer getJinronggongjuId() {
        return jinronggongjuId;
    }


    /**
	 * 设置：金融工具
	 */
    public void setJinronggongjuId(Integer jinronggongjuId) {
        this.jinronggongjuId = jinronggongjuId;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：银行卡
	 */
    public Integer getYinhangkaId() {
        return yinhangkaId;
    }


    /**
	 * 设置：银行卡
	 */
    public void setYinhangkaId(Integer yinhangkaId) {
        this.yinhangkaId = yinhangkaId;
    }
    /**
	 * 获取：借款金额
	 */
    public Double getJinronggongjuOrderJiekuanjine() {
        return jinronggongjuOrderJiekuanjine;
    }


    /**
	 * 设置：借款金额
	 */
    public void setJinronggongjuOrderJiekuanjine(Double jinronggongjuOrderJiekuanjine) {
        this.jinronggongjuOrderJiekuanjine = jinronggongjuOrderJiekuanjine;
    }
    /**
	 * 获取：还款金额
	 */
    public Double getJinronggongjuOrderHuankuanjine() {
        return jinronggongjuOrderHuankuanjine;
    }


    /**
	 * 设置：还款金额
	 */
    public void setJinronggongjuOrderHuankuanjine(Double jinronggongjuOrderHuankuanjine) {
        this.jinronggongjuOrderHuankuanjine = jinronggongjuOrderHuankuanjine;
    }
    /**
	 * 获取：最晚还款日期
	 */
    public Date getZuiwanhuankuanTime() {
        return zuiwanhuankuanTime;
    }


    /**
	 * 设置：最晚还款日期
	 */
    public void setZuiwanhuankuanTime(Date zuiwanhuankuanTime) {
        this.zuiwanhuankuanTime = zuiwanhuankuanTime;
    }
    /**
	 * 获取：订单类型
	 */
    public Integer getJinronggongjuOrderTypes() {
        return jinronggongjuOrderTypes;
    }


    /**
	 * 设置：订单类型
	 */
    public void setJinronggongjuOrderTypes(Integer jinronggongjuOrderTypes) {
        this.jinronggongjuOrderTypes = jinronggongjuOrderTypes;
    }
    /**
	 * 获取：支付类型
	 */
    public Integer getJinronggongjuOrderPaymentTypes() {
        return jinronggongjuOrderPaymentTypes;
    }


    /**
	 * 设置：支付类型
	 */
    public void setJinronggongjuOrderPaymentTypes(Integer jinronggongjuOrderPaymentTypes) {
        this.jinronggongjuOrderPaymentTypes = jinronggongjuOrderPaymentTypes;
    }
    /**
	 * 获取：审核状态
	 */
    public Integer getJinronggongjuOrderYesnoTypes() {
        return jinronggongjuOrderYesnoTypes;
    }


    /**
	 * 设置：审核状态
	 */
    public void setJinronggongjuOrderYesnoTypes(Integer jinronggongjuOrderYesnoTypes) {
        this.jinronggongjuOrderYesnoTypes = jinronggongjuOrderYesnoTypes;
    }
    /**
	 * 获取：审核意见
	 */
    public String getJinronggongjuOrderYesnoText() {
        return jinronggongjuOrderYesnoText;
    }


    /**
	 * 设置：审核意见
	 */
    public void setJinronggongjuOrderYesnoText(String jinronggongjuOrderYesnoText) {
        this.jinronggongjuOrderYesnoText = jinronggongjuOrderYesnoText;
    }
    /**
	 * 获取：审核时间
	 */
    public Date getJinronggongjuOrderShenheTime() {
        return jinronggongjuOrderShenheTime;
    }


    /**
	 * 设置：审核时间
	 */
    public void setJinronggongjuOrderShenheTime(Date jinronggongjuOrderShenheTime) {
        this.jinronggongjuOrderShenheTime = jinronggongjuOrderShenheTime;
    }
    /**
	 * 获取：订单创建时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：订单创建时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间 show3 listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show3 listShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
