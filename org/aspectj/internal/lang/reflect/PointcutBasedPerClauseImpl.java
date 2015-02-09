package org.aspectj.internal.lang.reflect;

import org.aspectj.lang.reflect.PerClauseKind;
import org.aspectj.lang.reflect.PointcutBasedPerClause;
import org.aspectj.lang.reflect.PointcutExpression;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class PointcutBasedPerClauseImpl extends PerClauseImpl implements PointcutBasedPerClause {
    private final PointcutExpression pointcutExpression;

    static /* synthetic */ class AnonymousClass_1 {
        static final /* synthetic */ int[] $SwitchMap$org$aspectj$lang$reflect$PerClauseKind;

        static {
            $SwitchMap$org$aspectj$lang$reflect$PerClauseKind = new int[PerClauseKind.values().length];
            try {
                $SwitchMap$org$aspectj$lang$reflect$PerClauseKind[PerClauseKind.PERCFLOW.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$org$aspectj$lang$reflect$PerClauseKind[PerClauseKind.PERCFLOWBELOW.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$org$aspectj$lang$reflect$PerClauseKind[PerClauseKind.PERTARGET.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                $SwitchMap$org$aspectj$lang$reflect$PerClauseKind[PerClauseKind.PERTHIS.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
        }
    }

    public PointcutBasedPerClauseImpl(PerClauseKind kind, String pointcutExpression) {
        super(kind);
        this.pointcutExpression = new PointcutExpressionImpl(pointcutExpression);
    }

    public PointcutExpression getPointcutExpression() {
        return this.pointcutExpression;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        switch (AnonymousClass_1.$SwitchMap$org$aspectj$lang$reflect$PerClauseKind[getKind().ordinal()]) {
            case ay.f /*1*/:
                sb.append("percflow(");
                break;
            case ay.n /*2*/:
                sb.append("percflowbelow(");
                break;
            case ay.p /*3*/:
                sb.append("pertarget(");
                break;
            case aj.i /*4*/:
                sb.append("perthis(");
                break;
        }
        sb.append(this.pointcutExpression.asString());
        sb.append(")");
        return sb.toString();
    }
}
