package com.example.actions;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ExampleAction extends Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
        DynaActionForm exampleForm = (DynaActionForm) form;

        System.out.println(exampleForm.get("exampleField").equals(""));
        System.out.println(exampleForm.get("message").equals(""));
        
        // Forward to the success page
        return mapping.findForward("success");
    }
}