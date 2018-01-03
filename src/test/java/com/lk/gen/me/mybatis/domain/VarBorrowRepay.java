package me.mybatis.domain;

import java.util.Date;

public class VarBorrowRepay {
    private Long id;

    private Long customerId;

    private Integer loanTimes;

    private Integer timeBetFirstloanAndAudit;

    private Long totalAmount;

    private String fistLoanStrloandate;

    private Long firstLoanAmount;

    private Byte firstLoanIsOverdue;

    private Integer firstLoanOverDueDays;

    private Long firstLoanOverDueAmount;

    private Byte firstLoanIsPrepay;

    private Integer firstLoanPrepayDays;

    private Long firstLoanPrepayAmount;

    private String lastLoanStrloandate;

    private Long lastLoanAmount;

    private Byte lastLoanIsOverdue;

    private Byte lastLoanOverDueDays;

    private Long lastLoanOverDueAmount;

    private Byte lastLoanIsPrepay;

    private Integer lastLoanPrepayDays;

    private Long lastLoanPrepayAmount;

    private Integer loanTimesInX;

    private Long totalAmountInX;

    private Long maxLoanamountInX;

    private Integer xPrepay30Times;

    private Long xPrepay30Amount;

    private Long maxXPrepay30Amount;

    private Integer xPrepay1Times;

    private Long xPrepay1Amount;

    private Long maxXPrepay1Amount;

    private Integer xPrepay0Times;

    private Long xPrepay0Amount;

    private Long maxXPrepay0Amount;

    private Integer xPrepaySumDays;

    private Integer maxXPrepayDays;

    private Integer xOverdueSumDays;

    private Integer maxXOverdueDays;

    private Integer xOverdueTimes;

    private Long xOverdueTotalAmount;

    private Long maxXOverdueTotalAmount;

    private Long xOverdueAmount;

    private Long maxXOverdueAmount;

    private Integer xObservation30Times;

    private Integer xOverdue30Times;

    private Long xOverdue30TotalAmount;

    private Long maxXOverdue30TotalAmount;

    private Long xOverdue30Amount;

    private Long maxXOverdue30Amount;

    private Integer xObservation60Times;

    private Integer xOverdue60Times;

    private Long xOverdue60TotalAmount;

    private Long maxXOverdue60TotalAmount;

    private Long xOverdue60Amount;

    private Long maxXOverdue60Amount;

    private Integer xObservation90Times;

    private Integer xOverdue90Times;

    private Long xOverdue90TotalAmount;

    private Long maxXOverdue90TotalAmount;

    private Long xOverdue90Amount;

    private Long maxXOverdue90Amount;

    private Integer debtOverdueDaysMax;

    private Long xDebt;

    private Long xDebtOverdue;

    private Date cdate;

    private Date edate;

    private String creator;

    private String editor;

    private String status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Integer getLoanTimes() {
        return loanTimes;
    }

    public void setLoanTimes(Integer loanTimes) {
        this.loanTimes = loanTimes;
    }

    public Integer getTimeBetFirstloanAndAudit() {
        return timeBetFirstloanAndAudit;
    }

    public void setTimeBetFirstloanAndAudit(Integer timeBetFirstloanAndAudit) {
        this.timeBetFirstloanAndAudit = timeBetFirstloanAndAudit;
    }

    public Long getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getFistLoanStrloandate() {
        return fistLoanStrloandate;
    }

    public void setFistLoanStrloandate(String fistLoanStrloandate) {
        this.fistLoanStrloandate = fistLoanStrloandate == null ? null : fistLoanStrloandate.trim();
    }

    public Long getFirstLoanAmount() {
        return firstLoanAmount;
    }

    public void setFirstLoanAmount(Long firstLoanAmount) {
        this.firstLoanAmount = firstLoanAmount;
    }

    public Byte getFirstLoanIsOverdue() {
        return firstLoanIsOverdue;
    }

    public void setFirstLoanIsOverdue(Byte firstLoanIsOverdue) {
        this.firstLoanIsOverdue = firstLoanIsOverdue;
    }

    public Integer getFirstLoanOverDueDays() {
        return firstLoanOverDueDays;
    }

    public void setFirstLoanOverDueDays(Integer firstLoanOverDueDays) {
        this.firstLoanOverDueDays = firstLoanOverDueDays;
    }

    public Long getFirstLoanOverDueAmount() {
        return firstLoanOverDueAmount;
    }

    public void setFirstLoanOverDueAmount(Long firstLoanOverDueAmount) {
        this.firstLoanOverDueAmount = firstLoanOverDueAmount;
    }

    public Byte getFirstLoanIsPrepay() {
        return firstLoanIsPrepay;
    }

    public void setFirstLoanIsPrepay(Byte firstLoanIsPrepay) {
        this.firstLoanIsPrepay = firstLoanIsPrepay;
    }

    public Integer getFirstLoanPrepayDays() {
        return firstLoanPrepayDays;
    }

    public void setFirstLoanPrepayDays(Integer firstLoanPrepayDays) {
        this.firstLoanPrepayDays = firstLoanPrepayDays;
    }

    public Long getFirstLoanPrepayAmount() {
        return firstLoanPrepayAmount;
    }

    public void setFirstLoanPrepayAmount(Long firstLoanPrepayAmount) {
        this.firstLoanPrepayAmount = firstLoanPrepayAmount;
    }

    public String getLastLoanStrloandate() {
        return lastLoanStrloandate;
    }

    public void setLastLoanStrloandate(String lastLoanStrloandate) {
        this.lastLoanStrloandate = lastLoanStrloandate == null ? null : lastLoanStrloandate.trim();
    }

    public Long getLastLoanAmount() {
        return lastLoanAmount;
    }

    public void setLastLoanAmount(Long lastLoanAmount) {
        this.lastLoanAmount = lastLoanAmount;
    }

    public Byte getLastLoanIsOverdue() {
        return lastLoanIsOverdue;
    }

    public void setLastLoanIsOverdue(Byte lastLoanIsOverdue) {
        this.lastLoanIsOverdue = lastLoanIsOverdue;
    }

    public Byte getLastLoanOverDueDays() {
        return lastLoanOverDueDays;
    }

    public void setLastLoanOverDueDays(Byte lastLoanOverDueDays) {
        this.lastLoanOverDueDays = lastLoanOverDueDays;
    }

    public Long getLastLoanOverDueAmount() {
        return lastLoanOverDueAmount;
    }

    public void setLastLoanOverDueAmount(Long lastLoanOverDueAmount) {
        this.lastLoanOverDueAmount = lastLoanOverDueAmount;
    }

    public Byte getLastLoanIsPrepay() {
        return lastLoanIsPrepay;
    }

    public void setLastLoanIsPrepay(Byte lastLoanIsPrepay) {
        this.lastLoanIsPrepay = lastLoanIsPrepay;
    }

    public Integer getLastLoanPrepayDays() {
        return lastLoanPrepayDays;
    }

    public void setLastLoanPrepayDays(Integer lastLoanPrepayDays) {
        this.lastLoanPrepayDays = lastLoanPrepayDays;
    }

    public Long getLastLoanPrepayAmount() {
        return lastLoanPrepayAmount;
    }

    public void setLastLoanPrepayAmount(Long lastLoanPrepayAmount) {
        this.lastLoanPrepayAmount = lastLoanPrepayAmount;
    }

    public Integer getLoanTimesInX() {
        return loanTimesInX;
    }

    public void setLoanTimesInX(Integer loanTimesInX) {
        this.loanTimesInX = loanTimesInX;
    }

    public Long getTotalAmountInX() {
        return totalAmountInX;
    }

    public void setTotalAmountInX(Long totalAmountInX) {
        this.totalAmountInX = totalAmountInX;
    }

    public Long getMaxLoanamountInX() {
        return maxLoanamountInX;
    }

    public void setMaxLoanamountInX(Long maxLoanamountInX) {
        this.maxLoanamountInX = maxLoanamountInX;
    }

    public Integer getxPrepay30Times() {
        return xPrepay30Times;
    }

    public void setxPrepay30Times(Integer xPrepay30Times) {
        this.xPrepay30Times = xPrepay30Times;
    }

    public Long getxPrepay30Amount() {
        return xPrepay30Amount;
    }

    public void setxPrepay30Amount(Long xPrepay30Amount) {
        this.xPrepay30Amount = xPrepay30Amount;
    }

    public Long getMaxXPrepay30Amount() {
        return maxXPrepay30Amount;
    }

    public void setMaxXPrepay30Amount(Long maxXPrepay30Amount) {
        this.maxXPrepay30Amount = maxXPrepay30Amount;
    }

    public Integer getxPrepay1Times() {
        return xPrepay1Times;
    }

    public void setxPrepay1Times(Integer xPrepay1Times) {
        this.xPrepay1Times = xPrepay1Times;
    }

    public Long getxPrepay1Amount() {
        return xPrepay1Amount;
    }

    public void setxPrepay1Amount(Long xPrepay1Amount) {
        this.xPrepay1Amount = xPrepay1Amount;
    }

    public Long getMaxXPrepay1Amount() {
        return maxXPrepay1Amount;
    }

    public void setMaxXPrepay1Amount(Long maxXPrepay1Amount) {
        this.maxXPrepay1Amount = maxXPrepay1Amount;
    }

    public Integer getxPrepay0Times() {
        return xPrepay0Times;
    }

    public void setxPrepay0Times(Integer xPrepay0Times) {
        this.xPrepay0Times = xPrepay0Times;
    }

    public Long getxPrepay0Amount() {
        return xPrepay0Amount;
    }

    public void setxPrepay0Amount(Long xPrepay0Amount) {
        this.xPrepay0Amount = xPrepay0Amount;
    }

    public Long getMaxXPrepay0Amount() {
        return maxXPrepay0Amount;
    }

    public void setMaxXPrepay0Amount(Long maxXPrepay0Amount) {
        this.maxXPrepay0Amount = maxXPrepay0Amount;
    }

    public Integer getxPrepaySumDays() {
        return xPrepaySumDays;
    }

    public void setxPrepaySumDays(Integer xPrepaySumDays) {
        this.xPrepaySumDays = xPrepaySumDays;
    }

    public Integer getMaxXPrepayDays() {
        return maxXPrepayDays;
    }

    public void setMaxXPrepayDays(Integer maxXPrepayDays) {
        this.maxXPrepayDays = maxXPrepayDays;
    }

    public Integer getxOverdueSumDays() {
        return xOverdueSumDays;
    }

    public void setxOverdueSumDays(Integer xOverdueSumDays) {
        this.xOverdueSumDays = xOverdueSumDays;
    }

    public Integer getMaxXOverdueDays() {
        return maxXOverdueDays;
    }

    public void setMaxXOverdueDays(Integer maxXOverdueDays) {
        this.maxXOverdueDays = maxXOverdueDays;
    }

    public Integer getxOverdueTimes() {
        return xOverdueTimes;
    }

    public void setxOverdueTimes(Integer xOverdueTimes) {
        this.xOverdueTimes = xOverdueTimes;
    }

    public Long getxOverdueTotalAmount() {
        return xOverdueTotalAmount;
    }

    public void setxOverdueTotalAmount(Long xOverdueTotalAmount) {
        this.xOverdueTotalAmount = xOverdueTotalAmount;
    }

    public Long getMaxXOverdueTotalAmount() {
        return maxXOverdueTotalAmount;
    }

    public void setMaxXOverdueTotalAmount(Long maxXOverdueTotalAmount) {
        this.maxXOverdueTotalAmount = maxXOverdueTotalAmount;
    }

    public Long getxOverdueAmount() {
        return xOverdueAmount;
    }

    public void setxOverdueAmount(Long xOverdueAmount) {
        this.xOverdueAmount = xOverdueAmount;
    }

    public Long getMaxXOverdueAmount() {
        return maxXOverdueAmount;
    }

    public void setMaxXOverdueAmount(Long maxXOverdueAmount) {
        this.maxXOverdueAmount = maxXOverdueAmount;
    }

    public Integer getxObservation30Times() {
        return xObservation30Times;
    }

    public void setxObservation30Times(Integer xObservation30Times) {
        this.xObservation30Times = xObservation30Times;
    }

    public Integer getxOverdue30Times() {
        return xOverdue30Times;
    }

    public void setxOverdue30Times(Integer xOverdue30Times) {
        this.xOverdue30Times = xOverdue30Times;
    }

    public Long getxOverdue30TotalAmount() {
        return xOverdue30TotalAmount;
    }

    public void setxOverdue30TotalAmount(Long xOverdue30TotalAmount) {
        this.xOverdue30TotalAmount = xOverdue30TotalAmount;
    }

    public Long getMaxXOverdue30TotalAmount() {
        return maxXOverdue30TotalAmount;
    }

    public void setMaxXOverdue30TotalAmount(Long maxXOverdue30TotalAmount) {
        this.maxXOverdue30TotalAmount = maxXOverdue30TotalAmount;
    }

    public Long getxOverdue30Amount() {
        return xOverdue30Amount;
    }

    public void setxOverdue30Amount(Long xOverdue30Amount) {
        this.xOverdue30Amount = xOverdue30Amount;
    }

    public Long getMaxXOverdue30Amount() {
        return maxXOverdue30Amount;
    }

    public void setMaxXOverdue30Amount(Long maxXOverdue30Amount) {
        this.maxXOverdue30Amount = maxXOverdue30Amount;
    }

    public Integer getxObservation60Times() {
        return xObservation60Times;
    }

    public void setxObservation60Times(Integer xObservation60Times) {
        this.xObservation60Times = xObservation60Times;
    }

    public Integer getxOverdue60Times() {
        return xOverdue60Times;
    }

    public void setxOverdue60Times(Integer xOverdue60Times) {
        this.xOverdue60Times = xOverdue60Times;
    }

    public Long getxOverdue60TotalAmount() {
        return xOverdue60TotalAmount;
    }

    public void setxOverdue60TotalAmount(Long xOverdue60TotalAmount) {
        this.xOverdue60TotalAmount = xOverdue60TotalAmount;
    }

    public Long getMaxXOverdue60TotalAmount() {
        return maxXOverdue60TotalAmount;
    }

    public void setMaxXOverdue60TotalAmount(Long maxXOverdue60TotalAmount) {
        this.maxXOverdue60TotalAmount = maxXOverdue60TotalAmount;
    }

    public Long getxOverdue60Amount() {
        return xOverdue60Amount;
    }

    public void setxOverdue60Amount(Long xOverdue60Amount) {
        this.xOverdue60Amount = xOverdue60Amount;
    }

    public Long getMaxXOverdue60Amount() {
        return maxXOverdue60Amount;
    }

    public void setMaxXOverdue60Amount(Long maxXOverdue60Amount) {
        this.maxXOverdue60Amount = maxXOverdue60Amount;
    }

    public Integer getxObservation90Times() {
        return xObservation90Times;
    }

    public void setxObservation90Times(Integer xObservation90Times) {
        this.xObservation90Times = xObservation90Times;
    }

    public Integer getxOverdue90Times() {
        return xOverdue90Times;
    }

    public void setxOverdue90Times(Integer xOverdue90Times) {
        this.xOverdue90Times = xOverdue90Times;
    }

    public Long getxOverdue90TotalAmount() {
        return xOverdue90TotalAmount;
    }

    public void setxOverdue90TotalAmount(Long xOverdue90TotalAmount) {
        this.xOverdue90TotalAmount = xOverdue90TotalAmount;
    }

    public Long getMaxXOverdue90TotalAmount() {
        return maxXOverdue90TotalAmount;
    }

    public void setMaxXOverdue90TotalAmount(Long maxXOverdue90TotalAmount) {
        this.maxXOverdue90TotalAmount = maxXOverdue90TotalAmount;
    }

    public Long getxOverdue90Amount() {
        return xOverdue90Amount;
    }

    public void setxOverdue90Amount(Long xOverdue90Amount) {
        this.xOverdue90Amount = xOverdue90Amount;
    }

    public Long getMaxXOverdue90Amount() {
        return maxXOverdue90Amount;
    }

    public void setMaxXOverdue90Amount(Long maxXOverdue90Amount) {
        this.maxXOverdue90Amount = maxXOverdue90Amount;
    }

    public Integer getDebtOverdueDaysMax() {
        return debtOverdueDaysMax;
    }

    public void setDebtOverdueDaysMax(Integer debtOverdueDaysMax) {
        this.debtOverdueDaysMax = debtOverdueDaysMax;
    }

    public Long getxDebt() {
        return xDebt;
    }

    public void setxDebt(Long xDebt) {
        this.xDebt = xDebt;
    }

    public Long getxDebtOverdue() {
        return xDebtOverdue;
    }

    public void setxDebtOverdue(Long xDebtOverdue) {
        this.xDebtOverdue = xDebtOverdue;
    }

    public Date getCdate() {
        return cdate;
    }

    public void setCdate(Date cdate) {
        this.cdate = cdate;
    }

    public Date getEdate() {
        return edate;
    }

    public void setEdate(Date edate) {
        this.edate = edate;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor == null ? null : editor.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}