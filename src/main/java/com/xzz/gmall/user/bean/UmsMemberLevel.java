package com.xzz.gmall.user.bean;

import java.util.Date;

public class UmsMemberLevel {
    private String id;
    private String name;
    private int growthPoint;
    private String defaultStatus;
    private String freeFreightPoint;
    private String commentGrowthPoint;
    private int priviledgeFreeFreight;
    private String priviledgeSignIn;
    private String priviledgeComment;
    private String priviledgePromotion;
    private Double priviledgeMemberPrice;
    private Date priviledgeBirthday;
    private String note;

    public UmsMemberLevel() {
    }

    public UmsMemberLevel(String id, String name, int growthPoint, String defaultStatus, String freeFreightPoint, String commentGrowthPoint, int priviledgeFreeFreight, String priviledgeSignIn, String priviledgeComment, String priviledgePromotion, Double priviledgeMemberPrice, Date priviledgeBirthday, String note) {
        this.id = id;
        this.name = name;
        this.growthPoint = growthPoint;
        this.defaultStatus = defaultStatus;
        this.freeFreightPoint = freeFreightPoint;
        this.commentGrowthPoint = commentGrowthPoint;
        this.priviledgeFreeFreight = priviledgeFreeFreight;
        this.priviledgeSignIn = priviledgeSignIn;
        this.priviledgeComment = priviledgeComment;
        this.priviledgePromotion = priviledgePromotion;
        this.priviledgeMemberPrice = priviledgeMemberPrice;
        this.priviledgeBirthday = priviledgeBirthday;
        this.note = note;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrowthPoint(int growthPoint) {
        this.growthPoint = growthPoint;
    }

    public void setDefaultStatus(String defaultStatus) {
        this.defaultStatus = defaultStatus;
    }

    public void setFreeFreightPoint(String freeFreightPoint) {
        this.freeFreightPoint = freeFreightPoint;
    }

    public void setCommentGrowthPoint(String commentGrowthPoint) {
        this.commentGrowthPoint = commentGrowthPoint;
    }

    public void setPriviledgeFreeFreight(int priviledgeFreeFreight) {
        this.priviledgeFreeFreight = priviledgeFreeFreight;
    }

    public void setPriviledgeSignIn(String priviledgeSignIn) {
        this.priviledgeSignIn = priviledgeSignIn;
    }

    public void setPriviledgeComment(String priviledgeComment) {
        this.priviledgeComment = priviledgeComment;
    }

    public void setPriviledgePromotion(String priviledgePromotion) {
        this.priviledgePromotion = priviledgePromotion;
    }

    public void setPriviledgeMemberPrice(Double priviledgeMemberPrice) {
        this.priviledgeMemberPrice = priviledgeMemberPrice;
    }

    public void setPriviledgeBirthday(Date priviledgeBirthday) {
        this.priviledgeBirthday = priviledgeBirthday;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrowthPoint() {
        return growthPoint;
    }

    public String getDefaultStatus() {
        return defaultStatus;
    }

    public String getFreeFreightPoint() {
        return freeFreightPoint;
    }

    public String getCommentGrowthPoint() {
        return commentGrowthPoint;
    }

    public int getPriviledgeFreeFreight() {
        return priviledgeFreeFreight;
    }

    public String getPriviledgeSignIn() {
        return priviledgeSignIn;
    }

    public String getPriviledgeComment() {
        return priviledgeComment;
    }

    public String getPriviledgePromotion() {
        return priviledgePromotion;
    }

    public Double getPriviledgeMemberPrice() {
        return priviledgeMemberPrice;
    }

    public Date getPriviledgeBirthday() {
        return priviledgeBirthday;
    }

    public String getNote() {
        return note;
    }

}
