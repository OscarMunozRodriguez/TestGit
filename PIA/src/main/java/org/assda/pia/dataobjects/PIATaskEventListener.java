package org.assda.pia.dataobjects;

import java.util.logging.Logger;

import org.jbpm.services.task.events.DefaultTaskEventListener;
import org.kie.api.task.TaskEvent; 

public class PIATaskEventListener extends DefaultTaskEventListener{ 

    static final long serialVersionUID = 1L;

    public PIATaskEventListener() {
    }

	@Override
	public void afterTaskActivatedEvent(TaskEvent arg0) {
	}

	@Override
	public void afterTaskAddedEvent(TaskEvent taskStart) {
		System.out.println("Se acaba de crear la instancia de la tarea " + taskStart.getTask().getId());
    	System.out.println("La instancia del proceso asociado a la tarea es "+  taskStart.getTask().getTaskData().getProcessInstanceId());

	}
}

