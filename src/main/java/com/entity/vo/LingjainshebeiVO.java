package com.entity.vo;

import com.entity.LingjainshebeiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 零件设备表
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-02-24
 */
@TableName("lingjainshebei")
public class LingjainshebeiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 零件编号  Search
     */

    @TableField(value = "serial")
    private String serial;


    /**
     * 零件名称  Search
     */

    @TableField(value = "name")
    private String name;


    /**
     * 零件分类
     */

    @TableField(value = "lj_types")
    private Integer ljTypes;


    /**
     * 零件数量
     */

    @TableField(value = "amount")
    private Integer amount;


    /**
     * 生产单位
     */

    @TableField(value = "production")
    private Integer production;


    /**
     * 采购日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：零件编号  Search
	 */
    public String getSerial() {
        return serial;
    }


    /**
	 * 获取：零件编号  Search
	 */

    public void setSerial(String serial) {
        this.serial = serial;
    }
    /**
	 * 设置：零件名称  Search
	 */
    public String getName() {
        return name;
    }


    /**
	 * 获取：零件名称  Search
	 */

    public void setName(String name) {
        this.name = name;
    }
    /**
	 * 设置：零件分类
	 */
    public Integer getLjTypes() {
        return ljTypes;
    }


    /**
	 * 获取：零件分类
	 */

    public void setLjTypes(Integer ljTypes) {
        this.ljTypes = ljTypes;
    }
    /**
	 * 设置：零件数量
	 */
    public Integer getAmount() {
        return amount;
    }


    /**
	 * 获取：零件数量
	 */

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
    /**
	 * 设置：生产单位
	 */
    public Integer getProduction() {
        return production;
    }


    /**
	 * 获取：生产单位
	 */

    public void setProduction(Integer production) {
        this.production = production;
    }
    /**
	 * 设置：采购日期
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：采购日期
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
