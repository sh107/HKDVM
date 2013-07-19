/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hkdvm;

/**
 *
 * @author Sijin
 */
public class Data {

    private String trialName;
    private String geneSymbol;
    private int patientId;
    private String probeSet;
    private double pValue;
    private String subjectId;
    private double rawIntensity;
    private double logIntensity;
    private double zScore;

    public String getGeneSymbol() {
        return geneSymbol;
    }

    public void setGeneSymbol(String geneSymbol) {
        this.geneSymbol = geneSymbol;
    }

    public double getLogIntensity() {
        return logIntensity;
    }

    public void setLogIntensity(double logIntensity) {
        this.logIntensity = logIntensity;
    }

    public double getpValue() {
        return pValue;
    }

    public void setpValue(double pValue) {
        this.pValue = pValue;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getProbeSet() {
        return probeSet;
    }

    public void setProbeSet(String probeSet) {
        this.probeSet = probeSet;
    }

    public double getRawIntensity() {
        return rawIntensity;
    }

    public void setRawIntensity(double rawIntensity) {
        this.rawIntensity = rawIntensity;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getTrialName() {
        return trialName;
    }

    public void setTrialName(String trialName) {
        this.trialName = trialName;
    }

    public double getzScore() {
        return zScore;
    }

    public void setzScore(double zScore) {
        this.zScore = zScore;
    }

    


}
