package cn.com.bsfit.assets.dd.event;

import cn.com.bsfit.anno.DD;
import cn.com.bsfit.anno.Field;
import cn.com.bsfit.anno.NS;
import java.util.Date;

import java.util.Date;

/**
 * 流水表DD
 */
@DD(value = "交易事件")
//@NS("区块链")
public class TransEvent{

    private Long timestamp;

    private String _from;

    private String to;

    private String coin;

    private Double value;

    private String tranHash;

    private Double gasUsed;

    private Double gasLimit;

    private Double fee;

    private String fromType;

    private String toType;

    private String transType;

    private Integer isLoop;

    private Integer status;

    private Date time;

    public TransEvent(){
    }

    public TransEvent(Long timestamp, String _from, String to, Double value, String tranHash) {
        this.setTimestamp(timestamp);
        this.set_from(_from);
        this.setTo(to);
        this.setValue(value);
        this.setTranHash(tranHash);
    }

    public TransEvent( Long timestamp, String _from, String to, Double value, String tranHash, String coin) {
        this(timestamp, _from, to, value, tranHash);
        this.setCoin(coin);
    }

    public TransEvent( Long timestamp, String _from, String to, Double value,
                      String coin, String tranHash, Double gasUsed, Double gasLimit,
                      Double fee, String fromType, String toType, String transType,
                      Integer isLoop, Integer status) {
        this(timestamp, _from, to, value, tranHash, coin);
        this.setGasUsed(gasUsed);
        this.setGasLimit(gasLimit);
        this.setFee(fee);
        this.setFromType(fromType);
        this.setToType(toType);
        this.setTransType(transType);
        this.setIsLoop(isLoop);
        this.setStatus(status);
    }

    @Field(value = "日期时间戳")
    public Date getTime() {
        return time;
    }

    public void setTime( Long timestamp) {
        this.time = new Date(timestamp);
    }

    @Field(value = "毫秒时间戳", unit = "毫秒")
    public  Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp( Long timestamp) {
        this.timestamp = timestamp;//单位毫秒
        this.setTime(this.timestamp);
    }

    @Field("转出账户地址")
    public String get_from(){
        return _from;
    }

    public void set_from(String _from) {
        this._from = _from;
    }

    @Field("转入账户地址")
    public String getTo(){
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    @Field("代币种类")
    public String getCoin(){
        return coin;
    }

    public void setCoin(String coin) {
        this.coin = coin;
    }

    @Field("转账金额")
    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    @Field("转出代币类型")
    public String getFromType() {
        return fromType;
    }

    public void setFromType(String fromType) {
        this.fromType = fromType;
    }

    @Field("转入代币类型")
    public String getToType() {
        return toType;
    }

    public void setToType(String toType) {
        this.toType = toType;
    }

    @Field("交易类型")
    public String getTransType(){
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    @Field("交易哈希值")
    public String getTranHash(){
        return tranHash;
    }

    public void setTranHash(String tranHash) {
        this.tranHash = tranHash;
    }

    @Field("挖掘消耗")
    public Double getGasUsed(){
        return gasUsed;
    }

    public void setGasUsed(Double gasUsed) {
        this.gasUsed = gasUsed;
    }

    @Field("挖掘限制")
    public Double getGasLimit(){
        return gasLimit;
    }

    public void setGasLimit(Double gasLimit) {
        this.gasLimit = gasLimit;
    }

    @Field("挖掘费用")
    public Double getFee(){
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }

    @Field("是否自环")
    public Integer getIsLoop(){
        return isLoop;
    }

    public void setIsLoop(Integer isLoop) {
        this.isLoop = isLoop;
    }

    @Field("交易状态")
    public Integer getStatus(){
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
