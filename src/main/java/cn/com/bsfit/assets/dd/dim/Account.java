package cn.com.bsfit.assets.dd.dim;


import java.util.Set;

import cn.com.bsfit.anno.DD;
import cn.com.bsfit.anno.Field;

/**
 * 主体表DD
 */
@DD("账户")
//@NS("区块链")
public class Account {

    private String address;

    private Double min_value_send;

    private Double max_value_send;

    private Double avg_value_send;

    private Double total_ether_sent_for_accounts;

    private Long avg_time_between_sent;

    private Long firstTxnTime;

    private Long out_degree;

    private Long in_degree;

    private Set<String> in_address;

    private Set<String> out_address;

    private Long created_contracts;

    private Double min_value_received;

    private Double max_value_received;

    private Double avg_value_received;

    private Double total_ether_received_for_accounts;


    


    public Account(){

    }

    @Field("地址")
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    @Field("账户发送的最小金额")
    public Double getMin_value_send() {
        return min_value_send;
    }
    public void setMin_value_send(Double min_value_send) {
        this.min_value_send = min_value_send;
    }

    @Field("账户发送的最大金额")
    public Double getMax_value_send() {
        return max_value_send;
    }
    public void setMax_value_send(Double max_value_send) {
        this.max_value_send = max_value_send;
    }

    @Field("账户发送的平均金额")
    public Double getAvg_value_send() {
        return avg_value_send;
    }
    public void setAvg_value_send(Double avg_value_send) {
        this.avg_value_send = avg_value_send;
    }

    @Field("账户第一次发送交易的时间")
    public Long getFirstTxnTime() {
        return firstTxnTime;
    }
    public void setFirstTxnTime(Long firstTxnTime) {
        this.firstTxnTime = firstTxnTime;
    }

    @Field("节点出度")
    public Long getOut_degree() {
        return out_degree;
    }
    public void setOut_degree(Long out_degree) {
        this.out_degree = out_degree;
    }

    @Field("节点入度")
    public Long getIn_degree() {
        return in_degree;
    }
    public void setIn_degree(Long in_degree) {
        this.in_degree = in_degree;
    }

    @Field("账户发送交易的平均间隔时间")
    public Long getAvg_time_between_sent() {
        return avg_time_between_sent;
    }
    public void setAvg_time_between_sent(Long avg_time_between_sent) {
        this.avg_time_between_sent = avg_time_between_sent;
    }

    @Field("账户最近三个月的交易流入")
    public Set<String> getIn_address() {
        return in_address;
    }
    public void setIn_address(Set<String> in_address) {
        this.in_address = in_address;
    }

    @Field("账户最近三个月的交易流出")
    public Set<String> getOut_address() {
        return out_address;
    }
    public void setOut_address(Set<String> out_address) {
        this.out_address = out_address;
    }

    @Field("建立合约的个数")
    public Long getCreated_contracts() {
        return created_contracts;
    }
    public void setCreated_contracts(Long created_contracts) {
        this.created_contracts = created_contracts;
    }

    @Field("账户发送的最小金额")
    public Double getMin_value_received() {
        return min_value_received;
    }
    public void setMin_value_received(Double min_value_received) {
        this.min_value_received = min_value_received;
    }

    @Field("账户发送的最大金额")
    public Double getMax_value_received() {
        return max_value_received;
    }
    public void setMax_value_received(Double max_value_received) {
        this.max_value_received = max_value_received;
    }

    @Field("账户发送的平均金额")
    public Double getAvg_value_received() {
        return avg_value_received;
    }
    public void setAvg_value_received(Double avg_value_received) {
        this.avg_value_received = avg_value_received;
    }

    @Field("账户接收的ETH总金额")
    public Double getTotal_ether_received_for_accounts() {
        return total_ether_received_for_accounts;
    }
    public void setTotal_ether_received_for_accountsd(Double total_ether_received_for_accounts) {
        this.total_ether_received_for_accounts = total_ether_received_for_accounts;
    }

    @Field("账户发送的ETH总金额")
    public Double getTotal_ether_send_for_accounts() {
        return total_ether_sent_for_accounts;
    }
    public void setTotal_ether_send_for_accountsd(Double total_ether_sent_for_accounts) {
        this.total_ether_sent_for_accounts = total_ether_sent_for_accounts;
    }
    
    
}
