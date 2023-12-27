package ClasessUIS;

public class ResearchAssociate extends Employee {

    protected String teachingPosition;
    protected Project[] projects;

    public ResearchAssociate(int ssNo, String name, String teachingPosition) {
        this.ssNo = ssNo;
        this.name = name;
        this.teachingPosition = teachingPosition;
    }

    public String getTeachingPosition() {
        return this.teachingPosition;
    }

    public void setFieldOfStudy(String teachingPosition) {
        this.teachingPosition= teachingPosition;
    }

    public Project[] getProjects() {
        return this.projects;
    }

    public void setProjects(Project[] projects) {
        this.projects = projects;
    }

    public void startProject(Project project) {
        // TODO - implement ResearchAssociate.startProject
        throw new UnsupportedOperationException();
    }

    public void finishProject(Project project) {
        // TODO - implement ResearchAssociate.finishProject
        throw new UnsupportedOperationException();
    }

}