package test;/**
 * Created by yaolijun on 2017/7/3.
 */

import java.math.BigDecimal;
import java.text.Collator;
import java.util.Locale;

/**
 * Created by yaolijun on 2017/7/3 20:19
 */
public class GroupEntity implements Comparable<GroupEntity> {
    private BigDecimal amount;  //金额
    private String trade;   //贸易
    private String kouan;   //口岸
    private String en;

    public GroupEntity() {
    }

    public GroupEntity(BigDecimal amount, String trade, String kouan, String en) {
        this.amount = amount;
        this.trade = trade;
        this.kouan = kouan;
        this.en = en;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getTrade() {
        return trade;
    }

    public void setTrade(String trade) {
        this.trade = trade;
    }

    public String getKouan() {
        return kouan;
    }

    public void setKouan(String kouan) {
        this.kouan = kouan;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    @Override
    public String toString() {
        return "GroupEntity{" +
                "amount=" + amount +
                ", trade='" + trade + '\'' +
                ", kouan='" + kouan + '\'' +
                ", en='" + en + '\'' +
                '}';
    }

    @Override
    public int compareTo(GroupEntity o) {
        Collator instance = Collator.getInstance(Locale.CHINA);
        return instance.compare(this.en, o.en);
    }
}
