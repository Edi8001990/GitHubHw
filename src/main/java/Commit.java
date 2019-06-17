public class Commit {

    private String description;
    private String commitType;
    private Integer uniqueId;

    public Commit(String description, String commitType, Integer uniqueId){

        this.description = description;
        this.commitType = commitType;
        this.uniqueId = uniqueId;

    }

}
