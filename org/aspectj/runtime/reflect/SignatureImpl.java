package org.aspectj.runtime.reflect;

import java.lang.ref.SoftReference;
import java.util.StringTokenizer;
import org.aspectj.lang.Signature;

abstract class SignatureImpl implements Signature {
    static Class[] EMPTY_CLASS_ARRAY = null;
    static String[] EMPTY_STRING_ARRAY = null;
    static final String INNER_SEP = ":";
    static final char SEP = '-';
    private static boolean useCache;
    Class declaringType;
    String declaringTypeName;
    ClassLoader lookupClassLoader;
    int modifiers;
    String name;
    Cache stringCache;
    private String stringRep;

    private static interface Cache {
        String get(int i);

        void set(int i, String str);
    }

    private static final class CacheImpl implements Cache {
        private SoftReference toStringCacheRef;

        public CacheImpl() {
            makeCache();
        }

        public String get(int cacheOffset) {
            String[] cachedArray = array();
            return cachedArray == null ? null : cachedArray[cacheOffset];
        }

        public void set(int cacheOffset, String result) {
            String[] cachedArray = array();
            if (cachedArray == null) {
                cachedArray = makeCache();
            }
            cachedArray[cacheOffset] = result;
        }

        private String[] array() {
            return (String[]) this.toStringCacheRef.get();
        }

        private String[] makeCache() {
            String[] array = new String[3];
            this.toStringCacheRef = new SoftReference(array);
            return array;
        }
    }

    protected abstract String createToString(StringMaker stringMaker);

    static {
        useCache = true;
        EMPTY_STRING_ARRAY = new String[0];
        EMPTY_CLASS_ARRAY = new Class[0];
    }

    SignatureImpl(int modifiers, String name, Class declaringType) {
        this.modifiers = -1;
        this.lookupClassLoader = null;
        this.modifiers = modifiers;
        this.name = name;
        this.declaringType = declaringType;
    }

    String toString(StringMaker sm) {
        String result = null;
        if (useCache) {
            if (this.stringCache == null) {
                try {
                    this.stringCache = new CacheImpl();
                } catch (Throwable th) {
                    useCache = false;
                }
            } else {
                result = this.stringCache.get(sm.cacheOffset);
            }
        }
        if (result == null) {
            result = createToString(sm);
        }
        if (useCache) {
            this.stringCache.set(sm.cacheOffset, result);
        }
        return result;
    }

    public final String toString() {
        return toString(StringMaker.middleStringMaker);
    }

    public final String toShortString() {
        return toString(StringMaker.shortStringMaker);
    }

    public final String toLongString() {
        return toString(StringMaker.longStringMaker);
    }

    public int getModifiers() {
        if (this.modifiers == -1) {
            this.modifiers = extractInt(0);
        }
        return this.modifiers;
    }

    public String getName() {
        if (this.name == null) {
            this.name = extractString(1);
        }
        return this.name;
    }

    public Class getDeclaringType() {
        if (this.declaringType == null) {
            this.declaringType = extractType(2);
        }
        return this.declaringType;
    }

    public String getDeclaringTypeName() {
        if (this.declaringTypeName == null) {
            this.declaringTypeName = getDeclaringType().getName();
        }
        return this.declaringTypeName;
    }

    String fullTypeName(Class type) {
        if (type == null) {
            return "ANONYMOUS";
        }
        return type.isArray() ? new StringBuffer().append(fullTypeName(type.getComponentType())).append("[]").toString() : type.getName().replace('$', '.');
    }

    String stripPackageName(String name) {
        int dot = name.lastIndexOf(46);
        return dot == -1 ? name : name.substring(dot + 1);
    }

    String shortTypeName(Class type) {
        if (type == null) {
            return "ANONYMOUS";
        }
        return type.isArray() ? new StringBuffer().append(shortTypeName(type.getComponentType())).append("[]").toString() : stripPackageName(type.getName()).replace('$', '.');
    }

    void addFullTypeNames(StringBuffer buf, Class[] types) {
        for (int i = 0; i < types.length; i++) {
            if (i > 0) {
                buf.append(", ");
            }
            buf.append(fullTypeName(types[i]));
        }
    }

    void addShortTypeNames(StringBuffer buf, Class[] types) {
        for (int i = 0; i < types.length; i++) {
            if (i > 0) {
                buf.append(", ");
            }
            buf.append(shortTypeName(types[i]));
        }
    }

    void addTypeArray(StringBuffer buf, Class[] types) {
        addFullTypeNames(buf, types);
    }

    public void setLookupClassLoader(ClassLoader loader) {
        this.lookupClassLoader = loader;
    }

    private ClassLoader getLookupClassLoader() {
        if (this.lookupClassLoader == null) {
            this.lookupClassLoader = getClass().getClassLoader();
        }
        return this.lookupClassLoader;
    }

    public SignatureImpl(String stringRep) {
        this.modifiers = -1;
        this.lookupClassLoader = null;
        this.stringRep = stringRep;
    }

    String extractString(int n) {
        int startIndex = 0;
        int endIndex = this.stringRep.indexOf(45);
        int n2 = n;
        while (true) {
            n = n2 - 1;
            if (n2 <= 0) {
                break;
            }
            startIndex = endIndex + 1;
            endIndex = this.stringRep.indexOf(45, startIndex);
            n2 = n;
        }
        if (endIndex == -1) {
            endIndex = this.stringRep.length();
        }
        return this.stringRep.substring(startIndex, endIndex);
    }

    int extractInt(int n) {
        return Integer.parseInt(extractString(n), 16);
    }

    Class extractType(int n) {
        return Factory.makeClass(extractString(n), getLookupClassLoader());
    }

    String[] extractStrings(int n) {
        StringTokenizer st = new StringTokenizer(extractString(n), INNER_SEP);
        int N = st.countTokens();
        String[] ret = new String[N];
        for (int i = 0; i < N; i++) {
            ret[i] = st.nextToken();
        }
        return ret;
    }

    Class[] extractTypes(int n) {
        StringTokenizer st = new StringTokenizer(extractString(n), INNER_SEP);
        int N = st.countTokens();
        Class[] ret = new Class[N];
        for (int i = 0; i < N; i++) {
            ret[i] = Factory.makeClass(st.nextToken(), getLookupClassLoader());
        }
        return ret;
    }

    static void setUseCache(boolean b) {
        useCache = b;
    }

    static boolean getUseCache() {
        return useCache;
    }
}
