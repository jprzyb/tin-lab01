package pl.pjatk.s24512.groovy.models

class Creation {
    Long id
    boolean isAnimated
    String fileName

    @Override
    public String toString() {
        return "Creation{" +
                "id=" + id +
                ", isAnimated=" + isAnimated +
                ", fileName='" + fileName + '\'' +
                '}';
    }
}
