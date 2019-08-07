package com.total.anac.sample;

import org.kie.api.KieServices;
import org.kie.api.builder.ReleaseId;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.total.anac.model.Sample;


/**
 * This is a sample class to test DM.
 */
public class DroolsRuleEngineExample {

	public static final void main(String[] args) {
		try{
			KieServices ks = KieServices.Factory.get();
			ReleaseId releaseId = ks.newReleaseId("com.myspace", "ProjetdeTest", "1.0.0-SNAPSHOT");
			KieContainer kieContainer = ks.newKieContainer(releaseId);
			KieSession kieSession = kieContainer.newKieSession();
			Sample sample = new Sample("green", 40.00, 0, 0);
			kieSession.insert(sample);
			System.out.println("************* Fire Rules **************");
			/*
			 * test_group_0 : fire the rules without using modify
			 * test_group_1 : fire the rules with using the option no-loop in all rules
			 * test_group_2 : fire the rules with using the option lock-on-active in the first rule
			 * test_group_3 : fire the rules with using the option lock-on-active in all rules
			 */
			kieSession.getAgenda().getAgendaGroup("test_group_1").setFocus();
			kieSession.fireAllRules();
			kieSession.dispose();
			System.out.println(sample);
			System.out.println("************************************");
		} catch (Throwable t) {
			System.err.println(t);
			t.printStackTrace();
		}
	}
}