package io.druid.sample.emitter;

import java.io.IOException;

import com.metamx.common.lifecycle.LifecycleStart;
import com.metamx.common.lifecycle.LifecycleStop;
import com.metamx.common.logger.Logger;
import com.metamx.emitter.core.Emitter;
import com.metamx.emitter.core.Event;

public class SampleLoggingEmitter implements Emitter
{
  private static Logger log = new Logger(SampleLoggingEmitter.class);

  public SampleLoggingEmitter(String loggerName)
  {
    //ignoring the loggerName, it is sample code... right?
  }

  @Override
  @LifecycleStart
  public void start()
  {
    log.info("Starting Emitter.");
  }

  @Override
  public void emit(Event event)
  {
    log.info("Emitting event " + event);
  }

  @Override
  public void flush() throws IOException
  {
    log.info("Flushing Emitter.");
  }

  @Override
  @LifecycleStop
  public void close() throws IOException
  {
    log.info("Closing Emitter.");
  }
}
