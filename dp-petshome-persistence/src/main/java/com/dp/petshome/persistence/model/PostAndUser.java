package com.dp.petshome.persistence.model;

import java.io.Serializable;
import java.util.Date;

public class PostAndUser implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_post_and_user.id
     *
     * @mbggenerated Sat Mar 25 17:56:13 CST 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_post_and_user.post_id
     *
     * @mbggenerated Sat Mar 25 17:56:13 CST 2017
     */
    private Integer postId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_post_and_user.user_id
     *
     * @mbggenerated Sat Mar 25 17:56:13 CST 2017
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_post_and_user.create_time
     *
     * @mbggenerated Sat Mar 25 17:56:13 CST 2017
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_post_and_user.update_time
     *
     * @mbggenerated Sat Mar 25 17:56:13 CST 2017
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_post_and_user.status
     *
     * @mbggenerated Sat Mar 25 17:56:13 CST 2017
     */
    private Byte status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_post_and_user
     *
     * @mbggenerated Sat Mar 25 17:56:13 CST 2017
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_post_and_user.id
     *
     * @return the value of t_post_and_user.id
     *
     * @mbggenerated Sat Mar 25 17:56:13 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_post_and_user.id
     *
     * @param id the value for t_post_and_user.id
     *
     * @mbggenerated Sat Mar 25 17:56:13 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_post_and_user.post_id
     *
     * @return the value of t_post_and_user.post_id
     *
     * @mbggenerated Sat Mar 25 17:56:13 CST 2017
     */
    public Integer getPostId() {
        return postId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_post_and_user.post_id
     *
     * @param postId the value for t_post_and_user.post_id
     *
     * @mbggenerated Sat Mar 25 17:56:13 CST 2017
     */
    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_post_and_user.user_id
     *
     * @return the value of t_post_and_user.user_id
     *
     * @mbggenerated Sat Mar 25 17:56:13 CST 2017
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_post_and_user.user_id
     *
     * @param userId the value for t_post_and_user.user_id
     *
     * @mbggenerated Sat Mar 25 17:56:13 CST 2017
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_post_and_user.create_time
     *
     * @return the value of t_post_and_user.create_time
     *
     * @mbggenerated Sat Mar 25 17:56:13 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_post_and_user.create_time
     *
     * @param createTime the value for t_post_and_user.create_time
     *
     * @mbggenerated Sat Mar 25 17:56:13 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_post_and_user.update_time
     *
     * @return the value of t_post_and_user.update_time
     *
     * @mbggenerated Sat Mar 25 17:56:13 CST 2017
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_post_and_user.update_time
     *
     * @param updateTime the value for t_post_and_user.update_time
     *
     * @mbggenerated Sat Mar 25 17:56:13 CST 2017
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_post_and_user.status
     *
     * @return the value of t_post_and_user.status
     *
     * @mbggenerated Sat Mar 25 17:56:13 CST 2017
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_post_and_user.status
     *
     * @param status the value for t_post_and_user.status
     *
     * @mbggenerated Sat Mar 25 17:56:13 CST 2017
     */
    public void setStatus(Byte status) {
        this.status = status;
    }
}