package cn.com.bsfit.assets.dd.dim;


import java.util.Map;
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

    private Long firstSendETHTxnTime;

    private Long lastSendETHTxnTime;

    private Long lastReceiveETHTxnTime;

    private Long firstReceiveETHTxnTime;

    private Long out_degree;

    private Long in_degree;

    private Set<String> in_address;

    private Set<String> out_address;

    private Long created_contracts;

    private Double min_value_received;

    private Double max_value_received;

    private Double avg_value_received;

    private Double total_ether_received_for_accounts;

    private Double min_value_sent_to_contracts;

    private Double max_value_sent_to_contracts;

    private Double avg_value_sent_to_contracts;

    private Double total_ether_sent_for_contracts;

    private Map<String,Double> xxx_sent_to_contracts;

    private Map<String,Double> xxx_sent;

    private Map<String,Double> xxx_received;

    private Long firstReceiveERC20TxnTime;

    private Long firstSendERC20TxnTime;

    private Long lastReceiveERC20TxnTime;

    private Long lastSendERC20TxnTime;

    private Long totalETHSendTxnNums;

    private Long totalETHReceiveTxnNums;

    private Long totalERC20ReceiveTxnNums;

    private Long totalERC20SendTxnNums;

    private Long firstSendERC20TxnTime_for_contract;

    private Long lastSendERC20TxnTime_for_contract;
    
    private Long firstReceiveERC20TxnTime_for_contract;
    
    private Long lastReceiveERC20TxnTime_for_contract;

    private Long totalERC20SendTxnNums_for_contract;

    private Long totalERC20ReceiveTxnNums_for_contract;

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

    @Field("账户第一次发送ETH交易的时间")
    public Long getFirstSendETHTxnTime() {
        return firstSendETHTxnTime;
    }
    public void setFirstSendETHTxnTime(Long firstSendETHTxnTime) {
        this.firstSendETHTxnTime= firstSendETHTxnTime;
    }

    @Field("账户最后一次发送ETH交易的时间")
    public Long getLastSendETHTxnTime() {
        return lastSendETHTxnTime;
    }
    public void setLastSendETHTxnTime(Long lastSendETHTxnTime) {
        this.lastSendETHTxnTime= lastSendETHTxnTime;
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


    @Field("账户的交易流入邻居")
    public Set<String> getIn_address() {
        return in_address;
    }
    public void setIn_address(Set<String> in_address) {
        this.in_address = in_address;
    }

    @Field("账户的交易流出邻居")
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
    public void setTotal_ether_received_for_accounts(Double total_ether_received_for_accounts) {
        this.total_ether_received_for_accounts = total_ether_received_for_accounts;
    }

    @Field("账户发送的ETH总金额")
    public Double getTotal_ether_send_for_accounts() {
        return total_ether_sent_for_accounts;
    }
    public void setTotal_ether_send_for_accountsd(Double total_ether_sent_for_accounts) {
        this.total_ether_sent_for_accounts = total_ether_sent_for_accounts;
    }

    @Field("向合约发送的最小金额")
    public Double getMin_value_sent_to_contracts() {
        return min_value_sent_to_contracts;
    }
    public void setMin_value_sent_to_contracts(Double min_value_sent_to_contracts) {
        this.min_value_sent_to_contracts= min_value_sent_to_contracts;
    }

    @Field("向合约发送的最大金额")
    public Double getMax_value_sent_to_contracts() {
        return max_value_sent_to_contracts;
    }
    public void setMax_value_sent_to_contracts(Double max_value_sent_to_contracts) {
        this.max_value_sent_to_contracts= max_value_sent_to_contracts;
    }
    
    @Field("向合约发送的平均金额")
    public Double getAvg_value_sent_to_contracts() {
        return avg_value_sent_to_contracts;
    }
    public void setAvg_value_sent_to_contracts(Double avg_value_sent_to_contracts) {
        this.avg_value_sent_to_contracts= avg_value_sent_to_contracts;
    }

    @Field("向合约发送的总金额")
    public Double getTotal_ether_sent_for_contracts() {
        return total_ether_sent_for_contracts;
    }
    public void setTotal_ether_sent_for_contracts(Double total_ether_sent_for_contracts) {
        this.total_ether_sent_for_contracts= total_ether_sent_for_contracts;
    }

    @Field("账户向合约发送的xxx代币金额")
    public Map<String,Double> getXxx_sent_to_contracts() {
        return xxx_sent_to_contracts;
    }
    public void setXxx_sent_to_contracts(Map<String,Double> xxx_sent_to_contracts) {
        this.xxx_sent_to_contracts= xxx_sent_to_contracts;
    }
    
    @Field("账户发送的xxx代币金额")
    public Map<String,Double> getXxx_sent() {
        return xxx_sent;
    }
    public void setXxx_sent(Map<String,Double> xxx_sent) {
        this.xxx_sent= xxx_sent;
    }

    @Field("账户接收的xxx代币金额")
    public Map<String,Double> getXxx_received() {
        return xxx_received;
    }
    public void setXxx_received(Map<String,Double> xxx_received) {
        this.xxx_received= xxx_received;
    }

    @Field("账户发送的ETH总金额")
    public Double getTotal_ether_sent_for_accounts() {
        return total_ether_sent_for_accounts;
    }
    public void setTotal_ether_sent_for_accounts(Double total_ether_sent_for_accounts) {
        this.total_ether_sent_for_accounts = total_ether_sent_for_accounts;
    }


    @Field("账户最后接收ETH交易的时间")
    public Long getLastReceiveETHTxnTime() {
        return lastReceiveETHTxnTime;
    }
    public void setLastReceiveETHTxnTime(Long lastReceiveETHTxnTime) {
        this.lastReceiveETHTxnTime = lastReceiveETHTxnTime;
    }

    
    @Field("账户第一次接收ETH交易的时间")
    public Long getFirstReceiveETHTxnTime() {
        return firstReceiveETHTxnTime;
    }
    public void setFirstReceiveETHTxnTime(Long firstReceiveETHTxnTime) {
        this.firstReceiveETHTxnTime = firstReceiveETHTxnTime;
    }



    @Field("账户第一次接收ERC20交易的时间")
    public Long getFirstReceiveERC20TxnTime() {
        return firstReceiveERC20TxnTime;
    }
    public void setFirstReceiveERC20TxnTime(Long firstReceiveERC20TxnTime) {
        this.firstReceiveERC20TxnTime = firstReceiveERC20TxnTime;
    }

    @Field("账户第一次发送ERC20交易的时间")
    public Long getFirstSendERC20TxnTime() {
        return firstSendERC20TxnTime;
    }
    public void setFirstSendERC20TxnTime(Long firstSendERC20TxnTime) {
        this.firstSendERC20TxnTime = firstSendERC20TxnTime;
    }

    @Field("账户最后接收ERC20交易的时间")
    public Long getLastReceiveERC20TxnTime() {
        return lastReceiveERC20TxnTime;
    }
    public void setLastReceiveERC20TxnTime(Long lastReceiveERC20TxnTime) {
        this.lastReceiveERC20TxnTime = lastReceiveERC20TxnTime;
    }

    @Field("账户最后发送ERC20交易的时间")
    public Long getLastSendERC20TxnTime() {
        return lastSendERC20TxnTime;
    }
    public void setLastSendERC20TxnTime(Long lastSendERC20TxnTime) {
        this.lastSendERC20TxnTime = lastSendERC20TxnTime;
    }

    @Field("账户发送ETH的交易笔数")
    public Long getTotalETHSendTxnNums() {
        return totalETHSendTxnNums;
    }
    public void setTotalETHSendTxnNums(Long totalETHSendTxnNums) {
        this.totalETHSendTxnNums = totalETHSendTxnNums;
    }

    @Field("账户接收ETH的交易笔数")
    public Long getTotalETHReceiveTxnNums() {
        return totalETHReceiveTxnNums;
    }
    public void setTotalETHReceiveTxnNums(Long totalETHReceiveTxnNums) {
        this.totalETHReceiveTxnNums = totalETHReceiveTxnNums;
    }

    @Field("账户发送ERC20的交易笔数")
    public Long getTotalERC20ReceiveTxnNums() {
        return totalERC20ReceiveTxnNums;
    }
    public void setTotalERC20ReceiveTxnNums(Long totalERC20ReceiveTxnNums) {
        this.totalERC20ReceiveTxnNums = totalERC20ReceiveTxnNums;
    }

    @Field("账户接收ERC20的交易笔数")
    public Long getTotalERC20SendTxnNums() {
        return totalERC20SendTxnNums;
    }
    public void setTotalERC20SendTxnNums(Long totalERC20SendTxnNums) {
        this.totalERC20SendTxnNums = totalERC20SendTxnNums;
    }

    @Field("账户第一次向合约发送ERC20的时间")
    public Long getFirstSendERC20TxnTime_for_contract() {
        return firstSendERC20TxnTime_for_contract;
    }
    public void setFirstSendERC20TxnTime_for_contract(Long firstSendERC20TxnTime_for_contract) {
        this.firstSendERC20TxnTime_for_contract = firstSendERC20TxnTime_for_contract;
    }

    @Field("账户最后向合约发送ERC20的时间")
    public Long getLastSendERC20TxnTime_for_contract() {
        return lastSendERC20TxnTime_for_contract;
    }
    public void setLastSendERC20TxnTime_for_contract(Long lastSendERC20TxnTime_for_contract) {
        this.lastSendERC20TxnTime_for_contract = lastSendERC20TxnTime_for_contract;
    }

    @Field("账户第一次接收合约ERC20的时间")
    public Long getFirstReceiveERC20TxnTime_for_contract() {
        return firstReceiveERC20TxnTime_for_contract;
    }
    public void setFirstReceiveERC20TxnTime_for_contract(Long firstReceiveERC20TxnTime_for_contract) {
        this.firstReceiveERC20TxnTime_for_contract = firstReceiveERC20TxnTime_for_contract;
    }

    @Field("账户最后接收合约ERC20的时间")
    public Long getLastReceiveERC20TxnTime_for_contract() {
        return lastReceiveERC20TxnTime_for_contract;
    }
    public void setLastReceiveERC20TxnTime_for_contract(Long lastReceiveERC20TxnTime_for_contract) {
        this.lastReceiveERC20TxnTime_for_contract = lastReceiveERC20TxnTime_for_contract;
    }

    @Field("账户向合约发送ERC20总交易笔数")
    public Long getTotalERC20SendTxnNums_for_contract() {
        return totalERC20SendTxnNums_for_contract;
    }
    public void setTotalERC20SendTxnNums_for_contract(Long totalERC20SendTxnNums_for_contract) {
        this.totalERC20SendTxnNums_for_contract = totalERC20SendTxnNums_for_contract;
    }

    @Field("账户接收合约ERC20总交易笔数")
    public Long getTotalERC20ReceiveTxnNums_for_contract() {
        return totalERC20ReceiveTxnNums_for_contract;
    }
    public void setTotalERC20ReceiveTxnNums_for_contract(Long totalERC20ReceiveTxnNums_for_contract) {
        this.totalERC20ReceiveTxnNums_for_contract = totalERC20ReceiveTxnNums_for_contract;
    }






}
