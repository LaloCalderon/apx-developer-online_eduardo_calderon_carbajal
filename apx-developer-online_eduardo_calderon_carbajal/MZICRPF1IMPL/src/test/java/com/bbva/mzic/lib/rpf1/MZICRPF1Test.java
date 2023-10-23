package com.bbva.mzic.lib.rpf1;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.springframework.aop.framework.Advised;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bbva.elara.configuration.manager.application.ApplicationConfigurationService;
import com.bbva.elara.domain.transaction.Context;
import com.bbva.elara.domain.transaction.ThreadContext;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/META-INF/spring/MZICRPF1-app.xml",
		"classpath:/META-INF/spring/MZICRPF1-app-test.xml", "classpath:/META-INF/spring/MZICRPF1-arc.xml",
		"classpath:/META-INF/spring/MZICRPF1-arc-test.xml" })
public class MZICRPF1Test {

	@Spy
	private Context context;

	@Resource(name = "mzicRPF1")
	private MZICRPF1 mzicRPF1;

	@Resource(name = "applicationConfigurationService")
	private ApplicationConfigurationService applicationConfigurationService;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		context = new Context();
		ThreadContext.set(context);
		getObjectIntrospection();
	}

	private Object getObjectIntrospection() throws Exception {
		Object result = this.mzicRPF1;
		if (this.mzicRPF1 instanceof Advised) {
			Advised advised = (Advised) this.mzicRPF1;
			result = advised.getTargetSource().getTarget();
		}
		return result;
	}

	@Test
	public void executeTest() {
		// mzicRPF1.executeGetProductByID(1L);
		// Assert.assertEquals(0, context.getAdviceList().size());
	}

}
