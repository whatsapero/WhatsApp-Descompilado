package com.whatsapp.fieldstats;

import android.content.Context;
import com.whatsapp.DialogToastActivity;

public final class Events$Call extends c {
    public Double callAvgRtt;
    public Double callMaxRtt;
    public Double callMinRtt;
    public Double callNetwork;
    public Double callResult;
    public Double callRingingT;
    public Double callRxAvgBitrate;
    public Double callRxAvgJitter;
    public Double callRxAvgLossPeriod;
    public Double callRxMaxJitter;
    public Double callRxMaxLossPeriod;
    public Double callRxMinJitter;
    public Double callRxMinLossPeriod;
    public Double callRxPktLossPct;
    public Double callSetupT;
    public Double callSide;
    public Double callT;
    public Double callTermReason;
    public Double callTransitionCount;
    public Double callTransport;
    public Double callTxAvgBitrate;
    public Double callTxAvgJitter;
    public Double callTxAvgLossPeriod;
    public Double callTxMaxJitter;
    public Double callTxMaxLossPeriod;
    public Double callTxMinJitter;
    public Double callTxMinLossPeriod;
    public Double callTxPktLossPct;

    void updateFields(Context context) {
        int i = a1.a;
        al.a(context, y.EVENT, Integer.valueOf(ar.CALL.getCode()));
        al.a(context, y.CALL_SIDE, this.callSide);
        al.a(context, y.CALL_RESULT, this.callResult);
        al.a(context, y.CALL_TERM_REASON, this.callTermReason);
        al.a(context, y.CALL_TRANSPORT, this.callTransport);
        al.a(context, y.CALL_NETWORK, this.callNetwork);
        al.a(context, y.CALL_TRANSITION_COUNT, this.callTransitionCount);
        if (this.callT != null) {
            al.a(context, b.CALL_T, this.callT);
        }
        if (this.callSetupT != null) {
            al.a(context, b.CALL_SETUP_T, this.callSetupT);
        }
        if (this.callRingingT != null) {
            al.a(context, b.CALL_RINGING_T, this.callRingingT);
        }
        if (this.callMinRtt != null) {
            al.a(context, b.CALL_MIN_RTT, this.callMinRtt);
        }
        if (this.callMaxRtt != null) {
            al.a(context, b.CALL_MAX_RTT, this.callMaxRtt);
        }
        if (this.callAvgRtt != null) {
            al.a(context, b.CALL_AVG_RTT, this.callAvgRtt);
        }
        if (this.callTxPktLossPct != null) {
            al.a(context, b.CALL_TX_PKT_LOSS_PCT, this.callTxPktLossPct);
        }
        if (this.callTxAvgBitrate != null) {
            al.a(context, b.CALL_TX_AVG_BITRATE, this.callTxAvgBitrate);
        }
        if (this.callTxMinJitter != null) {
            al.a(context, b.CALL_TX_MIN_JITTER, this.callTxMinJitter);
        }
        if (this.callTxMaxJitter != null) {
            al.a(context, b.CALL_TX_MAX_JITTER, this.callTxMaxJitter);
        }
        if (this.callTxAvgJitter != null) {
            al.a(context, b.CALL_TX_AVG_JITTER, this.callTxAvgJitter);
        }
        if (this.callTxMinLossPeriod != null) {
            al.a(context, b.CALL_TX_MIN_LOSS_PERIOD, this.callTxMinLossPeriod);
        }
        if (this.callTxMaxLossPeriod != null) {
            al.a(context, b.CALL_TX_MAX_LOSS_PERIOD, this.callTxMaxLossPeriod);
        }
        if (this.callTxAvgLossPeriod != null) {
            al.a(context, b.CALL_TX_AVG_LOSS_PERIOD, this.callTxAvgLossPeriod);
        }
        if (this.callRxPktLossPct != null) {
            al.a(context, b.CALL_RX_PKT_LOSS_PCT, this.callRxPktLossPct);
        }
        if (this.callRxAvgBitrate != null) {
            al.a(context, b.CALL_RX_AVG_BITRATE, this.callRxAvgBitrate);
        }
        if (this.callRxMinJitter != null) {
            al.a(context, b.CALL_RX_MIN_JITTER, this.callRxMinJitter);
        }
        if (this.callRxMaxJitter != null) {
            al.a(context, b.CALL_RX_MAX_JITTER, this.callRxMaxJitter);
        }
        if (this.callRxAvgJitter != null) {
            al.a(context, b.CALL_RX_AVG_JITTER, this.callRxAvgJitter);
        }
        if (this.callRxMinLossPeriod != null) {
            al.a(context, b.CALL_RX_MIN_LOSS_PERIOD, this.callRxMinLossPeriod);
        }
        if (this.callRxMaxLossPeriod != null) {
            al.a(context, b.CALL_RX_MAX_LOSS_PERIOD, this.callRxMaxLossPeriod);
        }
        if (this.callRxAvgLossPeriod != null) {
            al.a(context, b.CALL_RX_AVG_LOSS_PERIOD, this.callRxAvgLossPeriod);
        }
        al.a(context, y.EVENT);
        if (i != 0) {
            DialogToastActivity.i = !DialogToastActivity.i;
        }
    }
}
