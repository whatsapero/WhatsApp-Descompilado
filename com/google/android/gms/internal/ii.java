package com.google.android.gms.internal;

public enum ii {
    SUCCESS("Ok"),
    BAD_AUTHENTICATION("BadAuthentication"),
    NEEDS_2F("InvalidSecondFactor"),
    NOT_VERIFIED("NotVerified"),
    TERMS_NOT_AGREED("TermsNotAgreed"),
    UNKNOWN("Unknown"),
    UNKNOWN_ERROR("UNKNOWN_ERR"),
    ACCOUNT_DELETED("AccountDeleted"),
    ACCOUNT_DISABLED("AccountDisabled"),
    SERVICE_DISABLED("ServiceDisabled"),
    SERVICE_UNAVAILABLE("ServiceUnavailable"),
    CAPTCHA("CaptchaRequired"),
    NETWORK_ERROR("NetworkError"),
    USER_CANCEL("UserCancel"),
    PERMISSION_DENIED("PermissionDenied"),
    DEVICE_MANAGEMENT_REQUIRED("DeviceManagementRequiredOrSyncDisabled"),
    DM_INTERNAL_ERROR("DeviceManagementInternalError"),
    DM_SYNC_DISABLED("DeviceManagementSyncDisabled"),
    DM_ADMIN_BLOCKED("DeviceManagementAdminBlocked"),
    DM_ADMIN_PENDING_APPROVAL("DeviceManagementAdminPendingApproval"),
    DM_STALE_SYNC_REQUIRED("DeviceManagementStaleSyncRequired"),
    DM_DEACTIVATED("DeviceManagementDeactivated"),
    DM_REQUIRED("DeviceManagementRequired"),
    CLIENT_LOGIN_DISABLED("ClientLoginDisabled"),
    NEED_PERMISSION("NeedPermission"),
    BAD_PASSWORD("WeakPassword"),
    ALREADY_HAS_GMAIL("ALREADY_HAS_GMAIL"),
    BAD_REQUEST("BadRequest"),
    BAD_USERNAME("BadUsername"),
    LOGIN_FAIL("LoginFail"),
    NOT_LOGGED_IN("NotLoggedIn"),
    NO_GMAIL("NoGmail"),
    REQUEST_DENIED("RequestDenied"),
    SERVER_ERROR("ServerError"),
    USERNAME_UNAVAILABLE("UsernameUnavailable"),
    DELETED_GMAIL("DeletedGmail"),
    SOCKET_TIMEOUT("SocketTimeout"),
    EXISTING_USERNAME("ExistingUsername"),
    NEEDS_BROWSER("NeedsBrowser"),
    GPLUS_OTHER("GPlusOther"),
    GPLUS_NICKNAME("GPlusNickname"),
    GPLUS_INVALID_CHAR("GPlusInvalidChar"),
    GPLUS_INTERSTITIAL("GPlusInterstitial"),
    GPLUS_PROFILE_ERROR("ProfileUpgradeError"),
    INVALID_SCOPE("INVALID_SCOPE");
    public static final ii EA = null;
    public static final ii EB = null;
    public static final ii EC = null;
    public static final ii ED = null;
    public static final ii EE = null;
    public static final ii EF = null;
    @Deprecated
    public static final ii EG = null;
    public static final ii EH = null;
    public static final ii EI = null;
    public static final ii EJ = null;
    public static final ii EK = null;
    public static final ii EL = null;
    public static final ii EM = null;
    public static final ii EN = null;
    public static final ii EO = null;
    public static final ii EP = null;
    public static final ii EQ = null;
    public static final ii ER = null;
    public static final ii ES = null;
    public static final ii ET = null;
    public static final ii EU = null;
    public static final ii EV = null;
    public static final ii EW = null;
    public static final ii EX = null;
    public static final ii EY = null;
    public static final ii EZ = null;
    public static final ii Er = null;
    public static final ii Es = null;
    public static final ii Et = null;
    public static final ii Eu = null;
    public static final ii Ev = null;
    public static final ii Ew = null;
    public static final ii Ex = null;
    public static final ii Ey = null;
    public static final ii Ez = null;
    public static final ii Fa = null;
    public static final ii Fb = null;
    public static final ii Fc = null;
    public static final ii Fd = null;
    public static final ii Fe = null;
    public static final ii Ff = null;
    public static final ii Fg = null;
    public static final ii Fh = null;
    public static final ii Fi = null;
    public static final ii Fj = null;
    public static String Fk;
    public static String Fl;
    private final String Fm;

    static {
        Fk = "Error";
        Fl = "status";
    }

    private ii(String str) {
        this.Fm = str;
    }

    public String fO() {
        return this.Fm;
    }
}
