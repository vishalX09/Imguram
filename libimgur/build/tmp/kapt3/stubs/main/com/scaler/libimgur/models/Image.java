package com.scaler.libimgur.models;

@com.squareup.moshi.JsonClass(generateAdapter = true)
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b~\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u00b0\u0001B\u00e7\u0004\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u001e\u0012\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010$\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010%\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\'\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010(\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010*\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010,\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010-\u001a\u0004\u0018\u00010.\u0012\n\b\u0001\u0010/\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u00100\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u00101\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0001\u00102\u001a\b\u0012\u0004\u0012\u0002030\u001e\u0012\n\b\u0001\u00104\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u00105\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0001\u00106\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0001\u00107\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u00108\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u00109\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010:\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0001\u0010;\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010<J\u0010\u0010x\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010>J\u0010\u0010y\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010>J\u0010\u0010z\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010>J\u0010\u0010{\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010>J\u000b\u0010|\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u0010\u0010}\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010>J\u0010\u0010~\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010>J\u0010\u0010\u007f\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010GJ\u0011\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010>J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010GJ\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010>J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0012\u0010\u0087\u0001\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u001eH\u00c6\u0003J\u0011\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010>J\u0011\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010GJ\u0011\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010GJ\u0011\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010GJ\u0011\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010GJ\u0011\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010GJ\f\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\f\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010GJ\f\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010>J\u0011\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010GJ\u0011\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010>J\f\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u0097\u0001\u001a\u0004\u0018\u00010.H\u00c6\u0003J\u0011\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010>J\u0011\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010>J\f\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010>J\u0010\u0010\u009c\u0001\u001a\b\u0012\u0004\u0012\u0002030\u001eH\u00c6\u0003J\f\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\f\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\f\u0010\u00a0\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010\u00a1\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010>J\u0011\u0010\u00a2\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010>J\f\u0010\u00a3\u0001\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\f\u0010\u00a4\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010\u00a5\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010>J\u0011\u0010\u00a6\u0001\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010GJ\u0011\u0010\u00a7\u0001\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0002\u0010JJ\u0011\u0010\u00a8\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010>J\f\u0010\u00a9\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u00f2\u0004\u0010\u00aa\u0001\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u00052\u0010\b\u0003\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u001e2\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010#\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010%\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010&\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\'\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010(\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010)\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010*\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010+\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010,\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010-\u001a\u0004\u0018\u00010.2\n\b\u0003\u0010/\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u00100\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u00101\u001a\u0004\u0018\u00010\u00032\u000e\b\u0003\u00102\u001a\b\u0012\u0004\u0012\u0002030\u001e2\n\b\u0003\u00104\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u00105\u001a\u0004\u0018\u00010\u00012\n\b\u0003\u00106\u001a\u0004\u0018\u00010\u00012\n\b\u0003\u00107\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u00108\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u00109\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010:\u001a\u0004\u0018\u00010\u00012\n\b\u0003\u0010;\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0003\u0010\u00ab\u0001J\u0015\u0010\u00ac\u0001\u001a\u00020\u000b2\t\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\n\u0010\u00ae\u0001\u001a\u00020\u0003H\u00d6\u0001J\n\u0010\u00af\u0001\u001a\u00020\u0005H\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010?\u001a\u0004\b=\u0010>R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010?\u001a\u0004\bD\u0010>R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010AR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\n\n\u0002\u0010H\u001a\u0004\bF\u0010GR\u0015\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\n\n\u0002\u0010K\u001a\u0004\bI\u0010JR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010?\u001a\u0004\bL\u0010>R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u0010AR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010?\u001a\u0004\bN\u0010>R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010?\u001a\u0004\bO\u0010>R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010?\u001a\u0004\bP\u0010>R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010?\u001a\u0004\bS\u0010>R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010?\u001a\u0004\bT\u0010>R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\n\n\u0002\u0010H\u001a\u0004\bU\u0010GR\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010?\u001a\u0004\bV\u0010>R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bW\u0010AR\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\n\n\u0002\u0010H\u001a\u0004\bX\u0010GR\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010?\u001a\u0004\bY\u0010>R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bZ\u0010AR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b[\u0010AR\u0019\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\b\\\u0010]R\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010?\u001a\u0004\b^\u0010>R\u0015\u0010 \u001a\u0004\u0018\u00010\u000b\u00a2\u0006\n\n\u0002\u0010H\u001a\u0004\b_\u0010GR\u0015\u0010!\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\n\n\u0002\u0010H\u001a\u0004\b`\u0010GR\u0015\u0010\"\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\n\n\u0002\u0010H\u001a\u0004\ba\u0010GR\u0015\u0010#\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\n\n\u0002\u0010H\u001a\u0004\b#\u0010GR\u0015\u0010$\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\n\n\u0002\u0010H\u001a\u0004\b$\u0010GR\u0013\u0010%\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bb\u0010AR\u0013\u0010&\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bc\u0010AR\u0015\u0010\'\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\n\n\u0002\u0010H\u001a\u0004\bd\u0010GR\u0013\u0010(\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\be\u0010AR\u0015\u0010)\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010?\u001a\u0004\bf\u0010>R\u0015\u0010*\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\n\n\u0002\u0010H\u001a\u0004\bg\u0010GR\u0015\u0010+\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010?\u001a\u0004\bh\u0010>R\u0013\u0010,\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bi\u0010AR\u0013\u0010-\u001a\u0004\u0018\u00010.\u00a2\u0006\b\n\u0000\u001a\u0004\bj\u0010kR\u0015\u0010/\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010?\u001a\u0004\bl\u0010>R\u0013\u00100\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bm\u0010AR\u0015\u00101\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010?\u001a\u0004\bn\u0010>R\u0017\u00102\u001a\b\u0012\u0004\u0012\u0002030\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\bo\u0010]R\u0013\u00104\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bp\u0010AR\u0013\u00105\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bq\u0010RR\u0013\u00106\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\br\u0010RR\u0013\u00107\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bs\u0010AR\u0015\u00108\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010?\u001a\u0004\bt\u0010>R\u0015\u00109\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010?\u001a\u0004\bu\u0010>R\u0013\u0010:\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bv\u0010RR\u0015\u0010;\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010?\u001a\u0004\bw\u0010>\u00a8\u0006\u00b1\u0001"}, d2 = {"Lcom/scaler/libimgur/models/Image;", "", "accountId", "", "accountUrl", "", "adConfig", "Lcom/scaler/libimgur/models/AdConfig;", "adType", "adUrl", "animated", "", "bandwidth", "", "commentCount", "cover", "coverHeight", "coverWidth", "datetime", "description", "downs", "edited", "favorite", "favoriteCount", "gifv", "hasSound", "height", "hls", "id", "images", "", "imagesCount", "inGallery", "inMostViral", "includeAlbumAds", "isAd", "isAlbum", "layout", "link", "looping", "mp4", "mp4Size", "nsfw", "points", "privacy", "processing", "Lcom/scaler/libimgur/models/Image$Processing;", "score", "section", "size", "tags", "Lcom/scaler/libimgur/models/Tag;", "title", "topic", "topicId", "type", "ups", "views", "vote", "width", "(Ljava/lang/Integer;Ljava/lang/String;Lcom/scaler/libimgur/models/AdConfig;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Lcom/scaler/libimgur/models/Image$Processing;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Integer;)V", "getAccountId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAccountUrl", "()Ljava/lang/String;", "getAdConfig", "()Lcom/scaler/libimgur/models/AdConfig;", "getAdType", "getAdUrl", "getAnimated", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBandwidth", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCommentCount", "getCover", "getCoverHeight", "getCoverWidth", "getDatetime", "getDescription", "()Ljava/lang/Object;", "getDowns", "getEdited", "getFavorite", "getFavoriteCount", "getGifv", "getHasSound", "getHeight", "getHls", "getId", "getImages", "()Ljava/util/List;", "getImagesCount", "getInGallery", "getInMostViral", "getIncludeAlbumAds", "getLayout", "getLink", "getLooping", "getMp4", "getMp4Size", "getNsfw", "getPoints", "getPrivacy", "getProcessing", "()Lcom/scaler/libimgur/models/Image$Processing;", "getScore", "getSection", "getSize", "getTags", "getTitle", "getTopic", "getTopicId", "getType", "getUps", "getViews", "getVote", "getWidth", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Lcom/scaler/libimgur/models/AdConfig;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Lcom/scaler/libimgur/models/Image$Processing;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Integer;)Lcom/scaler/libimgur/models/Image;", "equals", "other", "hashCode", "toString", "Processing", "libimgur"})
public final class Image {
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer accountId = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String accountUrl = null;
    @org.jetbrains.annotations.Nullable
    private final com.scaler.libimgur.models.AdConfig adConfig = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer adType = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String adUrl = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Boolean animated = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Long bandwidth = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer commentCount = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String cover = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer coverHeight = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer coverWidth = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer datetime = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Object description = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer downs = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer edited = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Boolean favorite = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer favoriteCount = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String gifv = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Boolean hasSound = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer height = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String hls = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String id = null;
    @org.jetbrains.annotations.Nullable
    private final java.util.List<com.scaler.libimgur.models.Image> images = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer imagesCount = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Boolean inGallery = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Boolean inMostViral = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Boolean includeAlbumAds = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Boolean isAd = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Boolean isAlbum = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String layout = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String link = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Boolean looping = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String mp4 = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer mp4Size = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Boolean nsfw = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer points = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String privacy = null;
    @org.jetbrains.annotations.Nullable
    private final com.scaler.libimgur.models.Image.Processing processing = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer score = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String section = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer size = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.scaler.libimgur.models.Tag> tags = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String title = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Object topic = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Object topicId = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String type = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer ups = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer views = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Object vote = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer width = null;
    
    public Image(@com.squareup.moshi.Json(name = "account_id")
    @org.jetbrains.annotations.Nullable
    java.lang.Integer accountId, @com.squareup.moshi.Json(name = "account_url")
    @org.jetbrains.annotations.Nullable
    java.lang.String accountUrl, @com.squareup.moshi.Json(name = "ad_config")
    @org.jetbrains.annotations.Nullable
    com.scaler.libimgur.models.AdConfig adConfig, @com.squareup.moshi.Json(name = "ad_type")
    @org.jetbrains.annotations.Nullable
    java.lang.Integer adType, @com.squareup.moshi.Json(name = "ad_url")
    @org.jetbrains.annotations.Nullable
    java.lang.String adUrl, @com.squareup.moshi.Json(name = "animated")
    @org.jetbrains.annotations.Nullable
    java.lang.Boolean animated, @com.squareup.moshi.Json(name = "bandwidth")
    @org.jetbrains.annotations.Nullable
    java.lang.Long bandwidth, @com.squareup.moshi.Json(name = "comment_count")
    @org.jetbrains.annotations.Nullable
    java.lang.Integer commentCount, @com.squareup.moshi.Json(name = "cover")
    @org.jetbrains.annotations.Nullable
    java.lang.String cover, @com.squareup.moshi.Json(name = "cover_height")
    @org.jetbrains.annotations.Nullable
    java.lang.Integer coverHeight, @com.squareup.moshi.Json(name = "cover_width")
    @org.jetbrains.annotations.Nullable
    java.lang.Integer coverWidth, @com.squareup.moshi.Json(name = "datetime")
    @org.jetbrains.annotations.Nullable
    java.lang.Integer datetime, @com.squareup.moshi.Json(name = "description")
    @org.jetbrains.annotations.Nullable
    java.lang.Object description, @com.squareup.moshi.Json(name = "downs")
    @org.jetbrains.annotations.Nullable
    java.lang.Integer downs, @com.squareup.moshi.Json(name = "edited")
    @org.jetbrains.annotations.Nullable
    java.lang.Integer edited, @com.squareup.moshi.Json(name = "favorite")
    @org.jetbrains.annotations.Nullable
    java.lang.Boolean favorite, @com.squareup.moshi.Json(name = "favorite_count")
    @org.jetbrains.annotations.Nullable
    java.lang.Integer favoriteCount, @com.squareup.moshi.Json(name = "gifv")
    @org.jetbrains.annotations.Nullable
    java.lang.String gifv, @com.squareup.moshi.Json(name = "has_sound")
    @org.jetbrains.annotations.Nullable
    java.lang.Boolean hasSound, @com.squareup.moshi.Json(name = "height")
    @org.jetbrains.annotations.Nullable
    java.lang.Integer height, @com.squareup.moshi.Json(name = "hls")
    @org.jetbrains.annotations.Nullable
    java.lang.String hls, @com.squareup.moshi.Json(name = "id")
    @org.jetbrains.annotations.Nullable
    java.lang.String id, @com.squareup.moshi.Json(name = "images")
    @org.jetbrains.annotations.Nullable
    java.util.List<com.scaler.libimgur.models.Image> images, @com.squareup.moshi.Json(name = "images_count")
    @org.jetbrains.annotations.Nullable
    java.lang.Integer imagesCount, @com.squareup.moshi.Json(name = "in_gallery")
    @org.jetbrains.annotations.Nullable
    java.lang.Boolean inGallery, @com.squareup.moshi.Json(name = "in_most_viral")
    @org.jetbrains.annotations.Nullable
    java.lang.Boolean inMostViral, @com.squareup.moshi.Json(name = "include_album_ads")
    @org.jetbrains.annotations.Nullable
    java.lang.Boolean includeAlbumAds, @com.squareup.moshi.Json(name = "is_ad")
    @org.jetbrains.annotations.Nullable
    java.lang.Boolean isAd, @com.squareup.moshi.Json(name = "is_album")
    @org.jetbrains.annotations.Nullable
    java.lang.Boolean isAlbum, @com.squareup.moshi.Json(name = "layout")
    @org.jetbrains.annotations.Nullable
    java.lang.String layout, @com.squareup.moshi.Json(name = "link")
    @org.jetbrains.annotations.Nullable
    java.lang.String link, @com.squareup.moshi.Json(name = "looping")
    @org.jetbrains.annotations.Nullable
    java.lang.Boolean looping, @com.squareup.moshi.Json(name = "mp4")
    @org.jetbrains.annotations.Nullable
    java.lang.String mp4, @com.squareup.moshi.Json(name = "mp4_size")
    @org.jetbrains.annotations.Nullable
    java.lang.Integer mp4Size, @com.squareup.moshi.Json(name = "nsfw")
    @org.jetbrains.annotations.Nullable
    java.lang.Boolean nsfw, @com.squareup.moshi.Json(name = "points")
    @org.jetbrains.annotations.Nullable
    java.lang.Integer points, @com.squareup.moshi.Json(name = "privacy")
    @org.jetbrains.annotations.Nullable
    java.lang.String privacy, @com.squareup.moshi.Json(name = "processing")
    @org.jetbrains.annotations.Nullable
    com.scaler.libimgur.models.Image.Processing processing, @com.squareup.moshi.Json(name = "score")
    @org.jetbrains.annotations.Nullable
    java.lang.Integer score, @com.squareup.moshi.Json(name = "section")
    @org.jetbrains.annotations.Nullable
    java.lang.String section, @com.squareup.moshi.Json(name = "size")
    @org.jetbrains.annotations.Nullable
    java.lang.Integer size, @com.squareup.moshi.Json(name = "tags")
    @org.jetbrains.annotations.NotNull
    java.util.List<com.scaler.libimgur.models.Tag> tags, @com.squareup.moshi.Json(name = "title")
    @org.jetbrains.annotations.Nullable
    java.lang.String title, @com.squareup.moshi.Json(name = "topic")
    @org.jetbrains.annotations.Nullable
    java.lang.Object topic, @com.squareup.moshi.Json(name = "topic_id")
    @org.jetbrains.annotations.Nullable
    java.lang.Object topicId, @com.squareup.moshi.Json(name = "type")
    @org.jetbrains.annotations.Nullable
    java.lang.String type, @com.squareup.moshi.Json(name = "ups")
    @org.jetbrains.annotations.Nullable
    java.lang.Integer ups, @com.squareup.moshi.Json(name = "views")
    @org.jetbrains.annotations.Nullable
    java.lang.Integer views, @com.squareup.moshi.Json(name = "vote")
    @org.jetbrains.annotations.Nullable
    java.lang.Object vote, @com.squareup.moshi.Json(name = "width")
    @org.jetbrains.annotations.Nullable
    java.lang.Integer width) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getAccountId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getAccountUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.scaler.libimgur.models.AdConfig getAdConfig() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getAdType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getAdUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getAnimated() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getBandwidth() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getCommentCount() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCover() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getCoverHeight() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getCoverWidth() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getDatetime() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getDowns() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getEdited() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getFavorite() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getFavoriteCount() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getGifv() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getHasSound() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getHeight() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getHls() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.scaler.libimgur.models.Image> getImages() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getImagesCount() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getInGallery() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getInMostViral() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getIncludeAlbumAds() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean isAd() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean isAlbum() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getLayout() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getLink() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getLooping() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getMp4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getMp4Size() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getNsfw() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getPoints() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPrivacy() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.scaler.libimgur.models.Image.Processing getProcessing() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getScore() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getSection() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getSize() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.scaler.libimgur.models.Tag> getTags() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getTopic() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getTopicId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getUps() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getViews() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getVote() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getWidth() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.scaler.libimgur.models.Image> component23() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component24() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component25() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component26() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component27() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component28() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component29() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.scaler.libimgur.models.AdConfig component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component30() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component31() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component32() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component33() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component34() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component35() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component36() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component37() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.scaler.libimgur.models.Image.Processing component38() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component39() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component40() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component41() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.scaler.libimgur.models.Tag> component42() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component43() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object component44() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object component45() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component46() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component47() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component48() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object component49() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component50() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.scaler.libimgur.models.Image copy(@com.squareup.moshi.Json(name = "account_id")
    @org.jetbrains.annotations.Nullable
    java.lang.Integer accountId, @com.squareup.moshi.Json(name = "account_url")
    @org.jetbrains.annotations.Nullable
    java.lang.String accountUrl, @com.squareup.moshi.Json(name = "ad_config")
    @org.jetbrains.annotations.Nullable
    com.scaler.libimgur.models.AdConfig adConfig, @com.squareup.moshi.Json(name = "ad_type")
    @org.jetbrains.annotations.Nullable
    java.lang.Integer adType, @com.squareup.moshi.Json(name = "ad_url")
    @org.jetbrains.annotations.Nullable
    java.lang.String adUrl, @com.squareup.moshi.Json(name = "animated")
    @org.jetbrains.annotations.Nullable
    java.lang.Boolean animated, @com.squareup.moshi.Json(name = "bandwidth")
    @org.jetbrains.annotations.Nullable
    java.lang.Long bandwidth, @com.squareup.moshi.Json(name = "comment_count")
    @org.jetbrains.annotations.Nullable
    java.lang.Integer commentCount, @com.squareup.moshi.Json(name = "cover")
    @org.jetbrains.annotations.Nullable
    java.lang.String cover, @com.squareup.moshi.Json(name = "cover_height")
    @org.jetbrains.annotations.Nullable
    java.lang.Integer coverHeight, @com.squareup.moshi.Json(name = "cover_width")
    @org.jetbrains.annotations.Nullable
    java.lang.Integer coverWidth, @com.squareup.moshi.Json(name = "datetime")
    @org.jetbrains.annotations.Nullable
    java.lang.Integer datetime, @com.squareup.moshi.Json(name = "description")
    @org.jetbrains.annotations.Nullable
    java.lang.Object description, @com.squareup.moshi.Json(name = "downs")
    @org.jetbrains.annotations.Nullable
    java.lang.Integer downs, @com.squareup.moshi.Json(name = "edited")
    @org.jetbrains.annotations.Nullable
    java.lang.Integer edited, @com.squareup.moshi.Json(name = "favorite")
    @org.jetbrains.annotations.Nullable
    java.lang.Boolean favorite, @com.squareup.moshi.Json(name = "favorite_count")
    @org.jetbrains.annotations.Nullable
    java.lang.Integer favoriteCount, @com.squareup.moshi.Json(name = "gifv")
    @org.jetbrains.annotations.Nullable
    java.lang.String gifv, @com.squareup.moshi.Json(name = "has_sound")
    @org.jetbrains.annotations.Nullable
    java.lang.Boolean hasSound, @com.squareup.moshi.Json(name = "height")
    @org.jetbrains.annotations.Nullable
    java.lang.Integer height, @com.squareup.moshi.Json(name = "hls")
    @org.jetbrains.annotations.Nullable
    java.lang.String hls, @com.squareup.moshi.Json(name = "id")
    @org.jetbrains.annotations.Nullable
    java.lang.String id, @com.squareup.moshi.Json(name = "images")
    @org.jetbrains.annotations.Nullable
    java.util.List<com.scaler.libimgur.models.Image> images, @com.squareup.moshi.Json(name = "images_count")
    @org.jetbrains.annotations.Nullable
    java.lang.Integer imagesCount, @com.squareup.moshi.Json(name = "in_gallery")
    @org.jetbrains.annotations.Nullable
    java.lang.Boolean inGallery, @com.squareup.moshi.Json(name = "in_most_viral")
    @org.jetbrains.annotations.Nullable
    java.lang.Boolean inMostViral, @com.squareup.moshi.Json(name = "include_album_ads")
    @org.jetbrains.annotations.Nullable
    java.lang.Boolean includeAlbumAds, @com.squareup.moshi.Json(name = "is_ad")
    @org.jetbrains.annotations.Nullable
    java.lang.Boolean isAd, @com.squareup.moshi.Json(name = "is_album")
    @org.jetbrains.annotations.Nullable
    java.lang.Boolean isAlbum, @com.squareup.moshi.Json(name = "layout")
    @org.jetbrains.annotations.Nullable
    java.lang.String layout, @com.squareup.moshi.Json(name = "link")
    @org.jetbrains.annotations.Nullable
    java.lang.String link, @com.squareup.moshi.Json(name = "looping")
    @org.jetbrains.annotations.Nullable
    java.lang.Boolean looping, @com.squareup.moshi.Json(name = "mp4")
    @org.jetbrains.annotations.Nullable
    java.lang.String mp4, @com.squareup.moshi.Json(name = "mp4_size")
    @org.jetbrains.annotations.Nullable
    java.lang.Integer mp4Size, @com.squareup.moshi.Json(name = "nsfw")
    @org.jetbrains.annotations.Nullable
    java.lang.Boolean nsfw, @com.squareup.moshi.Json(name = "points")
    @org.jetbrains.annotations.Nullable
    java.lang.Integer points, @com.squareup.moshi.Json(name = "privacy")
    @org.jetbrains.annotations.Nullable
    java.lang.String privacy, @com.squareup.moshi.Json(name = "processing")
    @org.jetbrains.annotations.Nullable
    com.scaler.libimgur.models.Image.Processing processing, @com.squareup.moshi.Json(name = "score")
    @org.jetbrains.annotations.Nullable
    java.lang.Integer score, @com.squareup.moshi.Json(name = "section")
    @org.jetbrains.annotations.Nullable
    java.lang.String section, @com.squareup.moshi.Json(name = "size")
    @org.jetbrains.annotations.Nullable
    java.lang.Integer size, @com.squareup.moshi.Json(name = "tags")
    @org.jetbrains.annotations.NotNull
    java.util.List<com.scaler.libimgur.models.Tag> tags, @com.squareup.moshi.Json(name = "title")
    @org.jetbrains.annotations.Nullable
    java.lang.String title, @com.squareup.moshi.Json(name = "topic")
    @org.jetbrains.annotations.Nullable
    java.lang.Object topic, @com.squareup.moshi.Json(name = "topic_id")
    @org.jetbrains.annotations.Nullable
    java.lang.Object topicId, @com.squareup.moshi.Json(name = "type")
    @org.jetbrains.annotations.Nullable
    java.lang.String type, @com.squareup.moshi.Json(name = "ups")
    @org.jetbrains.annotations.Nullable
    java.lang.Integer ups, @com.squareup.moshi.Json(name = "views")
    @org.jetbrains.annotations.Nullable
    java.lang.Integer views, @com.squareup.moshi.Json(name = "vote")
    @org.jetbrains.annotations.Nullable
    java.lang.Object vote, @com.squareup.moshi.Json(name = "width")
    @org.jetbrains.annotations.Nullable
    java.lang.Integer width) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
    
    @com.squareup.moshi.JsonClass(generateAdapter = true)
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000f"}, d2 = {"Lcom/scaler/libimgur/models/Image$Processing;", "", "status", "", "(Ljava/lang/String;)V", "getStatus", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "libimgur"})
    public static final class Processing {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String status = null;
        
        public Processing(@com.squareup.moshi.Json(name = "status")
        @org.jetbrains.annotations.NotNull
        java.lang.String status) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getStatus() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.scaler.libimgur.models.Image.Processing copy(@com.squareup.moshi.Json(name = "status")
        @org.jetbrains.annotations.NotNull
        java.lang.String status) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return null;
        }
    }
}