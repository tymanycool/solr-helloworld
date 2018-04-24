package com.tianyao.entity;

import org.springframework.stereotype.Component;

import java.util.Date;


public class GuideInfoEntity {
    private Integer sid;
    private Integer guide_no;
    private String spell;
    private String mobile;
    private String email;
    private String guide_card;
    private Integer guide_bit;
    private Integer valid_bit;
    private String operator;
    private Integer operator_sid;
    private Date operator_time;
    private Date createtime;
    private String sex;
    private String name;
    private String address;
    private String education_cart_num;
    private String kitas_num;
    private Date kitas_endtime;
    private String health_cart_num;
    private Date health_cart_endtime;
    private String education;
    private Integer age;
    private String stature;
    private String present_address;
    private Integer chest_bit;
    private Integer deposit_bit;
    private String deposit_num;
    private Date entrytime;
    private Date leavetime;
    private Integer guide_status;
    private Integer authorize;
    private Date endtime;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getGuide_no() {
        return guide_no;
    }

    public void setGuide_no(Integer guide_no) {
        this.guide_no = guide_no;
    }

    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGuide_card() {
        return guide_card;
    }

    public void setGuide_card(String guide_card) {
        this.guide_card = guide_card;
    }

    public Integer getGuide_bit() {
        return guide_bit;
    }

    public void setGuide_bit(Integer guide_bit) {
        this.guide_bit = guide_bit;
    }

    public Integer getValid_bit() {
        return valid_bit;
    }

    public void setValid_bit(Integer valid_bit) {
        this.valid_bit = valid_bit;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Integer getOperator_sid() {
        return operator_sid;
    }

    public void setOperator_sid(Integer operator_sid) {
        this.operator_sid = operator_sid;
    }

    public Date getOperator_time() {
        return operator_time;
    }

    public void setOperator_time(Date operator_time) {
        this.operator_time = operator_time;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEducation_cart_num() {
        return education_cart_num;
    }

    public void setEducation_cart_num(String education_cart_num) {
        this.education_cart_num = education_cart_num;
    }

    public String getKitas_num() {
        return kitas_num;
    }

    public void setKitas_num(String kitas_num) {
        this.kitas_num = kitas_num;
    }

    public Date getKitas_endtime() {
        return kitas_endtime;
    }

    public void setKitas_endtime(Date kitas_endtime) {
        this.kitas_endtime = kitas_endtime;
    }

    public String getHealth_cart_num() {
        return health_cart_num;
    }

    public void setHealth_cart_num(String health_cart_num) {
        this.health_cart_num = health_cart_num;
    }

    public Date getHealth_cart_endtime() {
        return health_cart_endtime;
    }

    public void setHealth_cart_endtime(Date health_cart_endtime) {
        this.health_cart_endtime = health_cart_endtime;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getStature() {
        return stature;
    }

    public void setStature(String stature) {
        this.stature = stature;
    }

    public String getPresent_address() {
        return present_address;
    }

    public void setPresent_address(String present_address) {
        this.present_address = present_address;
    }

    public Integer getChest_bit() {
        return chest_bit;
    }

    public void setChest_bit(Integer chest_bit) {
        this.chest_bit = chest_bit;
    }

    public Integer getDeposit_bit() {
        return deposit_bit;
    }

    public void setDeposit_bit(Integer deposit_bit) {
        this.deposit_bit = deposit_bit;
    }

    public String getDeposit_num() {
        return deposit_num;
    }

    public void setDeposit_num(String deposit_num) {
        this.deposit_num = deposit_num;
    }

    public Date getEntrytime() {
        return entrytime;
    }

    public void setEntrytime(Date entrytime) {
        this.entrytime = entrytime;
    }

    public Date getLeavetime() {
        return leavetime;
    }

    public void setLeavetime(Date leavetime) {
        this.leavetime = leavetime;
    }

    public Integer getGuide_status() {
        return guide_status;
    }

    public void setGuide_status(Integer guide_status) {
        this.guide_status = guide_status;
    }

    public Integer getAuthorize() {
        return authorize;
    }

    public void setAuthorize(Integer authorize) {
        this.authorize = authorize;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    @Override
    public String toString() {
        return "GuideInfoEntity{" +
                "sid=" + sid +
                ", guide_no=" + guide_no +
                ", spell='" + spell + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", guide_card='" + guide_card + '\'' +
                ", guide_bit=" + guide_bit +
                ", valid_bit=" + valid_bit +
                ", operator='" + operator + '\'' +
                ", operator_sid=" + operator_sid +
                ", operator_time=" + operator_time +
                ", createtime=" + createtime +
                ", sex='" + sex + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", education_cart_num='" + education_cart_num + '\'' +
                ", kitas_num='" + kitas_num + '\'' +
                ", kitas_endtime=" + kitas_endtime +
                ", health_cart_num='" + health_cart_num + '\'' +
                ", health_cart_endtime=" + health_cart_endtime +
                ", education='" + education + '\'' +
                ", age=" + age +
                ", stature='" + stature + '\'' +
                ", present_address='" + present_address + '\'' +
                ", chest_bit=" + chest_bit +
                ", deposit_bit=" + deposit_bit +
                ", deposit_num='" + deposit_num + '\'' +
                ", entrytime=" + entrytime +
                ", leavetime=" + leavetime +
                ", guide_status=" + guide_status +
                ", authorize=" + authorize +
                ", endtime=" + endtime +
                '}';
    }
}
