package com.jonasesteves.comments.moderation.api.model;

import java.util.Objects;

public class ModerationOutput {
    private Boolean approved;
    private String reason;

    private ModerationOutput() {}

    public ModerationOutput(Boolean approved, String reason) {
        this.approved = approved;
        this.reason = reason;
    }

    public Boolean getApproved() {
        return approved;
    }

    public void setApproved(Boolean approved) {
        this.approved = approved;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ModerationOutput that = (ModerationOutput) o;
        return Objects.equals(approved, that.approved) && Objects.equals(reason, that.reason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(approved, reason);
    }

    @Override
    public String toString() {
        return "ModerationOutput{" +
                "approved=" + approved +
                ", reason='" + reason + '\'' +
                '}';
    }
}
