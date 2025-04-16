package com.example.actions;

import com.example.forms.ExampleForm;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.Action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ExampleAction extends Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
                                 HttpServletRequest request, HttpServletResponse response) {
        ExampleForm exampleForm = (ExampleForm) form;

        System.out.println(exampleForm.getExampleField());
        System.out.println(exampleForm.getMessage());
        
        // Forward to the success page
        return mapping.findForward("success");
    }
}