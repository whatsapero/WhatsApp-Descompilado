package org.aspectj.internal.lang.reflect;

import java.lang.annotation.Annotation;
import org.aspectj.lang.reflect.AjType;
import org.aspectj.lang.reflect.DeclareAnnotation;
import org.aspectj.lang.reflect.DeclareAnnotation.Kind;
import org.aspectj.lang.reflect.SignaturePattern;
import org.aspectj.lang.reflect.TypePattern;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class DeclareAnnotationImpl implements DeclareAnnotation {
    private String annText;
    private AjType<?> declaringType;
    private Kind kind;
    private SignaturePattern signaturePattern;
    private Annotation theAnnotation;
    private TypePattern typePattern;

    static /* synthetic */ class AnonymousClass_1 {
        static final /* synthetic */ int[] $SwitchMap$org$aspectj$lang$reflect$DeclareAnnotation$Kind;

        static {
            $SwitchMap$org$aspectj$lang$reflect$DeclareAnnotation$Kind = new int[Kind.values().length];
            try {
                $SwitchMap$org$aspectj$lang$reflect$DeclareAnnotation$Kind[Kind.Type.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$org$aspectj$lang$reflect$DeclareAnnotation$Kind[Kind.Method.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$org$aspectj$lang$reflect$DeclareAnnotation$Kind[Kind.Field.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                $SwitchMap$org$aspectj$lang$reflect$DeclareAnnotation$Kind[Kind.Constructor.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
        }
    }

    public DeclareAnnotationImpl(AjType<?> declaring, String kindString, String pattern, Annotation ann, String annText) {
        this.declaringType = declaring;
        if (kindString.equals("at_type")) {
            this.kind = Kind.Type;
        } else if (kindString.equals("at_field")) {
            this.kind = Kind.Field;
        } else if (kindString.equals("at_method")) {
            this.kind = Kind.Method;
        } else if (kindString.equals("at_constructor")) {
            this.kind = Kind.Constructor;
        } else {
            throw new IllegalStateException("Unknown declare annotation kind: " + kindString);
        }
        if (this.kind == Kind.Type) {
            this.typePattern = new TypePatternImpl(pattern);
        } else {
            this.signaturePattern = new SignaturePatternImpl(pattern);
        }
        this.theAnnotation = ann;
        this.annText = annText;
    }

    public AjType<?> getDeclaringType() {
        return this.declaringType;
    }

    public Kind getKind() {
        return this.kind;
    }

    public SignaturePattern getSignaturePattern() {
        return this.signaturePattern;
    }

    public TypePattern getTypePattern() {
        return this.typePattern;
    }

    public Annotation getAnnotation() {
        return this.theAnnotation;
    }

    public String getAnnotationAsText() {
        return this.annText;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("declare @");
        switch (AnonymousClass_1.$SwitchMap$org$aspectj$lang$reflect$DeclareAnnotation$Kind[getKind().ordinal()]) {
            case ay.f /*1*/:
                sb.append("type : ");
                sb.append(getTypePattern().asString());
                break;
            case ay.n /*2*/:
                sb.append("method : ");
                sb.append(getSignaturePattern().asString());
                break;
            case ay.p /*3*/:
                sb.append("field : ");
                sb.append(getSignaturePattern().asString());
                break;
            case aj.i /*4*/:
                sb.append("constructor : ");
                sb.append(getSignaturePattern().asString());
                break;
        }
        sb.append(" : ");
        sb.append(getAnnotationAsText());
        return sb.toString();
    }
}
