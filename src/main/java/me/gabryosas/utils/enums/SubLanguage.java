package me.gabryosas.utils.enums;

public enum SubLanguage {
    EN("en"),
    IT("it"),
    ES("es"),
    FR("fr"),
    DE("de"),
    RU("ru"),
    JA("ja"),
    KO("ko"),
    AR("ar"),
    EL("el"),
    UK("uk");
    private final String lang;
    SubLanguage(String lang){
        this.lang = lang;
    }
    public String toString(){
        return this.lang;
    }
}
