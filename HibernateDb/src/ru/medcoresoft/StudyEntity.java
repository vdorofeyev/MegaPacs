package ru.medcoresoft;

import java.sql.Timestamp;

/**
 * Created by vdorofeyev on 4/2/14.
 */
public class StudyEntity {
    private String studyInstanceUid;
    private String patientId;
    private Timestamp studyDate;

    public String getStudyInstanceUid() {
        return studyInstanceUid;
    }

    public void setStudyInstanceUid(String studyInstanceUid) {
        this.studyInstanceUid = studyInstanceUid;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public Timestamp getStudyDate() {
        return studyDate;
    }

    public void setStudyDate(Timestamp studyDate) {
        this.studyDate = studyDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudyEntity that = (StudyEntity) o;

        if (patientId != null ? !patientId.equals(that.patientId) : that.patientId != null) return false;
        if (studyDate != null ? !studyDate.equals(that.studyDate) : that.studyDate != null) return false;
        if (studyInstanceUid != null ? !studyInstanceUid.equals(that.studyInstanceUid) : that.studyInstanceUid != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = studyInstanceUid != null ? studyInstanceUid.hashCode() : 0;
        result = 31 * result + (patientId != null ? patientId.hashCode() : 0);
        result = 31 * result + (studyDate != null ? studyDate.hashCode() : 0);
        return result;
    }
}
