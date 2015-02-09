package com.googlecode.mp4parser;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.NoAspectBoundException;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class RequiresParseDetailAspect {
    private static /* synthetic */ Throwable ajc$initFailureCause;
    public static final /* synthetic */ RequiresParseDetailAspect ajc$perSingletonInstance = null;

    static {
        /* JADX: method processing error */
/*
        Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.DebugInfoVisitor.visit(DebugInfoVisitor.java:22)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:22)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:261)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:157)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(Unknown Source)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(Unknown Source)
	at java.lang.Thread.run(Unknown Source)
*/
        /*
        ajc$perSingletonInstance = new com.googlecode.mp4parser.RequiresParseDetailAspect();	 Catch:{ Throwable -> 0x0005 }
    L_0x0004:
        return;
    L_0x0005:
        r0 = move-exception;
        ajc$initFailureCause = r0;
        goto L_0x0004;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.googlecode.mp4parser.RequiresParseDetailAspect.<clinit>():void");
    }

    public static RequiresParseDetailAspect aspectOf() {
        if (ajc$perSingletonInstance != null) {
            return ajc$perSingletonInstance;
        }
        throw new NoAspectBoundException("com.googlecode.mp4parser.RequiresParseDetailAspect", ajc$initFailureCause);
    }

    public static boolean hasAspect() {
        return ajc$perSingletonInstance != null;
    }

    @Before("this(com.googlecode.mp4parser.AbstractBox) && ((execution(public * * (..)) && !( execution(* parseDetails()) || execution(* getNumOfBytesToFirstChild()) || execution(* getType()) || execution(* isParsed()) || execution(* getHeader(*)) || execution(* parse()) || execution(* getBox(*)) || execution(* getSize()) || execution(* getOffset()) || execution(* parseDetails()) || execution(* _parseDetails(*)) || execution(* parse(*,*,*,*)) || execution(* getIsoFile()) || execution(* getParent()) || execution(* setParent(*)) || execution(* getUserType()) || execution(* setUserType(*))) && !@annotation(com.googlecode.mp4parser.annotations.DoNotParseDetail)) || @annotation(com.googlecode.mp4parser.annotations.ParseDetail))")
    public void before(JoinPoint joinPoint) {
        if (!(joinPoint.getTarget() instanceof AbstractBox)) {
            throw new RuntimeException("Only methods in subclasses of " + AbstractBox.class.getName() + " can  be annotated with ParseDetail");
        } else if (!((AbstractBox) joinPoint.getTarget()).isParsed()) {
            ((AbstractBox) joinPoint.getTarget()).parseDetails();
        }
    }
}
