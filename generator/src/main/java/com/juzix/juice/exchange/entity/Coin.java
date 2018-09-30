package com.juzix.juice.exchange.entity;

public class Coin {
    private String code;

    private String name;

    private Boolean isBaseCoin;

    private Boolean isEcr20;

    private Integer riskRanking;

    private Integer displayOrder;

    private String icon;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Boolean getIsBaseCoin() {
        return isBaseCoin;
    }

    public void setIsBaseCoin(Boolean isBaseCoin) {
        this.isBaseCoin = isBaseCoin;
    }

    public Boolean getIsEcr20() {
        return isEcr20;
    }

    public void setIsEcr20(Boolean isEcr20) {
        this.isEcr20 = isEcr20;
    }

    public Integer getRiskRanking() {
        return riskRanking;
    }

    public void setRiskRanking(Integer riskRanking) {
        this.riskRanking = riskRanking;
    }

    public Integer getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }
}