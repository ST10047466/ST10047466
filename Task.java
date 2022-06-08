package ProgPOE10047466;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ST10047466
 */
public class Task {
    // Constants declared.
    private final int DESC_LENGTH = 50;
    private final String[] STAT = {"To Do", "Doing", "Done"}; 
    
    // static variables declared.
    
    private static int taskCount = 0;
    private static int totalHours = 0;
    
    // standard variables declared.
    
    private String tName = "";
    private int tNum = 0;
    private String tDesc = "";
    private String tDev = "";
    private int tTime = 0;
    private String tID = "";
    private String tStat = "";

    
    
    public boolean checkTaskDescription() {
        if (gettDesc().length() <= DESC_LENGTH) {
            return true;
        } else {
            return false;
        }
    }

    public String createTaskID() {

        return (gettName().substring(0, 1) + ":" + gettNum() + ":" + gettDev().substring(gettDev().length() - 3)).toUpperCase();
    }

    public String printTaskDetails() {
        String returnedDetails
                = this.gettStat() + "\n"
                + this.gettDev() + "\n"
                + this.gettNum() + "\n"
                + this.gettName() + "\n"
                + this.gettDesc() + "\n"
                + this.gettID() + "\n"
                + this.gettTime();
        return returnedDetails;
    }

    public int returnTotalHours() {
        return Task.totalHours;
    }

    public void settTime(int tTime)
 {
     this.tTime = tTime;
     Task.totalHours = Task.totalHours + tTime;
 }
    public void settStat(int tSelection)
 {
     this.tStat = STAT[tSelection];
 }
    
    public void settNum()
{
      this.tNum = Task.taskCount;
    
    Task.taskCount++;
}
    /**
     * @return the taskCount
     */
    public static int getTaskCount() {
        return taskCount;
    }

    /**
     * @param aTaskCount the taskCount to set
     */
    public static void setTaskCount(int aTaskCount) {
        taskCount = aTaskCount;
    }

    /**
     * @return the totalHours
     */
    public static int getTotalHours() {
        return totalHours;
    }

    /**
     * @param aTotalHours the totalHours to set
     */
    public static void setTotalHours(int aTotalHours) {
        totalHours = aTotalHours;
    }

    /**
     * @return the tName
     */
    public String gettName() {
        return tName;
    }

    /**
     * @param tName the tName to set
     */
    public void settName(String tName) {
        this.tName = tName;
    }

    /**
     * @return the tNum
     */
    public int gettNum() {
        return tNum;
    }

    /**
     * @return the tDesc
     */
    public String gettDesc() {
        return tDesc;
    }

    /**
     * @param tDesc the tDesc to set
     */
    public void settDesc(String tDesc) {
        this.tDesc = tDesc;
    }

    /**
     * @return the tDev
     */
    public String gettDev() {
        return tDev;
    }

    /**
     * @param tDev the tDev to set
     */
    public void settDev(String tDev) {
        this.tDev = tDev;
    }

    /**
     * @return the tTime
     */
    public int gettTime() {
        return tTime;
    }

    /**
     * @return the tID
     */
    public String gettID() {
        return tID;
    }

    /**
     * @param tID the tID to set
     */
    public void settID(String tID) {
        this.tID = tID;
    }

    /**
     * @return the tStat
     */
    public String gettStat() {
        return tStat;
    }

}
