package WebCafe.WebCafe.DTO;

public class UpdateStatusRequest {
    private boolean newStatus;

    public boolean isNewStatus() {
        return newStatus;
    }

    public void setNewStatus(boolean newStatus) {
        this.newStatus = newStatus;
    }
}
