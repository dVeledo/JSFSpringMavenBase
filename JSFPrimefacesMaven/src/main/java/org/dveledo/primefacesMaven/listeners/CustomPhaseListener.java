package org.dveledo.primefacesMaven.listeners;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CustomPhaseListener implements PhaseListener {

	private static final long serialVersionUID = 7999672135124015029L;
	
	private static final Log log = LogFactory.getLog(CustomPhaseListener.class);

	@Override
	public void beforePhase(PhaseEvent event) {
        if (log.isTraceEnabled()){
            log.trace("BeforePhase: " + event.getPhaseId());
        }
    }
 
	@Override
    public void afterPhase(PhaseEvent event) {
        if (log.isTraceEnabled()){
            log.trace("AfterPhase: " + event.getPhaseId());
        }
    }

	@Override
	public PhaseId getPhaseId() {
		return PhaseId.ANY_PHASE;
	}

}
