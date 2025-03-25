class ManagementTeamMember extends UserConcrete {
    public ManagementTeamMember(String email, String username, String password) {
        super(email, username, password, "Management Team");
    }
}
