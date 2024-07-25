package net.media.training.live.srp;

public class ChangeFileFormate{
    public static String toHtml(Employee emp) {
        String str = "<div>" +
                "<h1>Employee Info</h1>" +
                "<div id='emp" + emp.getempId() + "'>" +
                "<span>" + emp.getname() + "</span>" +
                "<div class='left'>" +
                "<span>Leave Left :</span>" +
                "<span>Annual Salary:</span>" +
                "<span>Manager:</span>" +
                "<span>Reimbursable Leave:</span>" +
                "</div>";
        str += "<div class='right'><span>" + (emp.gettotalLeaveAllowed() - emp.getleaveTaken()) + "</span>";
        str += "<span>" + Math.round(emp.getmonthlySalary() * 12) + "</span>";
        if (emp.getmanager() != null) str += "<span>" + emp.getmanager() + "</span>";
        else str += "<span>None</span>";
        int years = 3;
        if (emp.getyearsInOrg() < 3) {
            years = emp.getyearsInOrg();
        }
        int totalLeaveLeftPreviously = 0;
        for (int i = 0; i < years; i++) {
            totalLeaveLeftPreviously += emp.getleavesLeftPreviously()[emp.getyearsInOrg()-i-1];
        }
        str += "<span>" + totalLeaveLeftPreviously + "</span>";
        return str + "</div> </div>";
    }
    //other method related to customer
}
