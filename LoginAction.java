public class LoginAction extends Action {
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
    HttpServletRequest request, HttpServletResponse response)
    throws Exception {
        LoginForm loginForm = (LoginForm)form;
        if(loginForm.getUsername() == null || loginForm.getPassword() == null ||
        !loginForm.getUsername().equalsIgnoreCase("rahul") || !loginForm.getPassword().equals("abc")){
            return mapping.findForward("failure");
        }
        else
            return mapping.findForward("success");
    }
}
