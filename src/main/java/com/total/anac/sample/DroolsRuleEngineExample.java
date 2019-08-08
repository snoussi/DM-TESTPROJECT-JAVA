package com.total.anac.sample;

import com.total.anac.model.Sample;
import org.kie.api.KieBase;
import org.kie.api.KieServices;
import org.kie.api.builder.ReleaseId;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;


/**
 * This is a sample class to test DM.
 */
public class DroolsRuleEngineExample {

	public static final void main(String[] args) {
		try{
			KieServices ks = KieServices.Factory.get();
			ReleaseId releaseId = ks.newReleaseId("com.total.anac", "ProjetDeTest", "1.0.0-SNAPSHOT");
			KieContainer kieContainer = ks.newKieContainer(releaseId);
//			KieSession kieSession = kieContainer.newKieSession();
			KieBase kieBase = kieContainer.getKieBase();
			KieSession kieSession = kieBase.newKieSession();
			Sample sample = new Sample("green", 40.00, 0, 0);
			kieSession.insert(sample);
			System.out.println("************* Fire Rules **************");
			/*
			 * test_group_0 : fire the rules without using modify
			 * test_group_1 : fire the rules with using the option no-loop in all rules
			 * test_group_2 : fire the rules with using the option lock-on-active in the first rule
			 * test_group_3 : fire the rules with using the option lock-on-active in all rules
			 * test_group_4 : simple rule inference, no priority, no no-loop, no lock-on-active, last rule shouldn't
			 * update the working memory, but only the fact attributes
			 * test_group_5 : an example with a guided decision table + usage of a Metadata to display the rule order
			 */


			kieSession.getAgenda().getAgendaGroup("test_group_5").setFocus();
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