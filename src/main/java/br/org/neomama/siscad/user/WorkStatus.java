package br.org.neomama.siscad.user;

public enum WorkStatus {

    WORKING("Trabalhando"),
    AWAY_FROM_WORK("Afastada"),
    RETIRED("Aposentada");

    private final String displayName;

    WorkStatus(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
