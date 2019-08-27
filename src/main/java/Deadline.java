import java.text.SimpleDateFormat;
import java.util.Date;

public class Deadline extends Task {
    Date by;

    public Deadline(String description, Date by) {
        super(description);
        this.by = by;
    }

    @Override
    protected String formatToWrite() {
        if (this.done) {
            return String.format("D | %d | %s | %s", 1, this.description, new SimpleDateFormat("dd/MM/yyyy HHmm").format(this.by));
        } else {
            return String.format("D | %d | %s | %s", 0, this.description, new SimpleDateFormat("dd/MM/yyyy HHmm").format(this.by));
        }
    }

    @Override
    public String toString() {
        return String.format("[D]%s (by: %s)", super.toString(), new SimpleDateFormat("dd/MM/yyyy HHmm").format(this.by));
    }
}
