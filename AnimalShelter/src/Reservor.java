import java.time.LocalDate;

public class Reservor {
    private String name;
    private LocalDate reservedAt;

    public Reservor(String name, LocalDate reservedAt) {
        this.name = name;
        this.reservedAt = reservedAt;
    }

    public String getName() {
        return name;
    }

    public LocalDate getReservedAt() {
        return reservedAt;
    }
}
