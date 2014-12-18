package org.aim.description.extension;

import org.aim.description.probes.MeasurementProbe;
import org.aim.description.scopes.MemoryScope;
import org.aim.description.scopes.MethodsEnclosingScope;
import org.aim.description.scopes.SynchronizedScope;

/**
 * Utility Class wrapping commonly used Measurement Probes..
 * 
 * @author Alexander Wert
 * 
 */
public final class CommonlyUsedProbes {

	public static final MeasurementProbe<MethodsEnclosingScope> RESPONSE_TIME_PROBE = new MeasurementProbe<MethodsEnclosingScope>(
			"ResponseTimeProbe");
	public static final MeasurementProbe<MethodsEnclosingScope> TRACING_PROBE = new MeasurementProbe<MethodsEnclosingScope>("TracingProbe");
	public static final MeasurementProbe<MemoryScope> MEMORY_FOOTPRINT_PROBE = new MeasurementProbe<MemoryScope>(
			"MemoryFoortprintProbe");
	public static final MeasurementProbe<SynchronizedScope> WAITING_TIME_PROBE = new MeasurementProbe<SynchronizedScope>(
			"WaitingTimeProbe");

	private CommonlyUsedProbes() {
		// should not be instantiated
	}

}
