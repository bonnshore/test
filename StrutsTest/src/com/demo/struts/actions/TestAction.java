package com.demo.struts.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.demo.struts.forms.TestForm;

public class TestAction extends DispatchAction {

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		ActionErrors errors = new ActionErrors();
		ActionForward forward = new ActionForward();
		TestForm testForm = (TestForm) form;

		try {
			// ȡ�ñ�����
			String str1 = testForm.getStr1();
			String str2 = testForm.getStr2();
			
			//����JavaBeanִ�д����߼�
		} catch (Exception e) {
		}
		
		//���ݴ����߼����سɹ���ʧ�ܵ�ҳ��
		if (!errors.isEmpty()) {
			saveErrors(request, errors);
			forward = mapping.findForward("failure");
		} else {
			forward = mapping.findForward("success");
		}
		return forward;
	}
}
