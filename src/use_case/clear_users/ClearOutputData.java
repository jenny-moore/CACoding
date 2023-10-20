package use_case.clear_users;

public class ClearOutputData {
    private boolean useCaseFailed;

    private String[] users;

    public ClearOutputData(boolean useCaseFailed, String[] users) {
        this.useCaseFailed = useCaseFailed;
        this.users = users;
    }
    public String[] getUsers(){
        return this.users;
    }

    public void setUsers(String[] users){
        this.users = users;
    }
}
